package com.balaji.counter.view.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.balaji.counter.R
import com.balaji.counter.ui.theme.CounterTheme
import com.balaji.sharedcode.widgets.CustomImage

@Composable
fun SplashScreen() {
    CounterTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {

                CustomImage(image = R.drawable.ic_logo)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun  SplashPreview() {
    CounterTheme {
        SplashScreen()
    }
}