@file:OptIn(ExperimentalMaterial3Api::class)

package com.balaji.counter.view.counter.add

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.balaji.counter.ui.theme.CounterTheme
import com.balaji.sharedcode.widgets.CustomOutlinedTextField

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AddCounterScreen(navController: NavController) {

    val repository = AddCounterRepository(LocalContext.current)
    val viewModel = AddCounterViewModel(repository)

    Surface(color = MaterialTheme.colorScheme.background) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "New Counter") },
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        titleContentColor = MaterialTheme.colorScheme.onPrimary,
                        actionIconContentColor = MaterialTheme.colorScheme.onPrimary,
                        navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
                    ),
                    navigationIcon = {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(Icons.Rounded.Close, contentDescription = "Close")
                        }
                    }
                )
            },
            floatingActionButton = {
                ExtendedFloatingActionButton(
                    text = { Text(text = "Done") },
                    icon = { Icon(Icons.Rounded.Done, contentDescription = "Done") },
                    onClick = { viewModel.insert(navController) },
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 100.dp, start = 16.dp, end = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CustomOutlinedTextField(
                    state = viewModel.mRepository.counterName,
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = "Counter Name",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text, imeAction = ImeAction.Next)
                )
                Spacer(modifier = Modifier.padding(top = 16.dp))
                CustomOutlinedTextField(
                    state = viewModel.mRepository.initialCount,
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = "Initial Count",
                    supportingText = "Default value: 0",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Next)
                )
                Spacer(modifier = Modifier.padding(top = 16.dp))
                CustomOutlinedTextField(
                    state = viewModel.mRepository.cycleLength,
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = "Cycle Length",
                    supportingText = "Default value: 108",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Done)
                )
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun AddCounterScreenPreview() {
    CounterTheme(dynamicColor = false) {
        AddCounterScreen(rememberNavController())
    }
}