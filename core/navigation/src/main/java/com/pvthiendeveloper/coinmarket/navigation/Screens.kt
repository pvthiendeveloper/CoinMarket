package com.pvthiendeveloper.coinmarket.navigation

sealed class CoinScreens(val route: String) {
    object OnBoardTrading : CoinScreens("trading")
    object OnBoardInvesting : CoinScreens("investing")
    object OnBoardTransaction : CoinScreens("transaction")
}

sealed class CoinRoute(val name: String) {
    object OnBoarding : CoinRoute("on-boarding")

    object Dashboard : CoinRoute("dashboard")
}