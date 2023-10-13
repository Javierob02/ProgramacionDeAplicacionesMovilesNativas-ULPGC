package com.example.myinfo

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myinfo.ui.theme.MyInfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyInfoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NombreYTitulo()
                }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Contacto()
                }
            }
        }
    }
}

@Composable
fun NombreYTitulo() {
    Image(
        painter = painterResource(id = R.drawable.person_icon_img), // Replace with your image resource
        contentDescription = null,
        modifier = Modifier
            .size(150.dp) // Adjust the size as needed
            .clip(CircleShape)
    )
    Spacer(modifier = Modifier.height(16.dp))   //Separador
    Text(text = "Aitor Menta", color = Color.Blue, fontSize = 35.sp)
    Text(text = "Dr. Neurólogo", color = Color.Blue)
}

@Composable
fun Contacto() {
    Text(text = "+00 (00) 000 000", color = Color.Yellow)
    Text(text = "@socialmediahandle", color = Color.Yellow)
    Text(text = "email@domail.com", color = Color.Yellow)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MyInfoTheme() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
                .wrapContentSize(Alignment.Center) // Center the content
                .background(color = Color.Gray)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.padding(100.dp).fillMaxSize()) {
                NombreYTitulo()
                Spacer(modifier = Modifier.height(50.dp))
                Contacto()
            }
        }
    }
}