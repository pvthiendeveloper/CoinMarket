package com.pvthiendeveloper.coinmarket.onboarding.presentation.investing

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.pvthiendeveloper.coinmarket.ui.theme.CoinMarketTheme

@Composable
fun InvestingScreen() {
    CoinMarketTheme {
        Scaffold {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("Hello Investing screen", color = Color.Red)
            }
        }
    }
}