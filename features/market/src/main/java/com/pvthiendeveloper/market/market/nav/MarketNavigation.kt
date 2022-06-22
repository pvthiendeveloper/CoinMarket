package com.pvthiendeveloper.market.market.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.pvthiendeveloper.coinmarket.navigation.CMScreens
import com.pvthiendeveloper.market.market.presentation.MarketScreen

fun NavGraphBuilder.marketNavigation(
    navController: NavHostController
) {
    composable(
        route = CMScreens.Market.name
    ) {
        MarketScreen(navController = navController)
    }
}