package com.kory0115.kiosk

import android.annotation.SuppressLint
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.text.SimpleDateFormat


class menuList {
    @SuppressLint("SimpleDateFormat")
    fun menuResult(
        currentMoney: Int,
        resultMoney: Int,
        list: List<Pair<String, Int>>,
        saleCount: Int
    ) {

        println("=====영수증=====\n")
        for (i in list.indices) {
            println("음식명: ${list[i].first}, 가격: ${list[i].second}")
        }
        println("계산하실 돈은 ${resultMoney}원 입니다.")
        println("총 ${saleCount}원 할인되셨습니다.")

        if(currentMoney - resultMoney < 0) {
            println("결제 할수없습니다!!. \n다른카드를 사용해주세요!!")
        }
        println("계산후 남은돈은 ${currentMoney - resultMoney}원 입니다.")

        println("현재결제 시각은 : \n${SimpleDateFormat("yyyy-MM-dd \nhh:mm:ss").format(System.currentTimeMillis())}입니다.")
    }

    @SuppressLint("SimpleDateFormat")
    fun clock() {
        runBlocking {
            println("현재시각은 ${SimpleDateFormat("yyyy-MM-dd \nhh:mm:ss").format(System.currentTimeMillis())}입니다")
            delay(3000)
        }
    }
}