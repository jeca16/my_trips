package br.senai.sp.jandira.my_trips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.my_trips.ui.theme.My_tripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_tripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Row (modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.End){
            Card (colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                modifier = Modifier
                    .width(130.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(
                    bottomStart = 25.dp
                )
            ){
            }
        }
        Column {

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    My_tripsTheme {
        Greeting()
    }
}