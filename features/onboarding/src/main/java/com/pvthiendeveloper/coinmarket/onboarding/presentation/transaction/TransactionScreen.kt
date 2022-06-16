package com.pvthiendeveloper.coinmarket.onboarding.presentation.transaction

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.pvthiendeveloper.coinmarket.ui.theme.CoinMarketTheme

@Composable
internal fun TransactionScreen() {
    CoinMarketTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Hello Transaction screen")
        }
    }
}
