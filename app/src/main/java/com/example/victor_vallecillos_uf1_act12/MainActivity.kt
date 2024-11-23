package com.example.victor_vallecillos_uf1_act12

import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toggleScrollbars = findViewById<Switch>(R.id.toggleScrollbars)
        val horizontalScrollView = findViewById<HorizontalScrollView>(R.id.horizontalScrollView)

        toggleScrollbars.setOnCheckedChangeListener { _, isChecked ->
            horizontalScrollView.isHorizontalScrollBarEnabled = isChecked
        }
    }
}