package br.senai.sp.jandira.my_trips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.my_trips.R
import br.senai.sp.jandira.my_trips.model.Categoria

class CategoriaRepositorio {
    @Composable
    fun listarTodasCategorias (): List<Categoria>  {

        val Montain = Categoria(
            id = 1,
            nome = "Montain",
            icone = painterResource(id = R.drawable.montain)
        )

        val Snow = Categoria(
            id = 2,
            nome = "Snow",
            icone = painterResource(id = R.drawable.snow)
        )

        val Praia = Categoria(
            id = 3,
            nome = "Beach",
            icone = painterResource(id = R.drawable.beach)
        )

        return listOf(Montain, Snow, Praia)
    }
}

