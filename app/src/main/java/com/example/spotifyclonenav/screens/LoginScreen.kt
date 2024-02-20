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
fun LoginPage(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Login:",
            style = TextStyle(
                fontSize = 30.sp
            )
        )

        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Button(onClick = {
                navController.navigate(Screen.HomeScreenRoute.route)
            }) {
                Text(text = "Login")
            }
            Spacer(
                modifier = Modifier
                    .height(30.dp)
            )
            Button(onClick = {
                navController.navigate(Screen.SetPassScreenRoute.route)
            }) {
                Text(text = "Forgot Password")
            }
            Spacer(
                modifier = Modifier
                    .height(30.dp)
            )
            Button(onClick = {
                navController.navigate(route = Screen.RegisterScreenRoute.route)
            }) {
                Text(text = "Register")
            }
        }

    }
}


@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun LoginPagePreview(){
    LoginPage(navController = rememberNavController())
}