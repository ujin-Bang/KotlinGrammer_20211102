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


            val myName: String
            var myHeight: Double

//        2. 변수에 데이터 대입

            myName = "조경진"
            myHeight = 180.7

//         변수의 데이터 변경
//        myName = "KJ CHO" //val 변수는 변경 불가능
            myHeight = 175.7

//        3.데이터 활용
            log.d("이름", myName)
            log.d("키", myHeight.toString())
        }
        btnVaiable02.setOnClickListener {

            val myBirthYear = 1988
            Log.d("출생년도", myBirthYear.toString())


//            2021년의 나이는 몇살?
            val myKoreanAge = 2021 - myBirthYear + 1 //변수를 대입할 때, 기능실행(계산식)의 결과를 바로 대입 가능

            Log.d("나이", myKoreanAge.toString())

        }
        btncodition01.setOnClickListener {

            val myAge = 34
            if (myAge >= 20) {

//                질문내용이 맞으면 실행될 코드
                Log.d("나이검사", "성인입니다.")
            } else if (myAge >= 17) {
                Log.d("나이검사", "고등학생이니다")
            } else if (myAge >= 14) {
                Log.d("나이검사", "중학생입니다.")
            } else {
                Log.d("나이검사", "초등학생입니다")
            }

            btncodition02.setOnClickListener {

                val aCompanySalary = 5800
                val aCompanyMinut = 20
                val aCompanyFinishEalry = true

//            1번 지원자는 A회사에 취업할까?
//            연봉만 5천 이상이면 ok
                if (aCompanySalary >= 5000) {
                    Log.d("1번지원자", "취업ok")
                } else {
                    Log.d("1번지원자", "다른회사")
                }
                //2번지원자는 출퇴근이 10분 이내면 취업
                if (aCompanyMinut <= 10) {
                    Log.d("2번지원자", "취업ok")

                } else {
                    Log.d("2번지원자", "다른회사")

                }
//            3번 지원자는 칼퇴하는 회사면 취업
                if (aCompanySalary) {
                    Log.d("3번지원자", "취업ok")

                } else {
                    Log.d("3번지원자", "다른회사")

                }
                //4번 지원자 연봉이 4천 이상, 거리도 10분 이내
                if (aCompanySalary >= 4000 && aCompanyMinut <= 10) {
                    Log.d("4번지원자", "취업ok")

                } else {
                    Log.d("4번지원자", "다른회사")

                }
//            5번지원자는 거리가 20분 이내거나, 칼퇴하거나
                if (aCompanyMinut <= 20 || aCompanyFinishEalry) {
                    Log.d("5번지원자", "취업ok")

                } else {
                    Log.d("5번지원자", "다른회사")

                }
            }
        }
    }
}

