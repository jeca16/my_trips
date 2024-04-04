package br.senai.sp.jandira.my_trips.telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.my_trips.R

@Composable
fun TelaCadastro(controleNavegacao: NavHostController) {
    var usernameState = remember {
        mutableStateOf("")
    }
    var phoneState = remember {
        mutableStateOf("")
    }
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    var checkboxState = remember {
        mutableStateOf(false)
    }

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (modifier =  Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween){
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

            Column (modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally,){
                Text(text = "Sign Up",
                    color = Color(0xFFCF06F0),
                    fontWeight = FontWeight.Black,
                    fontSize = 25.sp)
                Text(text = "Create a new account",
                    color = Color(0xFFA09C9C),
                    fontWeight = FontWeight.Light,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(bottom = 20.dp)
                )
                Card (shape = CircleShape,
                    modifier = Modifier.size(width = 80.dp, height = 80.dp),
                    border = BorderStroke(width = 1.dp, color = Color(0xFFCF06F0))

                ){
                    Image(painter = painterResource(id = R.drawable.perfil),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize())
                }

            }
            Column (modifier = Modifier
                .fillMaxWidth()
                .height(280.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ){
                OutlinedTextField(value = usernameState.value,
                    onValueChange = {
                        usernameState.value = it
                    },
                    label = {
                        Text(text = "username",
                            fontWeight = FontWeight.Light,)
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "",
                            tint = Color(0xFFCF06F0)
                        )
                    },
                    shape = RoundedCornerShape(18.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0), focusedBorderColor = Color(0xFFCF06F0)),
                    modifier = Modifier.width(350.dp))


                OutlinedTextField(value = phoneState.value,
                    onValueChange = {
                        phoneState.value = it
                    },
                    label = {
                        Text(text = "phone",
                            fontWeight = FontWeight.Light)
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.PhoneAndroid,
                            contentDescription = "",
                            tint = Color(0xFFCF06F0)
                        )
                    },
                    shape = RoundedCornerShape(18.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0), focusedBorderColor = Color(0xFFCF06F0)),
                    modifier = Modifier.width(350.dp))

                OutlinedTextField(value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = {
                        Text(text = "E-mail",
                            fontWeight = FontWeight.Light)
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = Color(0xFFCF06F0)
                        )
                    },
                    shape = RoundedCornerShape(18.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0), focusedBorderColor = Color(0xFFCF06F0)),
                    modifier = Modifier.width(350.dp))


                OutlinedTextField(value = senhaState.value ,
                    onValueChange = {
                        senhaState.value = it
                    },
                    label = {
                        Text(text = "password",
                            fontWeight = FontWeight.Light)
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color(0xFFCF06F0)
                        )
                    },
                    shape = RoundedCornerShape(18.dp),
                    colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFCF06F0), focusedBorderColor = Color(0xFFCF06F0)),
                    modifier = Modifier.width(350.dp))
            }
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.padding(start = 13.dp)){

                Checkbox(checked = checkboxState.value,
                    onCheckedChange = {
                        checkboxState.value = it
                    },
                    colors = CheckboxDefaults.colors(checkedColor = Color(0xFFCF06F0), uncheckedColor = Color(0xFFCF06F0)))
                Text(text = "over 18", color = Color.Black)
            }

            Row (horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()){
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(320.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFCF06F0)),
                    shape = RoundedCornerShape(15.dp),
                ) {
                    Text(text = "CREATE ACCOUNT",
                        fontWeight = FontWeight.Black,
                        fontSize = 15.sp
                    )
                }
            }

            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(end = 40.dp),
                horizontalArrangement = Arrangement.End
            ){
                Text(text = "Already have an account?",
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

@Preview
@Composable
fun TelaCadastroPreview() {
  //  TelaCadastro()
}