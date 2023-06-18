@file:OptIn(ExperimentalMaterial3Api::class)

package com.balaji.counter.view.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.balaji.counter.navigation.Screen
import com.balaji.counter.ui.theme.CounterTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController) {

    val showMenu = remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Counter") },
                actions = {
                    IconButton(onClick = { showMenu.value = !showMenu.value }) {
                        Icon(Icons.Rounded.MoreVert, contentDescription = "Menu")
                    }

                    DropdownMenu(expanded = showMenu.value,
                        onDismissRequest = { showMenu.value = false }) {

                        DropdownMenuItem(text = { Text(text = "Backup and Restore") }, onClick = {
                            showMenu.value = false
                        })
                        DropdownMenuItem(text = { Text(text = "Share") }, onClick = {
                            showMenu.value = false
                        })
                        DropdownMenuItem(text = { Text(text = "Rate us") }, onClick = {
                            showMenu.value = false
                        })
                        DropdownMenuItem(text = { Text(text = "About") }, onClick = {
                            showMenu.value = false
                        })

                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text(text = "Add Counter") },
                icon = { Icon(Icons.Rounded.Add, contentDescription = "Add") },
                onClick = { navController.navigate(Screen.AddCounterScreen.route) },
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer
            )
        }
    ) {
        Column {

        }
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun MainPreview() {
    CounterTheme(dynamicColor = false) {
        MainScreen(rememberNavController())
    }
}