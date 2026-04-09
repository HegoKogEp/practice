package ci.nsu.mobile.main.data.local

import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

object TokenManager {
    private lateinit var prefs: EncryptedSharedPreferences

    fun init(context: Context) {
        if(!::prefs.isInitialized) {
            val masterKey = MasterKey.Builder(context)
                .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                .build()

            prefs = EncryptedSharedPreferences.create(
                context,
                "secure_prefs",
                masterKey,
                EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
            ) as EncryptedSharedPreferences
        }
    }

    var token: String?
        get() = if (::prefs.isInitialized) prefs.getString("auth_token", null) else null
        set(value) {
            if (::prefs.isInitialized) {
                value?.let {
                    prefs.edit().putString("auth_token", it).apply()
                } ?: run {
                    prefs.edit().remove("auth_token").apply()
                }
            }
        }

    fun clearToken() {
        if (::prefs.isInitialized) {
            prefs.edit().remove("auth_token").apply()
        }
    }
}