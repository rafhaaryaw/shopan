package com.example.shopan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnRegister = findViewById<Button>(R.id.btnRegisterOnLogin)
        btnRegister.setOnClickListener {
            Intent(this@LoginActivity,RegisterActivity::class.java).also{
                startActivity(intent)
            Toast.makeText(this,"please make an account", Toast.LENGTH_SHORT).show()

        val btnLogin = findViewById<Button>(R.id.btnLoginOnLogin)
        btnLogin.setOnClickListener {
            Toast.makeText(this, "Login succesful", Toast.LENGTH_SHORT).show()

        }
    }}}}

