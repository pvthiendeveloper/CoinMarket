package com.pvthiendeveloper.market.activity.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.pvthiendeveloper.coinmarket.ui.theme.CoinMarketTheme

@Composable
internal fun ActivityScreen(navController: NavHostController) {
    CoinMarketTheme {
        Scaffold(
            backgroundColor = MaterialTheme.colors.primary
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Activity",
                    color = MaterialTheme.colors.onPrimary,
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}

@Composable
@Preview
private fun ScreenPreview() {
    val navController = rememberNavController()
    ActivityScreen(navController)
}