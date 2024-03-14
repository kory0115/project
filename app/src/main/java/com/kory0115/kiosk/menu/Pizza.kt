package com.kory0115.kiosk.menu

import com.kory0115.kiosk.menuEntity.MenuEntity


abstract class Pizza() {
    abstract val name: String
    abstract val price: Int
    abstract val event: Boolean
    abstract val saleCount: Int

    abstract fun pizzaList(): MenuEntity
}

class CheesePizza(override val name: String) : Pizza() {
    override val price: Int = 10000
    override val event: Boolean = true
    override val saleCount: Int = 2000

    override fun pizzaList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class BeefPizza(override val name: String) : Pizza() {
    override val price: Int = 12000
    override val event: Boolean = false
    override val saleCount: Int = 2000

    override fun pizzaList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class ComBiNationPizza(override val name: String) : Pizza() {
    override val price: Int = 11500
    override val event: Boolean = false
    override val saleCount: Int = 2000

    override fun pizzaList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}




