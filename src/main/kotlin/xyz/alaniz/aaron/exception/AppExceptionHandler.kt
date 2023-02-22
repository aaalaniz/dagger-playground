package xyz.alaniz.aaron.exception

import javax.inject.Inject

class AppExceptionHandler @Inject constructor(
    private val metadataProviders: @JvmSuppressWildcards Set<AppExceptionMetadata.Provider>
) : Thread.UncaughtExceptionHandler {
    override fun uncaughtException(t: Thread?, e: Throwable?) {
        println(
            """
            A Crash Occurred
            App Metadata: ${if (metadataProviders.isEmpty()) "None" else metadataProviders.joinToString()}
            Thread Name: ${t?.name}
            Exception: ${e?.toString()}
            """.trimIndent()
        )
    }
}