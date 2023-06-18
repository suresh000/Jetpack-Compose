package com.balaji.sharedcode.widgets

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun CustomImage(image: Int,
                modifier: Modifier = Modifier,
                contentDescription: String = "") {

    return Image(
        painter = painterResource(id = image),
        contentDescription = contentDescription,
        modifier = modifier
    )

}