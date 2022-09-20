package com.example.businesscardapp

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.DefaultTintBlendMode
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppPage()
                }
            }
        }
    }
}

@Composable
fun AppPage() {
    Column() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .weight(2F)
        ) {
            val image = painterResource(id = R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .wrapContentSize()
                    .size(120.dp)
            )
            ProfileText(
                name = "David Dada",
                title = "Android Developer Extraordinaire"
            )
        }
        ContactDetails(modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.BottomCenter)
            .weight(1F)
            .padding(24.dp)
        )
    }
}

@Composable
fun ProfileText(name: String, title: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text (
            text = name,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify
        )
        Text(
            text = title,
            color = Color.Green,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
private fun ContactDetails(modifier: Modifier) {
    Column(modifier) {
        //Phone contact
        Column(modifier = Modifier.padding(bottom = 24.dp)) {
            Row() {
                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = null
                )
                Text(
                    text = "+234 705 370 2976",
                    textAlign = TextAlign.End,
                    modifier = Modifier.padding(start = 36.dp)
                    )
            }
        }
        //Social Contact
        Column(modifier = Modifier.padding(bottom = 24.dp)) {
            Row() {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = null
                )
                Text(
                    text = "@daveproxy80",
                    textAlign = TextAlign.End,
                    modifier = Modifier.padding(start = 36.dp)
                )
            }
        }
        //Email address
        Column(modifier = Modifier.padding(bottom = 24.dp)) {
            Row() {
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = null
                )
                Text(
                    text = "daveproxy80@gmail.com",
                    textAlign = TextAlign.End,
                    modifier = Modifier.padding(start = 36.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        AppPage()
    }
}