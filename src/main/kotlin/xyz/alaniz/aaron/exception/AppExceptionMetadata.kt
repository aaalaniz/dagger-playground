package xyz.alaniz.aaron.exception

class AppExceptionMetadata(val key: String, val data: String) {
    fun interface Provider {
        operator fun invoke(): AppExceptionMetadata
    }
}