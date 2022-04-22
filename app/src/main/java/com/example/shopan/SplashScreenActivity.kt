package com.example.shopan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.shopan.databinding.ActivitySplashactivityBinding

class SplashScreenActivity : AppCompatActivity() {

private lateinit var binding: ActivitySplashactivityBinding

private val timer: CountDownTimer by lazy {
    object: CountDownTimer(2000, 1000) {
        override fun onTick(p0: Long) {
        }

        override fun onFinish() {
            val intent = Intent(this@SplashScreenActivity, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

    }
}

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivitySplashactivityBinding.inflate(layoutInflater)
    setContentView(binding.root)
    supportActionBar?.hide()
    setTimer()
}

private fun setTimer() {
    timer.start()
}

override fun onDestroy() {
    super.onDestroy()
    timer.cancel()
}
}