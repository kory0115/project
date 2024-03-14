package com.kory0115.kiosk.menuEntity

data class MenuEntity(
    val name: String,
    val price: Int,
    val event: Boolean,
    val saleCount: Int,
)