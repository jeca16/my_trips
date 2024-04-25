package br.senai.sp.jandira.my_trips.model

import androidx.compose.ui.graphics.painter.Painter

data class Categoria(
    var id: Int = 0,
    var icone: Painter? = null,
    var nome: String = ""
)
