package com.andef.andefgames.games

abstract class Game(
    val id: Int = GAME_ID,
    val nameResId: Int,
    val iconResId: Int,
    val route: String
) {
    companion object {
        private var GAME_ID = 1
            get() = field++
    }
}