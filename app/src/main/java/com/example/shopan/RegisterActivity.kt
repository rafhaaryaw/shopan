package com.example.shopan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val buttonRegister = findViewById<Button>(R.id.btnRegisterOnLogin)
        buttonRegister.setOnClickListener {
            val intent= Intent(this@RegisterActivity, LoginActivity::class.java).also{
                startActivity(intent)
            Toast.makeText(this, "Button register Clicked", Toast.LENGTH_SHORT).show()
        }
}}}