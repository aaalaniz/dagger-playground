package xyz.alaniz.aaron.exception

import javax.inject.Inject

class AppExceptionHandler @Inject constructor() : Thread.UncaughtExceptionHandler {
    override fun uncaughtException(t: Thread?, e: Throwable?) {
        println("an exception occurred")
    }
}