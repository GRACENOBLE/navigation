package com.example.spotifyclonenav.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclonenav.navigation.Screen


@Composable
fun OutsideScreenPage(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            navController.navigate(route = Screen.HomeScreenRoute.route)
        }) {
            Text(text = "Go back to app")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun OutsideScreenPagePreview(){
    OutsideScreenPage(navController = rememberNavController())
}