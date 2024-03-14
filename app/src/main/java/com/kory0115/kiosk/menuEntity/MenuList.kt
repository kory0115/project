package com.kory0115.kiosk.menuEntity

open class MenuList{
    fun burgerList(): MutableList<MenuEntity> {
        var burGerMenu = mutableListOf<MenuEntity>()
        burGerMenu.add(MenuEntity("치즈버거", 2500, false, 1000))
        burGerMenu.add(MenuEntity("불고기 버거", 3000, false, 1000))
        burGerMenu.add(MenuEntity("치킨 버거", 3000, false, 1000))
        return burGerMenu
    }

    fun pizzaList(): MutableList<MenuEntity> {
        var pizzaMenu = mutableListOf<MenuEntity>()
        pizzaMenu.add(MenuEntity("치즈 피자", 10000, false, 2000))
        pizzaMenu.add(MenuEntity("불고기 피자", 12000, false, 2000))
        pizzaMenu.add(MenuEntity("콤비네이션 피자", 11500, false, 2000))
        return pizzaMenu
    }

    fun drinkList(): MutableList<MenuEntity> {
        var drinkMenu = mutableListOf<MenuEntity>()
        drinkMenu.add(MenuEntity("콜라", 2000, false, 500))
        drinkMenu.add(MenuEntity("사이다", 2000, false, 500))
        drinkMenu.add(MenuEntity("주류", 4000, false, 500))
        return drinkMenu
    }

    fun chickenList(): MutableList<MenuEntity> {
        var chickenMenu = mutableListOf<MenuEntity>()
        chickenMenu.add(MenuEntity("후라이드 치킨", 10000, false, 3000))
        chickenMenu.add(MenuEntity("양념 치킨", 12000, false, 3000))
        chickenMenu.add(MenuEntity("간장 치킨", 11500, false, 3000))
        return chickenMenu
    }
}
