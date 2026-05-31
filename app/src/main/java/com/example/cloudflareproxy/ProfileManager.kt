package com.example.cloudflareproxy
import android.content.Context
import android.content.SharedPreferences

class ProfileManager(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("proxy_prefs", Context.MODE_PRIVATE)

    fun saveProfile(profile: Profile) {
        prefs.edit().putString("active_profile_id", profile.id).apply()
    }

    fun getActiveProfileId(): String? {
        return prefs.getString("active_profile_id", null)
    }
}
