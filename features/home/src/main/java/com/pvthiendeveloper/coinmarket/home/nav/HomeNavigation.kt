package com.pvthiendeveloper.coinmarket.home.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.pvthiendeveloper.coinmarket.home.presentation.HomeScreen
import com.pvthiendeveloper.coinmarket.navigation.CMScreens

fun NavGraphBuilder.homeNavigation(
    navController: NavHostController
) {
    composable(
        route = CMScreens.Home.name
    ) {
        HomeScreen(navController = navController)
    }
}