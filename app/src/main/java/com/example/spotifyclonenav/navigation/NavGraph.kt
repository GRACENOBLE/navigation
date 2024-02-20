package com.example.spotifyclonenav.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclonenav.screens.AScreen
import com.example.spotifyclonenav.screens.BScreen
import com.example.spotifyclonenav.screens.HomeScreenPage
import com.example.spotifyclonenav.screens.LoginPage
import com.example.spotifyclonenav.screens.RegisterPage
import com.example.spotifyclonenav.screens.SetPassPage

@Composable
fun Nav (){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.AuthenticationRoute.route
    ){

        authGraph(navController)

        //////////////////////////////////////////////////

        app(navController)

    }

}