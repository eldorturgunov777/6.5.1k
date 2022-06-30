package com.example.a651k

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val start = findViewById<Button>(R.id.start)
        val tv_service = findViewById<TextView>(R.id.tv_service)
        val stop = findViewById<Button>(R.id.stop)
        start.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                tv_service.text = "Running"
            }
        }
        stop.setOnClickListener {
            MyIntentService.stopService()
            tv_service.text = "Stop"
        }
    }
}