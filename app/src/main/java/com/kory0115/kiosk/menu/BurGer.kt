package com.kory0115.kiosk.menu

import com.kory0115.kiosk.menuEntity.MenuEntity

abstract class BurGer() {
    abstract val name: String
    abstract val price: Int
    abstract val event: Boolean
    abstract val saleCount: Int

    abstract fun hamBurGer(): MenuEntity
}

class CheeseBurGer(override val name: String) : BurGer() {
    override val price: Int = 2500
    override val event: Boolean = false
    override val saleCount: Int = 1000

    override fun hamBurGer() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class BeefBurGer(override val name: String) : BurGer() {
    override val price: Int = 3000
    override val event: Boolean = true
    override val saleCount: Int = 1000

    override fun hamBurGer() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class ChickenBurGer(override val name: String) : BurGer() {
    override val price: Int = 3000
    override val event: Boolean = true
    override val saleCount: Int = 1000

    override fun hamBurGer() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}




