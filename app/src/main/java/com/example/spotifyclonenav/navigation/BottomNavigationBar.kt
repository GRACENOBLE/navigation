package com.example.spotifyclonenav.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LibraryMusic
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclonenav.screens.AScreen
import com.example.spotifyclonenav.screens.BScreen
import com.example.spotifyclonenav.screens.HomeScreenPage

val items = listOf(
        BottomNavigationElement(
            title = "Home",
            icon = Icons.Rounded.Home,
            route = Screen.HomeScreenRoute.route
        ),
        BottomNavigationElement(
            title = "A",
            icon = Icons.Rounded.Search,
            route = Screen.AScreenRoute.route
        ),
        BottomNavigationElement(
            title = "B",
            icon = Icons.Rounded.LibraryMusic,
            route = Screen.BScreenRoute.route
        )
    )

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun BottomNavBar (navController: NavController){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            NavigationBar(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.onBackground),
                Color(0xff121212),
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                items.forEach { item ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                        onClick = {
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title,
                                tint = Color.Gray
                            )
                        },

                        label = {
                            Text(
                                text = item.title,
                                color = Color.White
                            )
                        }
                    )
                }
            }
        }
    ) {padding->
        NavHost(
            navController = navController,
            startDestination = Screen.HomeScreenRoute.route,
            modifier = Modifier
                .padding(padding)
        ){
            composable(
                route = Screen.HomeScreenRoute.route
            ){
                HomeScreenPage(navController = navController)
            }

            composable(
                route = Screen.AScreenRoute.route
            ){
                AScreen(navController = navController)
            }

            composable(
                route = Screen.BScreenRoute.route
            ){
                BScreen(navController = navController)
            }


        }

    }
}