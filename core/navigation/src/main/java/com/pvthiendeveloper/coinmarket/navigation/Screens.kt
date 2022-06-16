package com.pvthiendeveloper.coinmarket.navigation

sealed class CoinMarketScreens(val route: String) {
    object OnBoardTrading : CoinMarketScreens("trading")
    object OnBoardInvesting : CoinMarketScreens("investing")
    object OnBoardTransaction : CoinMarketScreens("transaction")
}

sealed class CoinMarketRoute(val name: String) {
    object OnBoarding : CoinMarketRoute("on-boarding")

    object Dashboard : CoinMarketRoute("dashboard")
}