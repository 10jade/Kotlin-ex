package com.example.a1027.kotlinandroiddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // textview에 대한 참조를 얻는다.
//        val tv_click_me = findViewById(R.id.tv_click_me) as TextView
//        // 클릭 리스너 설정
//        tv_click_me.setOnClickListener {
//            // 사용자가 TextView를 클릭 할 때 수행 할 코드
//            Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()

             // 버튼에 대한 참조 가져 오기
             val btn_click_me = findViewById(R.id.btn_click_me) as Button
             // 클릭하여 listener를 설정합니다.
             btn_click_me.setOnClickListener {
            // 사용자가 버튼을 클릭 할 때 수행 할 코드
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}

