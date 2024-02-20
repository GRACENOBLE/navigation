package com.example.spotifyclonenav.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.spotifyclonenav.screens.LoginPage
import com.example.spotifyclonenav.screens.RegisterPage
import com.example.spotifyclonenav.screens.SetPassPage

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation(startDestination = Screen.LoginScreenRoute.route, route = Screen.AuthenticationRoute.route){
        composable(route = Screen.LoginScreenRoute.route){
            LoginPage(navController = navController)
        }
        composable(route = Screen.RegisterScreenRoute.route){
            RegisterPage(navController = navController)
        }
        composable(route = Screen.SetPassScreenRoute.route){
            SetPassPage(navController = navController)
        }
    }
}