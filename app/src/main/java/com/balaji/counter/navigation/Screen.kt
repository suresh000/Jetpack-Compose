package com.balaji.counter.navigation

sealed class Screen(val route: String) {
    object MainScreen : Screen("mainScreen")
    object AddCounterScreen : Screen("addCounterScreen")
}
