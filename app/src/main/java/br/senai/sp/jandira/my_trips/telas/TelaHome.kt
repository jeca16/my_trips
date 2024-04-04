package br.senai.sp.jandira.my_trips.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.my_trips.R

@Composable
fun TelaHome(controleNavegacao: NavHostController) {
    Surface (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue)
    ) {
        Column {
            Image(painter = painterResource(id = R.drawable.imagemparis),
                contentDescription = "imagem de Paris",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth())
        }
        Column(modifier = Modifier
            .height(20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ){
            Row (horizontalArrangement = Arrangement.End){
                Column ( modifier = Modifier
                    .padding(end = 20.dp, top = 20.dp)
                    .fillMaxWidth(),
                    horizontalAlignment = Alignment.End){
                    Card ( modifier = Modifier
                        .width(60.dp)
                        .height(60.dp),
                        shape = CircleShape){
                        Image(painter = painterResource(id = R.drawable.userimage),
                            contentDescription = "imagem de perfil",
                            contentScale = ContentScale.Fit)

                    }
                    Text(text = "Susanna Hoffs",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold)

                }
            }

            Row (modifier = Modifier.fillMaxWidth()){
                Icon(imageVector = Icons.Default.LocationOn,
                    contentDescription = "localização",
                    tint = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
fun TelaHomePreview() {
  //  TelaHome()
}