package com.example.cloudflareproxy
import java.util.UUID

data class Profile(
    val id: String = UUID.randomUUID().toString(),
    val name: String = "Default",
    val workerUrl: String = "wss://your-worker.workers.dev",
    val secretKey: String = "",
    val proxyMode: String = "socks5",
    val mtprotoSecret: String = "",
    val localPort: Int = 1080,
    val stealthMode: Boolean = false
)
