package com.pvthiendeveloper.coinmarket.onboarding.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pvthiendeveloper.coinmarket.navigation.CoinMarketRoute
import com.pvthiendeveloper.coinmarket.navigation.CoinMarketScreens
import com.pvthiendeveloper.coinmarket.onboarding.presentation.investing.InvestingScreen
import com.pvthiendeveloper.coinmarket.onboarding.presentation.trading.TradingScreen
import com.pvthiendeveloper.coinmarket.onboarding.presentation.transaction.TransactionScreen

fun NavGraphBuilder.onBoardingNavigation(navController: NavHostController) {
    navigation(
        startDestination = CoinMarketScreens.OnBoardTrading.name,
        route = CoinMarketRoute.OnBoarding.route
    ) {
        composable(
            route = CoinMarketScreens.OnBoardTrading.name
        ) {
            TradingScreen(navController)
        }
        composable(
            route = CoinMarketScreens.OnBoardInvesting.name
        ) {
            InvestingScreen(navController)
        }
        composable(
            route = CoinMarketScreens.OnBoardTransaction.name
        ) {
            TransactionScreen(navController)
        }
    }
}