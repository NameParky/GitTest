package com.example.mygittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mygittest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // init 미루기.
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 위에 선언한 binding을 초기화시킨다.
        binding = ActivityMainBinding.inflate(layoutInflater)
        // 초기화 시킨 바인딩 내용을 루트로써 활용.
        setContentView(binding.root)

        var gitText = binding.gitText
        gitText.setOnClickListener {
            // 이부분이 수정될 곳입니다.
            gitText.setText("여기는 gitTest 브랜치입니다.")
            gitText.text = "깃테스트 텍스트 또또 변경!!"
        }
    }
}
