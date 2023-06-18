package com.balaji.counter.view.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.balaji.counter.navigation.Navigation
import com.balaji.counter.ui.theme.CounterTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterTheme(dynamicColor = false) {
                Navigation()
            }
        }
    }

}