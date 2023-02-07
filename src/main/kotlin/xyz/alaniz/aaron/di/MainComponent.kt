package xyz.alaniz.aaron.di

import dagger.Component

@Component(
    modules = [
        MainModule::class
    ]
)
interface MainComponent {
    fun appExceptionHandler(): Thread.UncaughtExceptionHandler
}