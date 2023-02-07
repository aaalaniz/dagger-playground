package xyz.alaniz.aaron

import xyz.alaniz.aaron.di.DaggerMainComponent

fun main() {
    Thread.setDefaultUncaughtExceptionHandler(
        DaggerMainComponent.create().appExceptionHandler()
    )
    error("hello, world")
}