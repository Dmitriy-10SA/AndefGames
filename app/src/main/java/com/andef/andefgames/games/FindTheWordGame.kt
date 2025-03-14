package com.andef.andefgames.games

import com.andef.andefgames.R
import com.andef.andefgames.navigation.Screen

class FindTheWordGame : Game(
    nameResId = R.string.find_the_word,
    iconResId = R.drawable.find_the_word,
    route = Screen.FIND_THE_WORD_SCREEN_ROUTE
)