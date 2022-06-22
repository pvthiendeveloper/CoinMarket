package com.pvthiendeveloper.market.activity.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.pvthiendeveloper.coinmarket.navigation.CMScreens
import com.pvthiendeveloper.market.activity.presentation.ActivityScreen

fun NavGraphBuilder.activityNavigation(
    navController: NavHostController
) {
    composable(
        route = CMScreens.Activity.name
    ) {
        ActivityScreen(navController)
    }
}