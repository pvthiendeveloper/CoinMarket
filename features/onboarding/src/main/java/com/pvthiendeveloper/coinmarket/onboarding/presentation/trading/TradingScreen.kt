package com.pvthiendeveloper.coinmarket.onboarding.presentation.trading

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.pvthiendeveloper.coinmarket.navigation.CoinMarketScreens
import com.pvthiendeveloper.coinmarket.onboarding.R
import com.pvthiendeveloper.coinmarket.ui.theme.CoinMarketTheme

@Composable
internal fun TradingScreen(navController: NavHostController) {
    CoinMarketTheme {
        Scaffold {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.primary)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_onboarding_trade),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Trade anytime anywhere",
                    color = MaterialTheme.colors.onPrimary,
                    style = MaterialTheme.typography.h5
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore.",
                    color = MaterialTheme.colors.onPrimary,
                    style = MaterialTheme.typography.subtitle1,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 24.dp)
                )
                Spacer(modifier = Modifier.height(40.dp))
                Button(
                    onClick = { navController.navigate(CoinMarketScreens.OnBoardInvesting.route) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.width(180.dp)
                ) {
                    Text(
                        text = "Next",
                        color = MaterialTheme.colors.onSecondary,
                        style = MaterialTheme.typography.button
                    )
                }
            }
        }
    }
}

@Composable
@Preview()
private fun TradingScreenPreview() {
    val navController = rememberNavController()
    TradingScreen(navController)
}