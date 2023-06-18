package com.balaji.sharedcode.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun <T : Any> CustomButton(text: String,
                           modifier: Modifier = Modifier,
                           onClick: () -> Unit) {

    return Button(onClick = { onClick.invoke() }, modifier = modifier) {
        Row {
            CustomText(text = text)
        }
    }
}