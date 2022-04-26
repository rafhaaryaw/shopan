package com.example.shopan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private var auth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val firebaseApp = FirebaseApp.initializeApp(this)
        auth = firebaseApp?.let { FirebaseAuth.getInstance(it) }

        val btnlogin: Button = findViewById(R.id.btnRegisterOnRegister)
        btnlogin.setOnClickListener {
            Intent(this@RegisterActivity, LoginActivity::class.java).also {
                startActivity(it)
                Toast.makeText(this, "please enter your account", Toast.LENGTH_SHORT).show()
            }
        }

        val btnRegister = findViewById<Button>(R.id.btnLoginOnRegister)
        btnRegister.setOnClickListener {
            // do something
            val email: EditText = findViewById(R.id.et_email_onregister)
            val password: EditText = findViewById(R.id.et_password_onregister)
            auth?.createUserWithEmailAndPassword(email.text.toString(), password.text.toString())
        }
    }
}
