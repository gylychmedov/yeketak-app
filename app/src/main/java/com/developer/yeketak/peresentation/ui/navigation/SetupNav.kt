package com.developer.yeketak.peresentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.developer.yeketak.peresentation.ui.screens.HomeScreen

@Composable
fun SetupNav(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HOME_SCREEN.route) {
        composable(Screen.HOME_SCREEN.route) {
            HomeScreen()
        }
    }
}