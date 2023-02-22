package xyz.alaniz.aaron.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.Multibinds
import xyz.alaniz.aaron.exception.AppExceptionHandler
import xyz.alaniz.aaron.exception.AppExceptionMetadata

@Module
abstract class MainModule {
    @Binds
    abstract fun bindAppExceptionHandler(appExceptionHandler: AppExceptionHandler): Thread.UncaughtExceptionHandler

    @Multibinds
    abstract fun appExceptionMetadataProvidersAsSet(): Set<AppExceptionMetadata.Provider>
}