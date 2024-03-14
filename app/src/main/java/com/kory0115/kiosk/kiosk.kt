package com.kory0115.kiosk

import com.kory0115.kiosk.menu.*

fun main() {
    var result = 0
    var resultSale = 0
    val foodList = mutableListOf<Pair<String, Int>>()


    println("현재 소지하고있는 잔액을 적어주세요: ")
    val money = readLine()!!.toInt()

    while(true) {
        println("===메뉴를 선택하세요=== \n[1.햄버거] \n[2.피자] \n[3.치킨] \n[4.음료수] \n[5.계산] \n[6.나가기]")

        when(readLine()!!.toInt()) {
            1 -> {
                println("햄버거 종류: \n1. 치즈버거 | $2.5\n2. 불고기버거 | $3.0\n3. 치킨버거 | $3.0\netc: 메뉴로 돌아가기")
                val menu2 = readLine()?.toInt()

                if(menu2 == 1) {
                    val choice = BBurGer(menu2).hamBurGer()
                    println("가격: ${choice.price}")

                    println("할인: ${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }

                } else if(menu2 == 2){

                    val choice = BBurGer(menu2).hamBurGer()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }
                } else if(menu2 == 3) {
                    val choice = BBurGer(menu2).hamBurGer()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }
                } else {
                    continue
                }
            }
            2 -> {
                println("피자 종류: \n1. 치즈피자 | $10\n2. 불고기피자 | $12\n3. 콤비네이션피자 | $11.5\netc: 메뉴로 돌아가기")
                val menu2 = readLine()?.toInt()

                if(menu2 == 1) {
                    val choice = PPizza(menu2).pizzaList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }

                } else if(menu2 == 2){
                    val choice = PPizza(menu2).pizzaList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }
                } else if(menu2 == 3) {
                    val choice = PPizza(menu2).pizzaList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }
                } else {
                    continue
                }
            }
            3 -> {
                println("치킨종류: \n1. 후라이드치킨 | $10\n2. 양념치킨 | $12\n3. 간장치킨 | $11.5\netc: 메뉴로 돌아가기")
                val menu2 = readLine()?.toInt()

                if(menu2 == 1) {
                    val choice = CChicken(menu2).chickenList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }

                } else if(menu2 == 2){
                    val choice = CChicken(menu2).chickenList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }
                } else if(menu2 == 3) {
                    val choice = CChicken(menu2).chickenList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))
                    result -= resultSale

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }
                } else {
                    continue
                }
            }
            4 -> {
                println("햄버거 종류: \n1. 콜라 | $2.0\n2. 사이다 | $2.0\n3. 주류 | $4.0\netc: 메뉴로 돌아가기")
                val menu2 = readLine()?.toInt()

                if(menu2 == 1) {
                    val choice = DDrink(menu2).drinkList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }

                } else if(menu2 == 2){
                    val choice = DDrink(menu2).drinkList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }
                } else if(menu2 == 3) {
                    val choice = DDrink(menu2).drinkList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += (choice.price - choice.saleCount)
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        val trust = menuList().menuResult(money, result ,foodList, resultSale)
                        if(trust) break else {
                            println("음식선택을 초기화 하겠습니다.")
                            foodList.clear()
                            result = 0
                            resultSale = 0
                            continue
                        }
                    }
                } else {
                    continue
                }
            }
            5 -> {
                val trust = menuList().menuResult(money, result ,foodList, resultSale)
                if(trust) break else {
                    println("음식선택을 초기화 하겠습니다.")
                    foodList.clear()
                    result = 0
                    resultSale = 0
                    continue
                }
            }
            6 -> {
                break
            }
        }
    }
}
