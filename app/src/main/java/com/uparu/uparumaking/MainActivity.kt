package com.uparu.uparumaking

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseRemoteConfig: FirebaseRemoteConfig

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // SharedPreferences 초기화
        val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        sharedPreferences.edit().clear().apply()
        val editor = sharedPreferences.edit()

        editor.clear() // 모든 데이터를 삭제
        editor.apply()

        setContentView(R.layout.activity_main)  //activity_main이 옆에 xml임
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        firebaseRemoteConfig = FirebaseRemoteConfig.getInstance()
        val configSettings = FirebaseRemoteConfigSettings.Builder()
            .setMinimumFetchIntervalInSeconds(3600) // 캐시된 값을 가져올 시간 간격 설정
            .build()
        firebaseRemoteConfig.setConfigSettingsAsync(configSettings)
        firebaseRemoteConfig.setDefaultsAsync(R.xml.remote_config_defaults)
        firebaseRemoteConfig.fetchAndActivate()
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    checkForUpdate()
                } else {
                    // 에러 로그 출력 또는 사용자에게 에러 알림
                }
            }

        val textView = findViewById<TextView>(R.id.versionComment)

        val appVersion = packageManager.getPackageInfo(packageName, 0).versionName
        textView.text = "ver $appVersion"

        val imgbutton1 = findViewById<ImageButton>(R.id.imageButton1)   //조합법 버튼
        imgbutton1.setOnClickListener {
            // 새로운 액티비티로 이동
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val imgbutton2 = findViewById<ImageButton>(R.id.imageButton2)   //조합시간 버튼
        imgbutton2.setOnClickListener {
            // 새로운 액티비티로 이동
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        val imgbutton3 = findViewById<ImageButton>(R.id.imageButton3)   //가상조합 버튼
        imgbutton3.setOnClickListener {
            // 새로운 액티비티로 이동
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }

        val imgbutton4 = findViewById<ImageButton>(R.id.imageButton4)   //조합법 제보 버튼
        imgbutton4.setOnClickListener {
            // 새로운 액티비티로 이동
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }

        val imgbutton5 = findViewById<ImageButton>(R.id.imageButton5)   //조합법 제보 버튼
        imgbutton5.setOnClickListener {
            // 새로운 액티비티로 이동
            val intent = Intent(this, EmailComposeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun checkForUpdate() {
        val currentVersionName = packageManager.getPackageInfo(packageName, 0).versionName
        val newVersionName = firebaseRemoteConfig.getString("newVersion")

        if (newVersionName != currentVersionName) {
            showUpdateDialog()
        }
    }

    private fun showUpdateDialog() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("새로운 정보가 업데이트되었습니다")
        alertDialogBuilder.setMessage("지금 업데이트하시겠습니까?")

        alertDialogBuilder.setPositiveButton("업데이트") { _, _ ->
            // Play Store로 이동
            val appPackageName = packageName
            try {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$appPackageName")))
            } catch (_: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")))
            }
        }

        alertDialogBuilder.setNegativeButton("나중에") { dialog, _ ->
            dialog.dismiss()
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}