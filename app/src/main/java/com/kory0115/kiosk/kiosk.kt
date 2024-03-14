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
                    val choice = CheeseBurGer("치즈버거").hamBurGer()
                    println("가격: ${choice.price}")

                    println("할인: ${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }

                } else if(menu2 == 2){
                    val choice = BeefBurGer("불고기버거").hamBurGer()

                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }
                } else if(menu2 == 3) {
                    val choice = ChickenBurGer("치킨버거").hamBurGer()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }
                } else {
                    continue
                }
            }
            2 -> {
                println("피자 종류: \n1. 치즈피자 | $10\n2. 불고기피자 | $12\n3. 콤비네이션피자 | $11.5\netc: 메뉴로 돌아가기")
                val menu2 = readLine()?.toInt()

                if(menu2 == 1) {
                    val choice = CheesePizza("치즈피자").pizzaList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }

                } else if(menu2 == 2){
                    val choice = BeefPizza("불고기피자").pizzaList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }
                } else if(menu2 == 3) {
                    val choice = ComBiNationPizza("콤비네이션피자").pizzaList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }
                } else {
                    continue
                }
            }
            3 -> {
                println("햄버거 종류: \n1. 후라이드치킨 | $10\n2. 양념치킨 | $12\n3. 간장치킨 | $11.5\netc: 메뉴로 돌아가기")
                val menu2 = readLine()?.toInt()

                if(menu2 == 1) {
                    val choice = OriginalChicken("후라이드치킨").chickenList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }

                } else if(menu2 == 2){
                    val choice = HotChicken("양념치킨").chickenList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }
                } else if(menu2 == 3) {
                    val choice = SoySauceChicken("간장치킨").chickenList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()!!.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }
                } else {
                    continue
                }
            }
            4 -> {
                println("햄버거 종류: \n1. 콜라 | $2.0\n2. 사이다 | $2.0\n3. 주류 | $4.0\netc: 메뉴로 돌아가기")
                val menu2 = readLine()?.toInt()

                if(menu2 == 1) {
                    val choice = Cola("콜라").drinkList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }

                } else if(menu2 == 2){
                    val choice = Sprite("사이다").drinkList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }
                } else if(menu2 == 3) {
                    val choice = Alcohol("주류").drinkList()
                    println("${choice.price}")
                    println("${choice.saleCount}원 할인되었습니다.")
                    result += choice.price
                    resultSale += choice.saleCount

                    foodList.add(Pair(choice.name, choice.price))

                    println("메뉴를 추가로 선택하시겠습니까? 1.yes 2.no")
                    val menu3 = readLine()?.toInt()

                    if(menu3 == 1) {
                        menuList().clock()
                        continue
                    } else {
                        menuList().menuResult(money, result ,foodList, resultSale)
                        break
                    }
                } else {
                    continue
                }
            }
            5 -> {
                menuList().menuResult(money, result, foodList, resultSale)
                break
            }
            6 -> {
                break
            }
        }
    }
}