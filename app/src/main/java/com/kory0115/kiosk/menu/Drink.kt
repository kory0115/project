package com.kory0115.kiosk.menu

import com.kory0115.kiosk.menuEntity.MenuEntity
import com.kory0115.kiosk.menuEntity.MenuList

abstract class Drink() {
    abstract val name: String
    abstract val price: Int
    abstract val event: Boolean
    abstract val saleCount: Int
    abstract fun drinkList(): MenuEntity
}

class DDrink(num: Int) : Drink() {
    override val name: String = MenuList().drinkList()[num - 1].name
    override val price: Int = MenuList().drinkList()[num - 1].price
    override val event: Boolean = MenuList().drinkList()[num - 1].event
    override val saleCount: Int = MenuList().drinkList()[num - 1].saleCount

    override fun drinkList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

/*class Sprite() : Drink() {
    override val name: String = MenuList().drinkList()[1].name
    override val price: Int = MenuList().drinkList()[1].price
    override val event: Boolean = MenuList().drinkList()[1].event
    override val saleCount: Int = MenuList().drinkList()[1].saleCount

    override fun drinkList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class Alcohol() : Drink() {
    override val name: String = MenuList().drinkList()[2].name
    override val price: Int = MenuList().drinkList()[2].price
    override val event: Boolean = MenuList().drinkList()[2].event
    override val saleCount: Int = MenuList().drinkList()[2].saleCount

    override fun drinkList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}*/