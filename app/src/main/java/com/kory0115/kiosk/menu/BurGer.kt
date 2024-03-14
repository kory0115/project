package com.kory0115.kiosk.menu

import com.kory0115.kiosk.menuEntity.*

abstract class BurGer() {
    abstract val name: String
    abstract val price: Int
    abstract val event: Boolean
    abstract val saleCount: Int

    abstract fun hamBurGer(): MenuEntity
}

class BBurGer(num: Int) : BurGer() {
    override val name: String = MenuList().burgerList()[num - 1].name
    override val price: Int = MenuList().burgerList()[num - 1].price
    override val event: Boolean = MenuList().burgerList()[num - 1].event
    override val saleCount: Int = MenuList().burgerList()[num - 1].saleCount

    override fun hamBurGer() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

/*class BeefBurGer() : BurGer() {
    override val name: String = MenuList().burgerList()[1].name
    override val price: Int = MenuList().burgerList()[1].price
    override val event: Boolean = MenuList().burgerList()[1].event
    override val saleCount: Int = MenuList().burgerList()[1].saleCount

    override fun hamBurGer() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class ChickenBurGer() : BurGer() {
    override val name: String = MenuList().burgerList()[2].name
    override val price: Int = MenuList().burgerList()[2].price
    override val event: Boolean = MenuList().burgerList()[2].event
    override val saleCount: Int = MenuList().burgerList()[2].saleCount

    override fun hamBurGer() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}*/




