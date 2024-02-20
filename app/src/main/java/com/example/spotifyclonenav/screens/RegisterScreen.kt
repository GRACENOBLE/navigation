package com.example.spotifyclonenav.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclonenav.navigation.Screen

@Composable
fun RegisterPage(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = "Register:",
            style = TextStyle(
                fontSize = 30.sp
            )
        )

        Button(onClick = {
            navController.navigate(route = Screen.HomeScreenRoute.route)
        }) {
            Text(text = "Go to home")
        }
    }
}
@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun RegisterPreview(){
    RegisterPage(navController = rememberNavController())
}