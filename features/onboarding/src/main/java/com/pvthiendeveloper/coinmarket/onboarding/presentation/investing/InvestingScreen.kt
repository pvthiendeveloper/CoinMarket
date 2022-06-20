package com.pvthiendeveloper.coinmarket.onboarding.presentation.investing

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.pvthiendeveloper.coinmarket.navigation.CoinMarketScreens
import com.pvthiendeveloper.coinmarket.onboarding.R
import com.pvthiendeveloper.coinmarket.ui.resource.StringResource
import com.pvthiendeveloper.coinmarket.ui.theme.CoinMarketTheme

@Composable
internal fun InvestingScreen(navController: NavHostController) {
    CoinMarketTheme {
        Scaffold(
            backgroundColor = MaterialTheme.colors.primary
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_onboarding_invest),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = stringResource(StringResource.onboarding_title_invest),
                    color = MaterialTheme.colors.onPrimary,
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = stringResource(StringResource.onboarding_lorem_ipsum),
                    color = MaterialTheme.colors.onPrimary,
                    style = MaterialTheme.typography.subtitle1,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 24.dp)
                )
                Spacer(modifier = Modifier.height(40.dp))
                Button(
                    onClick = {
                        navController.navigate(CoinMarketScreens.OnBoardTransaction.name)
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.width(180.dp)
                ) {
                    Text(
                        text = stringResource(StringResource.onboarding_button_next),
                        color = MaterialTheme.colors.onSecondary,
                        style = MaterialTheme.typography.button
                    )
                }
            }
        }
    }
}

@Composable
@Preview
private fun ScreenPreview() {
    val navController = rememberNavController()
    InvestingScreen(navController)
}