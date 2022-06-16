package com.pvthiendeveloper.coinmarket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.pvthiendeveloper.coinmarket.navigation.CoinMarketRoute
import com.pvthiendeveloper.coinmarket.navigation.CoinMarketScreens
import com.pvthiendeveloper.coinmarket.onboarding.nav.onBoardingNavigation

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = CoinMarketRoute.OnBoarding.name
            ) {
                onBoardingNavigation()
            }
        }
    }
}