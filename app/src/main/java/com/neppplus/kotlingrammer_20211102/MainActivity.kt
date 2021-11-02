package com.neppplus.kotlingrammer_20211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnVaiable01.setOnClickListener {




        val maName :String
        var myheight : Doble

//        2. 변수에 데이터 대입

        myName = "조경진"
        myHeight = 180.7

//         변수의 데이터 변경
//        myName = "KJ CHO" //val 변수는 변경 불가능
        myHeight = 175.7

//        3.데이터 활용
        log.d("이름", myname)
        log.d("키", myHeigt.tostring())
    }
        btnVaiable02.setOnClickListener {

            val myBirthYear = 1988
            Log.d("출생년도",myBirthYear.toString())


//            2021년의 나이는 몇살?
            val myKoreanAge = 2021 - myBirthYear +1 //변수를 대입할 때, 기능실행(계산식)의 결과를 바로 대입 가능

            Log.d("나이",myKoreanAge.toString())

        }
} }
