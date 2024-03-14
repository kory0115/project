package com.kory0115.kiosk.menu

import com.kory0115.kiosk.menuEntity.MenuEntity
import com.kory0115.kiosk.menuEntity.MenuList

abstract class Chicken() {
    abstract val name: String
    abstract val price: Int
    abstract val event: Boolean
    abstract val saleCount: Int
    abstract fun chickenList(): MenuEntity
}

class CChicken(num: Int) : Chicken() {
    override val name: String = MenuList().chickenList()[num - 1].name
    override val price: Int = MenuList().chickenList()[num - 1].price
    override val event: Boolean = MenuList().chickenList()[num - 1].event
    override val saleCount: Int = MenuList().chickenList()[num - 1].saleCount

    override fun chickenList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

/*class HotChicken() : Chicken() {
    override val name: String = MenuList().chickenList()[1].name
    override val price: Int = MenuList().chickenList()[1].price
    override val event: Boolean = MenuList().chickenList()[1].event
    override val saleCount: Int = MenuList().chickenList()[1].saleCount

    override fun chickenList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class SoySauceChicken() : Chicken() {
    override val name: String = MenuList().chickenList()[2].name
    override val price: Int = MenuList().chickenList()[2].price
    override val event: Boolean = MenuList().chickenList()[2].event
    override val saleCount: Int = MenuList().chickenList()[2].saleCount

    override fun chickenList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}*/