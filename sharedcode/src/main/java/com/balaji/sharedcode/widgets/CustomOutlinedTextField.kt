@file:OptIn(ExperimentalMaterial3Api::class)

package com.balaji.sharedcode.widgets

import android.annotation.SuppressLint
import android.text.TextUtils
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CustomOutlinedTextField(state: MutableState<String>,
                            placeholder: String,
                            modifier: Modifier = Modifier,
                            label: String = placeholder,
                            supportingText: String = "",
                            keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text, imeAction = ImeAction.Next)) {

    if (!TextUtils.isEmpty(supportingText)) {
        OutlinedTextField(
            value = state.value,
            onValueChange = { state.value = it },
            modifier = modifier,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                focusedLabelColor = MaterialTheme.colorScheme.primary,
                cursorColor = MaterialTheme.colorScheme.primary
            ),
            label = { CustomText(text = label) },
            placeholder = { CustomText(text = placeholder) },
            keyboardOptions = keyboardOptions,
            supportingText = { CustomText(text = supportingText) }
        )
    } else {
        OutlinedTextField(
            value = state.value,
            onValueChange = { state.value = it },
            modifier = modifier,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                focusedLabelColor = MaterialTheme.colorScheme.primary,
                cursorColor = MaterialTheme.colorScheme.primary
            ),
            label = { CustomText(text = label) },
            placeholder = { CustomText(text = placeholder) },
            keyboardOptions = keyboardOptions
        )
    }
}