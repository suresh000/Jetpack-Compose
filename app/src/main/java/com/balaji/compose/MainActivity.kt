package com.balaji.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AlertDialog
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.balaji.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityUI(text = "Jetpack Compose")
        }

    }
}

@Composable
fun MainActivityUI(text: String = "Hello") {
    Button(onClick = {  }) {
        Text(text = "Hello")
    }
}

@Preview(showBackground = true)
@Composable
private fun MainActivityUIPreview() {
    MainActivityUI(text = "Jetpack Compose")
}
