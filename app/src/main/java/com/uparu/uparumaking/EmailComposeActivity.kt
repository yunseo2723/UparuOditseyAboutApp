package com.uparu.uparumaking

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class EmailComposeActivity : AppCompatActivity() {

    private val PICK_IMAGE_REQUEST = 1
    private var selectedImageUri: Uri? = null
    private lateinit var attachImageButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_compose)

        // 사진을 첨부하기 위한 버튼 클릭 핸들러

        attachImageButton = findViewById<ImageButton>(R.id.attachImageButton)
        attachImageButton.setOnClickListener {
            openImageChooser()
        }

        // 전송 버튼 클릭 핸들러
        val sendButton = findViewById<ImageButton>(R.id.sendButton)
        sendButton.setOnClickListener {
            sendEmail()
        }
    }

    // 갤러리에서 이미지 선택
    private fun openImageChooser() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val layoutParams = attachImageButton.layoutParams
        layoutParams.width = 1000 // 가로 크기
        layoutParams.height = 1000 // 세로 크기
        attachImageButton.layoutParams = layoutParams
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            selectedImageUri = data?.data
            selectedImageUri?.let {
                // 이미지 버튼에 선택한 이미지 설정
                attachImageButton.setImageURI(it)
            }
        }
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
        } catch (e: ActivityNotFoundException) {
            // 구글 이메일 앱이 설치되어 있지 않을 경우 처리
            // 다른 조치를 취하거나 사용자에게 앱 설치를 안내할 수 있음
            startActivity(Intent.createChooser(emailIntent, "조합법 전송하기"))
        }
    }
}
