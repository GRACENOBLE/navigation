package com.example.spotifyclonenav.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController


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