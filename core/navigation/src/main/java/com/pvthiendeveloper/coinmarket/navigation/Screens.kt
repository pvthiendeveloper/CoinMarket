package com.pvthiendeveloper.coinmarket.navigation

sealed class CoinMarketScreens(val name: String) {
    object OnBoardTrading : CoinMarketScreens("trading")
    object OnBoardInvesting : CoinMarketScreens("investing")
    object OnBoardTransaction : CoinMarketScreens("transaction")
    object Dashboard : CoinMarketScreens("dashboard-screen")
}

sealed class CoinMarketRoute(val route: String) {
    object OnBoarding : CoinMarketRoute("on-boarding")

    object Dashboard : CoinMarketRoute("dashboard")
}