package com.uparu.uparumaking

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class EmailComposeActivity : AppCompatActivity() {

    private var selectedImageUri: Uri? = null
    private lateinit var attachImageButton: ImageButton
    private lateinit var sendButton: ImageButton
    private lateinit var imagePickerLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_compose)

        // 📌 버튼 연결
        attachImageButton = findViewById(R.id.attachImageButton)
        sendButton = findViewById(R.id.sendButton)

        // ✅ Activity Result API 등록
        imagePickerLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == RESULT_OK && result.data != null) {
                selectedImageUri = result.data!!.data
                selectedImageUri?.let { uri ->
                    // 버튼 크기 조정
                    val layoutParams = attachImageButton.layoutParams
                    layoutParams.width = 1000
                    layoutParams.height = 1000
                    attachImageButton.layoutParams = layoutParams

                    // 이미지 버튼에 선택한 이미지 설정
                    attachImageButton.setImageURI(uri)
                }
            }
        }
        // 📸 이미지 선택 버튼 클릭
        attachImageButton.setOnClickListener {
            openImageChooser()
        }

        // 📩 이메일 전송 버튼 클릭
        sendButton.setOnClickListener {
            sendEmail()
        }
    }
    // 갤러리에서 이미지 선택
    private fun openImageChooser() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        imagePickerLauncher.launch(intent)
    }

    // 이메일 보내기
    private fun sendEmail() {
        val recipientEmail = "uparuyunseo@gmail.com"
        val subject = "우파루 오딧세이 정보"
        val message = "<우파루 오딧세이 관련 정보를 전송해주셔서 감사합니다. \n앱에 없는 정보나 건의사항을 보내주세요.>\n\n제공자 닉네임: \n\n사진 정보(ex:조합법, 기타 정보 등): \n\n추가 설명: "

        val emailIntent = Intent(Intent.ACTION_SEND)
        emailIntent.type = "text/plain"
        emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(recipientEmail))
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
        emailIntent.putExtra(Intent.EXTRA_TEXT, message)

        // 이미지를 첨부
        if (selectedImageUri != null) {
            emailIntent.putExtra(Intent.EXTRA_STREAM, selectedImageUri)
            emailIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }

        emailIntent.`package` = "com.google.android.gm"
        // 이메일 앱 실행
        try {
            startActivity(emailIntent)
        } catch (_: ActivityNotFoundException) {
            startActivity(Intent.createChooser(emailIntent, "조합법 전송하기"))
        }
    }
}
