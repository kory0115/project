package com.kory0115.kiosk.menu

import com.kory0115.kiosk.menuEntity.MenuEntity
import com.kory0115.kiosk.menuEntity.drinkMenuList
import com.kory0115.kiosk.menuEntity.pizzaMenuList

abstract class Drink() {
    abstract val name: String
    abstract val price: Int
    abstract val event: Boolean
    abstract val saleCount: Int
    abstract fun drinkList(): MenuEntity
}

class Cola(override val name: String) : Drink() {
    override val price: Int = 2000
    override val event: Boolean = false
    override val saleCount: Int = 500

    override fun drinkList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class Sprite(override val name: String) : Drink() {
    override val price: Int = 2000
    override val event: Boolean = false
    override val saleCount: Int = 500

    override fun drinkList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}

class Alcohol(override val name: String) : Drink() {
    override val price: Int = 4000
    override val event: Boolean = false
    override val saleCount: Int = 500

    override fun drinkList() : MenuEntity {
        return MenuEntity(name = name, price = price, event = event, saleCount = saleCount)
    }
}