package com.example.a651k

import android.app.IntentService
import android.content.Intent
import android.util.Log


/**
 * Created by Eldor Turgunov on 30.06.2022.
 * 6.5.1k
 * eldorturgunov777@gmail.com
 */
class MyIntentService : IntentService("Intent Service") {

    init {
        instance = this
    }

    companion object {
        private lateinit var instance: MyIntentService
        var isRunning = false

        fun stopService() {
            Log.d("MyInstanceService", "Service is Stop...")
            isRunning = false
            instance.stopSelf()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onHandleIntent(p0: Intent?) {
        try {
            isRunning = true
            while (isRunning) {
                Log.d("MyInstanceService", "Service is Run...")
                Thread.sleep(1000)
            }
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }
}