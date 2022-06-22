package com.pvthiendeveloper.coinmarket.dashboard.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.pvthiendeveloper.coinmarket.dashboard.presentation.DashboardScreen
import com.pvthiendeveloper.coinmarket.navigation.CMRoute
import com.pvthiendeveloper.coinmarket.navigation.CMScreens

fun NavGraphBuilder.dashboardNavigation(
    navController: NavHostController,
) {
    navigation(
        route = CMRoute.Dashboard.route,
        startDestination = CMScreens.Dashboard.name,
    ) {
        composable(
            route = CMScreens.Dashboard.name
        ) {
            DashboardScreen(navController)
        }
    }
}