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
fun HomeScreenPage(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Home:",
            style = TextStyle(
                fontSize = 30.sp
            )
        )

        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Button(onClick = {
                navController.navigate("ScreenA")
            }) {
                Text(text = "Go to A")
            }
            Spacer(
                modifier = Modifier
                    .height(30.dp)
            )
            Button(onClick = {
                navController.navigate("ScreenB")
            }) {
                Text(text = "Go to B")
            }

        }

    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun HomeScreenPagePreview(){
    HomeScreenPage(navController = rememberNavController())
}