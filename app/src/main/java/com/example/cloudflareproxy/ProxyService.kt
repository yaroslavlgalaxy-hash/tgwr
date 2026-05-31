package com.example.cloudflareproxy
import android.app.Service
import android.content.Intent
import android.os.IBinder

class ProxyService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null
}
