package com.andef.andefgames.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    mainScreenContent: @Composable () -> Unit,
    findTheWordScreenContent: @Composable () -> Unit
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.MAIN_SCREEN_ROUTE
    ) {
        composable(Screen.MAIN_SCREEN_ROUTE) {
            mainScreenContent()
        }
        composable(Screen.FIND_THE_WORD_SCREEN_ROUTE) {
            findTheWordScreenContent()
        }
    }
}