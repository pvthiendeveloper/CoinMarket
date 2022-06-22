package com.pvthiendeveloper.coinmarket.onboarding.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pvthiendeveloper.coinmarket.navigation.CMRoute
import com.pvthiendeveloper.coinmarket.navigation.CMScreens
import com.pvthiendeveloper.coinmarket.onboarding.presentation.investing.InvestingScreen
import com.pvthiendeveloper.coinmarket.onboarding.presentation.trading.TradingScreen
import com.pvthiendeveloper.coinmarket.onboarding.presentation.transaction.TransactionScreen

fun NavGraphBuilder.onBoardingNavigation(navController: NavHostController) {
    navigation(
        route = CMRoute.OnBoarding.route,
        startDestination = CMScreens.OnBoardTrading.name,
    ) {
        composable(
            route = CMScreens.OnBoardTrading.name
        ) {
            TradingScreen(navController)
        }
        composable(
            route = CMScreens.OnBoardInvesting.name
        ) {
            InvestingScreen(navController)
        }
        composable(
            route = CMScreens.OnBoardTransaction.name
        ) {
            TransactionScreen(navController)
        }
    }
}