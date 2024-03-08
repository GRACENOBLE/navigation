package com.example.spotifyclonenav.screens

import android.app.Activity
import androidx.compose.foundation.Image
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclonenav.R
import com.example.spotifyclonenav.navigation.Screen

@Composable
fun AScreen (onNavigateToScreenB: (Int) -> Unit){
    val imageOne = R.drawable.believer_poster
    val imageTwo = R.drawable.katy_perry
    val screenName = "A"
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = imageOne),
            contentDescription = null
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Image(
            painter = painterResource(id = imageTwo),
            contentDescription = null
        )
        Text(
            text = screenName,
            style = TextStyle(
                fontSize = 30.sp
            )
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
        Button(onClick = {
            onNavigateToScreenB(imageOne)
        }) {
            Text(text = "Go to B with ImageOne")
        }
        Button(onClick = {
            onNavigateToScreenB(imageTwo)
        }) {
            Text(text = "Go to B with ImageTwo")
        }
    }
}

//@Preview(
//    showBackground = true,
//    showSystemUi = true
//)
//@Composable
//fun APreview(){
//    AScreen(navController = rememberNavController())
//}