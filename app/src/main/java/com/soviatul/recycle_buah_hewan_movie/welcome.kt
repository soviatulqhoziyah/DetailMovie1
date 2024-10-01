package com.soviatul.recycle_buah_hewan_movie

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class welcome : AppCompatActivity() {
    private lateinit var txtwelcome : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        txtwelcome = findViewById(R.id.txtwelcome)

        val getUsername = intent.getStringExtra("username")
        val getPassword = intent.getStringExtra("password")

        txtwelcome.setText("hello ${getUsername}! Password anda adalah : ${getPassword} ")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}