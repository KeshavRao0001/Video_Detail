package com.example.videodetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.videodetails.Utils.Common

@Composable
fun Details() {
    Surface(
        color = Common.navyBlue,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            ImageCard()
            Heading_Details(
                "Presented by:",
                "Celtics vs Wizards: Full Game Highlights",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitatio…",
            )
            TripleButton()
        }
    }
}

@Composable
fun ImageCard() {
    Box(
        modifier = Modifier
            .background(Common.navyBlue),
        contentAlignment = Alignment.Center
    )
    {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(10.dp)
                .clip(RoundedCornerShape(10.dp)),
            painter = painterResource(id = R.drawable.crouselimage),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Icon(
            painter = painterResource(id = R.drawable.playicon),
            contentDescription = null,
            modifier = Modifier.size(50.dp),
            tint = Color.White
        )
    }
}

@Composable
fun Heading_Details(
    presentedBy:String,
    vsText:String ,
    desc:String
) {
    Column(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(0.dp, 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                modifier = Modifier
                    .padding(end = 17.dp),
                text = presentedBy,
                style = MaterialTheme.typography.subtitle1,
                fontStyle = FontStyle.Italic,
                color = Color.White
            )
            Image(
                painter = painterResource(id = R.drawable.poweredby),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(86.dp, 29.dp),
            )
        }

        Text(
            text = vsText,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text =desc,
            color = Color.White


        )

    }
}

@Composable
fun TripleButton() {
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
            backgroundColor = Common.lightNavy,
        ) {
            Icon(modifier = Modifier
                .padding(13.dp),
                painter = painterResource(id = R.drawable.combined_shape),
                contentDescription = null,
                tint = Color.White
            )


        }
        Spacer(modifier = Modifier.width(10.dp))
        Card(
            Modifier
                .height(40.dp)
                .width(40.dp),
            shape = RoundedCornerShape(5.dp),
            elevation = 4.dp,
            backgroundColor = Common.lightNavy,
        ) {
            Icon(modifier = Modifier
                .padding(13.dp),
                painter = painterResource(id = R.drawable.shape),
                contentDescription = null,
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Card(
            Modifier
                .height(40.dp)
                .width(40.dp),
            shape = RoundedCornerShape(5.dp),
            elevation = 4.dp,
            backgroundColor = Common.lightNavy,
        ) {
            Icon(modifier = Modifier
                .padding(13.dp),
                painter = painterResource(id = R.drawable.resource_default),
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}