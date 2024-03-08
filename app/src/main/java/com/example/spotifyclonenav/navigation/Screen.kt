package com.example.spotifyclonenav.navigation

sealed class Screen(val route: String) {
    data object AScreenRoute: Screen(route = "A")
    data object BScreenRoute: Screen(route = "B/{imageOne}")
    data object HomeScreenRoute: Screen(route = "Home")
    data object LoginScreenRoute: Screen(route = "Login")
    data object RegisterScreenRoute: Screen(route = "Register")
    data object SetPassScreenRoute: Screen(route = "SetPass")
    data object AuthenticationRoute: Screen(route =  "Auth")
    data object AppRoute: Screen(route =  "App")
    data object NavRoute: Screen(route = "Nav")
    data object OutsideScreenRoute: Screen(route = "OutsideScreen")
}