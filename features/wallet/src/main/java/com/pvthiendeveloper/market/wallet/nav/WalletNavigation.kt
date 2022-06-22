package com.pvthiendeveloper.market.wallet.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.pvthiendeveloper.coinmarket.navigation.CMScreens
import com.pvthiendeveloper.market.wallet.presentation.WalletScreen

fun NavGraphBuilder.walletNavigation(
    navController: NavHostController
) {
    composable(
        route = CMScreens.Wallet.name
    ) {
        WalletScreen(navController = navController)
    }
}