package com.js.currency_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform