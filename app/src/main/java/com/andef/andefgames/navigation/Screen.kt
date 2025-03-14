package com.andef.andefgames.navigation

sealed class Screen(val route: String) {
    data object Main : Screen("")

    companion object {
        const val MAIN_SCREEN_ROUTE = "main_screen_route"
        const val FIND_THE_WORD_SCREEN_ROUTE = "find_the_word_screen_route"
    }
}