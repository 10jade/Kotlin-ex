package com.example.a1027.kotlinandroiddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout


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

        val ll_main = findViewById(R.id.ll_main_layout) as LinearLayout

        // 버튼 만들기
        val button_dynamic = Button(this)
        // 레이아웃 매개 변수를 사용하여 layout_width 및 layout_height 설정
        button_dynamic.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        button_dynamic.text = "Dynamic Button"
        // LinearLayout에 Button을 추가한다.
        ll_main.addView(button_dynamic)

        }
    }


