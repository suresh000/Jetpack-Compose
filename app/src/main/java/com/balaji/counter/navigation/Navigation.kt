package com.balaji.counter.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.balaji.counter.view.counter.add.AddCounterScreen
import com.balaji.counter.view.main.MainScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController)
        }
        composable(route = Screen.AddCounterScreen.route) {
            AddCounterScreen(navController)
        }
    }
}