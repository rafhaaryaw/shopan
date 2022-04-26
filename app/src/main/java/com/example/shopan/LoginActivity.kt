package com.example.shopan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {

    private var auth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val firebaseApp = FirebaseApp.initializeApp(this)
        auth = firebaseApp?.let { FirebaseAuth.getInstance(it) }

        val btnRegister: Button = findViewById(R.id.btnRegisterOnLogin)
        btnRegister.setOnClickListener {
            Intent(this@LoginActivity, RegisterActivity::class.java).also {
                startActivity(it)
                Toast.makeText(this, "please make an account", Toast.LENGTH_SHORT).show()
            }
        }

        val btnLogin = findViewById<Button>(R.id.btnLoginOnLogin)
        btnLogin.setOnClickListener {
            // do something
            val email: EditText = findViewById(R.id.et_email_onlogin)
            val password: EditText = findViewById(R.id.et_password_onlogin)
            auth?.signInWithEmailAndPassword(email.text.toString(), password.text.toString())?.addOnSuccessListener {
                Intent(this@LoginActivity, HomeActivity::class.java).also{
                    startActivity(it)
                }
            }
        }
    }
}

