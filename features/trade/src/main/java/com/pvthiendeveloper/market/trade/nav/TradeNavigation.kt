package com.pvthiendeveloper.market.trade.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.pvthiendeveloper.coinmarket.navigation.CMScreens
import com.pvthiendeveloper.market.trade.presentation.TradeScreen

fun NavGraphBuilder.tradeNavigation(
    navController: NavHostController
) {
    composable(
        route = CMScreens.Trade.name
    ) {
        TradeScreen(navController = navController)
    }
}