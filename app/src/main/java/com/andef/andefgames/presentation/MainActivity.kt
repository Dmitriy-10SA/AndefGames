package com.andef.andefgames.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.andef.andefgames.navigation.AppNavGraph
import com.andef.andefgames.navigation.rememberNavigationState
import com.andef.andefgames.ui.theme.AndefGamesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndefGamesTheme(dynamicColor = false) {
                AppScreen()
            }
        }
    }
}

@Composable
fun AppScreen() {
    val navigationState = rememberNavigationState()
    AppNavGraph(
        navHostController = navigationState.navHostController,
        mainScreenContent = {
            MainScreen(onGameClickListener = { game ->
                navigationState.navigateToGame(game)
            })
        },
        findTheWordScreenContent = {

        }
    )
}