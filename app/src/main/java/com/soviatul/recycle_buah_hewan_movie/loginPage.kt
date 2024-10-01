package com.soviatul.recycle_buah_hewan_movie

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loginPage : AppCompatActivity() {
    private lateinit var etUser : EditText
    private lateinit var etPass : EditText
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)
        etUser = findViewById(R.id.etUser)
        etPass = findViewById(R.id.etPass)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(){
            val intent = Intent(this, welcome::class.java)
            val nUsername = etUser.text.toString()
            val password = etPass.text.toString()

            intent.putExtra("username", nUsername)
            intent.putExtra("password", password)
            Log.d("username : ",nUsername)
            Log.d("password : ", password)

            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}