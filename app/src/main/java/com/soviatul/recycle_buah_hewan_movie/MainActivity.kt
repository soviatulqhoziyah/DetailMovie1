package com.soviatul.recycle_buah_hewan_movie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var username_in: EditText
    lateinit var passwordInput: EditText
    lateinit var Login_Btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        username_in = findViewById(R.id.username_id)
        passwordInput = findViewById(R.id.password_id)
        Login_Btn = findViewById(R.id.login_btn)


        Login_Btn.setOnClickListener {
            val username = username_in.text.toString()
            val password = passwordInput.text.toString()

            if (username == "username" && password == "12345") {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Username atau Password Anda Salah", Toast.LENGTH_SHORT).show()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}