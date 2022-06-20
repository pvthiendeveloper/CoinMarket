package com.pvthiendeveloper.coinmarket.dashboard.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.pvthiendeveloper.coinmarket.dashboard.presentation.DashboardScreen
import com.pvthiendeveloper.coinmarket.navigation.CoinMarketRoute
import com.pvthiendeveloper.coinmarket.navigation.CoinMarketScreens

fun NavGraphBuilder.dashboardNavigation(navController: NavHostController) {
    navigation(
        startDestination = CoinMarketScreens.Dashboard.name,
        route = CoinMarketRoute.Dashboard.route
    ) {
        composable(
            route = CoinMarketScreens.Dashboard.name
        ) {
            DashboardScreen(navController)
        }
    }
}