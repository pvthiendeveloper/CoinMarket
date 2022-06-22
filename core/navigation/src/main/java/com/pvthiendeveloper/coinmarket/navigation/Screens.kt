package com.pvthiendeveloper.coinmarket.navigation

sealed class CMScreens(val name: String) {
    object OnBoardTrading : CMScreens("trading")
    object OnBoardInvesting : CMScreens("investing")
    object OnBoardTransaction : CMScreens("transaction")
    object Dashboard : CMScreens("dashboard-screen")
    object Home : CMScreens("home")
    object Market : CMScreens("market")
    object Trade : CMScreens("trade")
    object Activity : CMScreens("activity")
    object Wallet : CMScreens("wallet")
}

sealed class CMRoute(val route: String) {
    object Root : CMRoute("root")

    object OnBoarding : CMRoute("on-boarding")

    object Dashboard : CMRoute("dashboard")
}