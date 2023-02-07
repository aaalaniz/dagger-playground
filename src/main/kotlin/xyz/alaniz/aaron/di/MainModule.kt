package xyz.alaniz.aaron.di

import dagger.Binds
import dagger.Module
import xyz.alaniz.aaron.exception.AppExceptionHandler

@Module
abstract class MainModule {
    @Binds
    abstract fun bindAppExceptionHandler(appExceptionHandler: AppExceptionHandler): Thread.UncaughtExceptionHandler
}