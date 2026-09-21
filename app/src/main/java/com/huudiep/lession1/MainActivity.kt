package com.huudiep.lession1

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Lệnh này giúp gọi giao diện từ file activity_main.xml
        setContentView(R.layout.activity_main)
    }
}