package com.andef.andefgames.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andef.andefgames.R
import com.andef.andefgames.datasourse.GameLibrary
import com.andef.andefgames.games.Game
import com.andef.andefgames.ui.theme.AndefGamesTheme

@Composable
fun MainScreen(onGameClickListener: (Game) -> Unit) {
    val games = GameLibrary.games
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.padding(16.dp))
            Text(
                text = stringResource(R.string.hello_choose_game),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 28.sp
            )
            Spacer(modifier = Modifier.padding(16.dp))
            LazyVerticalGrid(
                modifier = Modifier.weight(1f),
                columns = GridCells.Fixed(2)
            ) {
                items(items = games, key = { it.id }) { game ->
                    GameCard(
                        game = game,
                        onGameClickListener = onGameClickListener
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun DarkMainScreenPreview() {
    AndefGamesTheme(darkTheme = true) {
        MainScreen {}
    }
}

@Preview
@Composable
private fun LightMainScreenPreview() {
    AndefGamesTheme(darkTheme = false) {
        MainScreen {}
    }
}