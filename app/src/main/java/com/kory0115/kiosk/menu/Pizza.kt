package com.kory0115.kiosk.menu

import com.kory0115.kiosk.menuEntity.MenuEntity
import com.kory0115.kiosk.menuEntity.MenuList


abstract class Pizza() {
    abstract val name: String
    abstract val price: Int
    abstract val event: Boolean
    abstract val saleCount: Int

    abstract fun pizzaList(): MenuEntity
}

class PPizza(num : Int) : Pizza() {
    override val name: String = MenuList().pizzaList()[num - 1].name
    override val price: Int = MenuList().pizzaList()[num - 1].price
    override val event: Boolean = MenuList().pizzaList()[num - 1].event
    override val saleCount: Int = MenuList().pizzaList()[num - 1].saleCount

    override fun pizzaList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

/*class BeefPizza() : Pizza() {
    override val name: String = MenuList().pizzaList()[1].name
    override val price: Int = MenuList().pizzaList()[1].price
    override val event: Boolean = MenuList().pizzaList()[1].event
    override val saleCount: Int = MenuList().pizzaList()[1].saleCount

    override fun pizzaList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class ComBiNationPizza() : Pizza() {
    override val name: String = MenuList().pizzaList()[2].name
    override val price: Int = MenuList().pizzaList()[2].price
    override val event: Boolean = MenuList().pizzaList()[2].event
    override val saleCount: Int = MenuList().pizzaList()[2].saleCount

    override fun pizzaList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}*/




