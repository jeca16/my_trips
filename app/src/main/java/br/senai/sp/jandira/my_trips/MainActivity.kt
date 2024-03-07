package br.senai.sp.jandira.my_trips

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
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
    Column (
        modifier =  Modifier
            .fillMaxHeight()
    ) {
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End){
            Card (colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                modifier = Modifier
                    .width(130.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(
                    bottomStart = 15.dp
                )
            ){
            }

        }
        Column (horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(top = 150.dp, start = 15.dp, bottom = 70.dp)
                ){
            Text(text = "Login",
                color = Color(0xFFCF06F0),
                fontWeight = FontWeight.Black,
                fontSize = 45.sp
            )
            Text(text = "Please sign in to continue.",
                color = Color(0xFFA09C9C),
                fontSize = 13.sp,
                fontWeight = FontWeight.Light
            )
        }

        Column (horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()){
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .padding(20.dp)
                    .width(350.dp),
                label = {
                    Text(text = "E-mail",
                        fontWeight = FontWeight.Light
                    )
                },
                leadingIcon ={
                             Icon(
                                 imageVector = Icons.Default.Email,
                                 contentDescription = "",
                                 tint = Color(0xFFCF06F0)
                             )
                },
                shape = RoundedCornerShape(15.dp),
                colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0), focusedBorderColor = Color(0xFFCF06F0)),

            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Password",
                        fontWeight = FontWeight.Light)

                },
                leadingIcon = {
                              Icon(
                                  imageVector = Icons.Default.Lock,
                                  contentDescription = "",
                                  tint = Color(0xFFCF06F0)
                              )
                },
                shape = RoundedCornerShape(15.dp),
                colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0)),
                modifier = Modifier.width(350.dp)
            )

            Column {
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                    horizontalArrangement = Arrangement.End){
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .width(120.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFFCF06F0)),
                        shape = RoundedCornerShape(15.dp),

                        ) {
                        Text(text = "SIGN IN")
                        Icon(imageVector = Icons.Default.ArrowForward,
                            contentDescription = "")
                    }
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp, bottom = 145.dp),
                    horizontalArrangement = Arrangement.End
                    ){
                    Text(text = "Don’t have an account?",
                        fontWeight = FontWeight.Light,
                        color = Color(0xFFA09C9C),
                        fontSize = 15.sp)
                    Text(text = "Sign in",
                        color = Color(0xFFCF06F0),
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }

                Row (modifier = Modifier.fillMaxWidth()){
                    Card (colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                        modifier = Modifier
                            .width(130.dp)
                            .height(40.dp),
                        shape = RoundedCornerShape(
                            topEnd = 15.dp
                        )
                    ){

                    }
                }
            }


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
@Composable
fun cadastro(){

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun cadastroPreview() {
    My_tripsTheme {
        cadastro()

    }
}


