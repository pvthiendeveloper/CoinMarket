package com.pvthiendeveloper.coinmarket.onboarding.presentation.trading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.pvthiendeveloper.coinmarket.ui.theme.CoinMarketTheme

@Composable
fun TradingScreen() {
    CoinMarketTheme {
        Scaffold {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("Hello Trading screen", color = Color.Red)
            }
        }
    }
}

@Composable
@Preview
private fun TradingScreenPreview() {
    TradingScreen()
}