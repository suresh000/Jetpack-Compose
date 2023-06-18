package com.balaji.counter.view.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.balaji.counter.AppNavigator

class SplashActivity : ComponentActivity() {

    private val SPLASH_TIME: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreen()
        }

        Handler(Looper.getMainLooper()).postDelayed({
            AppNavigator.navigateToMainActivity(this, true)
            finish()
        }, SPLASH_TIME)

    }
}