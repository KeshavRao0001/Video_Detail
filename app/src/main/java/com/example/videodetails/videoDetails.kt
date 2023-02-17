package com.example.videodetails

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Details(){
    Column (
        modifier = Modifier.fillMaxSize()
            ){
        ImageCard()
        Textt()
        Iconss()
    }

}

@Composable
fun ImageCard(

){
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp),

        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = null,
        contentScale = ContentScale.Crop


    )
}

@Composable
fun Textt(){
    Column(modifier = Modifier
        .padding(10.dp)) {
        Row(modifier = Modifier
            .padding(0.dp,10.dp)) {
            Text(text = "Presented by:",
                style = MaterialTheme.typography.subtitle1,
                fontStyle = FontStyle.Italic)

            Card(
                Modifier
                    .height(40.dp)
                    .width(40.dp),
                elevation = 4.dp,
                backgroundColor = Color.Blue,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }

        }

        Text(text = "Celtics vs Wizards: Full Game Highlights",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitatio…"


            )

    }
}

@Composable
fun Iconss() {
    Row(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp),
    ) {
        Card(
            Modifier
                .height(40.dp)
                .width(40.dp),
            elevation = 4.dp,
            backgroundColor = Color.Blue,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Card(
            Modifier
                .height(40.dp)
                .width(40.dp),
            shape = RoundedCornerShape(5.dp),
            elevation = 4.dp,
            backgroundColor = Color.Blue,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                contentScale = ContentScale.Crop

            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Card(
            Modifier
                .height(40.dp)
                .width(40.dp),
            shape = RoundedCornerShape(5.dp),
            elevation = 4.dp,
            backgroundColor = Color.Blue,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                contentScale = ContentScale.Crop

            )
        }


    }

}