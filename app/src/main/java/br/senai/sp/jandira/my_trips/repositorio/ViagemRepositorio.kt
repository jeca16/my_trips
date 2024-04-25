package br.senai.sp.jandira.my_trips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.my_trips.R
import br.senai.sp.jandira.my_trips.model.Viagem
import java.time.LocalDate
class ViagemRepositorio {

    @Composable

    fun listarTodasAsViagens(): List<Viagem> {
        val londres = Viagem(
            id = 1,
            destino = "Londres",
            descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.londres)
        )

        val Franca = Viagem(
            id = 2,
            destino = "França",
            descricao = "A França, na Europa Ocidental, tem cidades medievais, aldeias alpinas e praias mediterrâneas.",
            dataChegada = LocalDate.of(2019, 3, 19),
            dataPartida = LocalDate.of(2019, 3, 22),
            imagem = painterResource(id = R.drawable.franca)

        )

        val Alemanha = Viagem(
            id = 3,
            destino = "Alemanha",
            descricao = "A Alemanha é um país situado na Europa Ocidental com uma paisagem de florestas, rios, cordilheiras e praias do Mar do Norte.",
            dataChegada = LocalDate.of(2019, 3, 19),
            dataPartida = LocalDate.of(2019, 3, 22),
            imagem = painterResource(id = R.drawable.alemanha)

            )

        val Japao = Viagem(
            id = 4,
            destino = "Japão",
            descricao = "O Japão, país insular no Oceano Pacífico, tem cidades densas, palácios imperiais, parques nacionais montanhosos e milhares de santuários e templos. ",
            dataChegada = LocalDate.of(2020, 3, 19),
            dataPartida = LocalDate.of(2020, 4, 10),
            imagem = painterResource(id = R.drawable.japao)
        )

        val Russia = Viagem(
            id = 5,
            destino = "Russia",
            descricao = "A Rússia, o país mais extenso do mundo, faz fronteira com países europeus e asiáticos e é banhada pelos oceanos Pacífico e Ártico.",
            dataChegada = LocalDate.of(2020, 4, 11),
            dataPartida = LocalDate.of(2020, 5, 23),
            imagem = painterResource(id = R.drawable.russia)
        )

        return listOf(londres, Franca, Alemanha, Japao, Russia)

    }
}