package com.example.spotifyclonenav.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationElement(
    val title: String,
    val icon: ImageVector,
    val route: String
)