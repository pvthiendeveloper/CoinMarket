package com.pvthiendeveloper.coinmarket.dashboard.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.pvthiendeveloper.coinmarket.dashboard.R
import com.pvthiendeveloper.coinmarket.navigation.CMScreens
import com.pvthiendeveloper.coinmarket.ui.theme.CoinMarketTheme
import com.pvthiendeveloper.coinmarket.ui.theme.LavenderGray
import com.pvthiendeveloper.coinmarket.ui.theme.Secondary
import com.pvthiendeveloper.coinmarket.ui.theme.SonicSilver

@Composable
internal fun DashboardScreen(
    navController: NavHostController
) {
    var selectedItem by remember {
        mutableStateOf<BottomBarItem>(BottomBarItem.Home)
    }

    CoinMarketTheme {
        Scaffold(
            backgroundColor = MaterialTheme.colors.primary,
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                when (selectedItem) {
                    is BottomBarItem.Home -> {
                        Text("Home", style = MaterialTheme.typography.h4)
                    }
                    is BottomBarItem.Market -> {
                        Text("Market", style = MaterialTheme.typography.h4)
                    }
                    is BottomBarItem.Trade -> {
                        Text("Trade", style = MaterialTheme.typography.h4)
                    }
                    is BottomBarItem.Activity -> {
                        Text("Activity", style = MaterialTheme.typography.h4)
                    }
                    is BottomBarItem.Wallet -> {
                        Text("Wallet", style = MaterialTheme.typography.h4)
                    }
                }
                DashboardBottomBar(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .background(MaterialTheme.colors.primary),
                    selectedItem = selectedItem,
                    onItemClick = { item ->
                        selectedItem = item
                    }
                )
            }
        }
    }
}

@Composable
internal fun DashboardBottomBar(
    modifier: Modifier = Modifier,
    activeIconColor: Color = Secondary,
    activeTextColor: Color = LavenderGray,
    inactiveColor: Color = SonicSilver,
    selectedItem: BottomBarItem = BottomBarItem.Home,
    onItemClick: (BottomBarItem) -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        val tabs = getDashboardTabs()
        tabs.forEachIndexed { index, item ->
            BottomNavItem(
                modifier = Modifier.weight(1f),
                item = item,
                isSelected = selectedItem == item,
                activeIconColor = activeIconColor,
                activeTextColor = activeTextColor,
                inactiveColor = inactiveColor,
                onItemClick = { onItemClick(item) }
            )
        }
    }
}

@Composable
private fun BottomNavItem(
    modifier: Modifier = Modifier,
    item: BottomBarItem,
    isSelected: Boolean = false,
    activeIconColor: Color = Secondary,
    activeTextColor: Color = LavenderGray,
    inactiveColor: Color = SonicSilver,
    onItemClick: () -> Unit
) {
    Box(
        modifier = modifier.clickable { onItemClick() },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Icon(
                painter = painterResource(id = item.icon),
                contentDescription = item.title,
                tint = if (isSelected) activeIconColor else inactiveColor,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = item.title,
                style = MaterialTheme.typography.subtitle2,
                color = if (isSelected) activeTextColor else inactiveColor
            )
        }
    }

}

private fun navigateTab(
    navController: NavHostController,
    item: BottomBarItem
) {
    navController.navigate(item.route) {
        // Pop up to the start destination of the graph to
        // avoid building up a large stack of destinations
        // on the back stack as users select items
        popUpTo(navController.graph.findStartDestination().id) {
            saveState = true
        }
        // Avoid multiple copies of the same destination when
        // reselecting the same item
        launchSingleTop = true
        // Restore state when reselecting a previously selected item
        restoreState = true
    }
}


internal sealed class BottomBarItem(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Home : BottomBarItem(
        route = CMScreens.Dashboard.name,
        title = "Home",
        icon = R.drawable.ic_dashboard_home_24dp
    )

    object Market : BottomBarItem(
        route = CMScreens.Market.name,
        title = "Market",
        icon = R.drawable.ic_dashboard_market_24dp
    )

    object Trade : BottomBarItem(
        route = CMScreens.Trade.name,
        title = "Trade",
        icon = R.drawable.ic_dashboard_trade_24dp
    )

    object Activity : BottomBarItem(
        route = CMScreens.Activity.name,
        title = "Activity",
        icon = R.drawable.ic_dashboard_activity_24dp
    )

    object Wallet : BottomBarItem(
        route = CMScreens.Wallet.name,
        title = "Wallet",
        icon = R.drawable.ic_dashboard_wallet_24dp
    )
}

private fun getDashboardTabs(): MutableList<BottomBarItem> {
    return mutableListOf<BottomBarItem>().apply {
        add(BottomBarItem.Home)
        add(BottomBarItem.Market)
        add(BottomBarItem.Trade)
        add(BottomBarItem.Activity)
        add(BottomBarItem.Wallet)
    }
}

@Composable
@Preview
private fun ScreenPreview() {
    val navController = rememberNavController()
    DashboardScreen(navController)
}