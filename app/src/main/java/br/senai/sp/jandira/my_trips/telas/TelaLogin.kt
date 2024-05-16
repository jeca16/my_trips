package br.senai.sp.jandira.my_trips.telas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.my_trips.R

@Composable
fun TelaLogin(controleNavegacao: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")

    }
    var mensagemErroState = remember {
        mutableStateOf("")
    }

    Surface (modifier = Modifier.fillMaxSize()){
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
                Text(text = stringResource(id = R.string.login),
                    color = Color(0xFFCF06F0),
                    fontWeight = FontWeight.Black,
                    fontSize = 45.sp
                )
                Text(text = stringResource(id = R.string.text),
                    color = Color(0xFFA09C9C),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Light
                )
            }

            Column (horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()){
                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    modifier = Modifier
                        .padding(20.dp)
                        .width(350.dp),
                    label = {
                        Text(text = stringResource(id = R.string.email),
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
                    maxLines = 1
                    )

                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = {
                        senhaState.value = it
                    },
                    label = {
                        Text(text = stringResource(id = R.string.password),
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
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0), focusedBorderColor = Color(0xFFCF06F0)),
                    modifier = Modifier.width(350.dp),
                    maxLines = 1
                )

                Text(text = mensagemErroState.value,
                    color = Color.Red)

                Column {
                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 20.dp),
                        horizontalArrangement = Arrangement.End){
                        Button(onClick = {
                            if (emailState.value == "aluno" && senhaState.value == "1234"){
                                mensagemErroState.value = ""
                                controleNavegacao.navigate("home")
                            }else{
                                mensagemErroState.value = "usuario ou senha incorretos!!"
                            }
                        },
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .width(120.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFFCF06F0)),
                            shape = RoundedCornerShape(15.dp),

                            ) {
                            Text(text = stringResource(id = R.string.sign_in))
                            Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = "")
                        }
                    }

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 20.dp),
                        horizontalArrangement = Arrangement.End
                    ){
                        Text(text = stringResource(id = R.string.account),
                            fontWeight = FontWeight.Light,
                            color = Color(0xFFA09C9C),
                            fontSize = 15.sp)
                        Text(text =  stringResource(id = R.string.sign_up),
                            color = Color(0xFFCF06F0),
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            modifier = Modifier.clickable { controleNavegacao.navigate("Sign_in") }
                        )
                    }

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 165.dp)){
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
}

@Preview
@Composable
fun TelaLoginPreview() {
 //   TelaLogin()
}