package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent.*
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        change_activity.setOnClickListener {
//            //this@Intent1에서 @Intent1은 생략해도됨 this가 Intent1을 가르키기 때문.
//            //하지만 오류가 나는 경우도 있기 때문에, @뒷부분을 끝까지 써주는게 좋음.
//            // 명시적 인텐트
//            val intent = Intent(this@Intent1,Intent2::class.java)
//
//            // Key, Value 방식 -> Key와 Value를 쌍으로 만들어 저장한다. -> Dictionary
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivity(intent);

//            // 명시적 인텐트
//            val intent2 = Intent(this@Intent1,Intent2::class.java)
//            // Apply -> 묶음?
//            intent2.apply {
//                this.putExtra("number1", 1)
//                this.putExtra("number2", 2)
//            }
//            // - 요청의 종류
//            //      - 전달만 하는 요청
//            //startActivity(intent2)
//            //      - 리턴을 받는 요청
//            startActivityForResult(intent2, 200)

            // 암시적 인텐트
            val intent3 = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(intent3)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == 200){
            Log.d("number", ""+requestCode)
            Log.d("number", ""+resultCode)
            val result = data?.getIntExtra("result",0)
            Log.d("number", ""+result)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}