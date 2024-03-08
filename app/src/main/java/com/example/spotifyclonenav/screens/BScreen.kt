package com.example.spotifyclonenav.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclonenav.navigation.Screen
import java.lang.ref.Reference

@Composable
fun BScreen (param: Int){

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Text from A:",
            style = TextStyle(
                fontSize = 30.sp
            )
        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
        
       // Text(text = param)
        Image(
            painter = painterResource(id = param) , contentDescription = "Image from Screen A"
        )

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
//        Button(onClick = {
//            navController.navigate(route = Screen.HomeScreenRoute.route)
//        }) {
//            Text(text = "Back to home")
//        }
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
//        Button(onClick = {
//            navController.navigate(route = Screen.BScreenRoute.route)
//        }) {
//            Text(text = "Go to A")
//        }
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
//        Button(onClick = {
//            navController.navigate(route = Screen.OutsideScreenRoute.route)
//        }) {
//            Text(text = "Go to Outside Screen")
//        }
    }
}

//@Preview(
//    showBackground = true,
//    showSystemUi = true
//)
//@Composable
//fun BPreview() {
//    BScreen(navController = rememberNavController())
//}