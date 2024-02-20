package com.example.spotifyclonenav.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclonenav.navigation.Screen

@Composable
fun AScreen (navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "A",
            style = TextStyle(
                fontSize = 30.sp
            )
        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
        Button(onClick = {
            navController.navigate(route = Screen.HomeScreenRoute.route)
        }) {
            Text(text = "Back to home")
        }
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
        Button(onClick = {
            navController.navigate(route = Screen.BScreenRoute.route)
        }) {
            Text(text = "Go to B")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun APreview(){
    AScreen(navController = rememberNavController())
}