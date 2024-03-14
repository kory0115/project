package com.kory0115.kiosk.menu

import com.kory0115.kiosk.menuEntity.MenuEntity
import com.kory0115.kiosk.menuEntity.pizzaMenuList

abstract class Chicken() {
    abstract val name: String
    abstract val price: Int
    abstract val event: Boolean
    abstract val saleCount: Int
    abstract fun chickenList(): MenuEntity
}

class OriginalChicken(override val name: String) : Chicken() {
    override val price: Int = 10000
    override val event: Boolean = true
    override val saleCount: Int = 3000

    override fun chickenList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class HotChicken(override val name: String) : Chicken() {
    override val price: Int = 12000
    override val event: Boolean = true
    override val saleCount: Int = 3000


    override fun chickenList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class SoySauceChicken(override val name: String) : Chicken() {
    override val price: Int = 11500
    override val event: Boolean = true
    override val saleCount: Int = 3000

    override fun chickenList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}