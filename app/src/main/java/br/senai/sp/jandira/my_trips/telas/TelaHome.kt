package br.senai.sp.jandira.my_trips.telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.my_trips.R

@Composable
fun TelaHome(controleNavegacao: NavHostController) {

var pesquisaState = remember{
    mutableStateOf("")
}

    Surface (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue)
    ) {
        Column(modifier = Modifier
            .height(20.dp),
        ){
            Image(painter = painterResource(id = R.drawable.imagemparis),
                contentDescription = "imagem de Paris",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth())
        }

        Column {
            Row(horizontalArrangement = Arrangement.End) {
                Column(
                    modifier = Modifier
                        .padding(end = 20.dp, top = 20.dp, start = 20.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Card(
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp),
                        shape = CircleShape
                    ) {
                        Surface (modifier = Modifier.fillMaxSize()){
                            Image(
                                painter = painterResource(id = R.drawable.userimage),
                                contentDescription = "imagem de perfil",
                                contentScale = ContentScale.Crop
                            )
                        }

                    }
                    Text(
                        text = "Susanna Hoffs",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )

                }
            }
        }

        Column (modifier = Modifier
            .padding(
                start = 20.dp, end = 20.dp, top = 150.dp,),
        ) {
            Column(modifier = Modifier.padding(bottom = 20.dp)) {
                Row {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "localização",
                        tint = Color.White,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = "You're in Paris",
                        color = Color.White
                    )
                }
                Text(
                    text = "My Trips",
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Black
                )
            }


            Column(
                modifier = Modifier
                    .height(120.dp)
                    .padding(bottom = 10.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Categories",
                    fontSize = 17.sp
                )
                LazyRow {
                    items(20) {
                        Card(
                            modifier = Modifier
                                .width(150.dp)
                                .height(80.dp)
                                .padding(start = 20.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0))
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Icon(
                                    imageVector = Icons.Default.LocationOn,
                                    contentDescription = "locais",
                                    tint = Color.White,
                                )
                                Text(
                                    text = "Montain",
                                    color = Color.White,
                                    fontSize = 15.sp,

                                    )
                            }

                        }
                    }
                }

            }

            OutlinedTextField(
                value = pesquisaState.value,
                onValueChange = {
                                pesquisaState.value = it
                },
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "Search your destiny",
                        color = Color(0xFF8B898B))
                },
                shape = RoundedCornerShape(25.dp),
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "botão buscar",
                            tint = Color(0xFF8B898B)
                        )
                    }
                }
            )

            Column (modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)) {

                Text(text = "Past trips",
                    fontSize = 18.sp,)

                LazyColumn{
                    items(20){
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(230.dp)
                                .width(400.dp)
                                .padding(bottom = 10.dp),
                            elevation = CardDefaults.cardElevation(7.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ){
                            Surface (modifier = Modifier.fillMaxSize()) {
                                Image(painter = painterResource(id = R.drawable.london),
                                    contentDescription = "London",
                                    modifier = Modifier.padding(end = 5.dp, start = 5.dp, top = 5.dp),
                                    Alignment.TopCenter)

                                Column (verticalArrangement = Arrangement.Bottom,
                                    modifier = Modifier
                                        .height(180.dp)
                                        .padding(bottom = 5.dp, start = 10.dp)){
                                    Text(text = "London, 2019",
                                        color = Color(0xFFCF06F0),
                                        fontSize = 20.sp
                                    )

                                    Text(text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                        color = Color(0xFF8B898B),
                                        fontSize = 10.sp
                                    )
                                     Row ( horizontalArrangement = Arrangement.End,
                                         modifier = Modifier
                                             .fillMaxWidth()
                                             .padding(end = 15.dp)){
                                         Text(text = "18 Feb - 21 Feb",
                                             color = Color(0xFFCF06F0))
                                     }
                                }
                            }

                        }
                    }
                }
            }



        }

    }
}

@Preview
@Composable
fun TelaHomePreview() {
   //TelaHome()
}

//

