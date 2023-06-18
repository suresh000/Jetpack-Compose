package com.balaji.sharedcode.widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CustomText(text: String,
               modifier: Modifier = Modifier) {

    return Text(
        text = text,
        modifier = modifier
    )
}