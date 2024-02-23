package com.example.spotifyclonenav.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.spotifyclonenav.screens.AScreen
import com.example.spotifyclonenav.screens.BScreen
import com.example.spotifyclonenav.screens.HomeScreenPage

fun NavGraphBuilder.app(navController: NavController){
    navigation(startDestination = Screen.NavRoute.route, route = Screen.AppRoute.route){
        composable(route = Screen.NavRoute.route){
            BottomNavBar(navController = navController)
        }
//        composable(route = Screen.AScreenRoute.route){
//            AScreen(navController = navController)
//        }
//        composable(route = Screen.BScreenRoute.route){
//            BScreen(navController = navController)
//        }
    }
}