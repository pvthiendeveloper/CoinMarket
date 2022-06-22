package com.pvthiendeveloper.coinmarket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.pvthiendeveloper.coinmarket.dashboard.nav.dashboardNavigation
import com.pvthiendeveloper.coinmarket.home.nav.homeNavigation
import com.pvthiendeveloper.coinmarket.navigation.CMRoute
import com.pvthiendeveloper.coinmarket.onboarding.nav.onBoardingNavigation
import com.pvthiendeveloper.market.activity.nav.activityNavigation
import com.pvthiendeveloper.market.market.nav.marketNavigation
import com.pvthiendeveloper.market.trade.nav.tradeNavigation
import com.pvthiendeveloper.market.wallet.nav.walletNavigation

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = CMRoute.OnBoarding.route
            ) {
                onBoardingNavigation(navController)
                dashboardNavigation(navController)
                homeNavigation(navController)
                marketNavigation(navController)
                tradeNavigation(navController)
                activityNavigation(navController)
                walletNavigation(navController)
            }
        }
    }
}