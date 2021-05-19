package com.example.plantpart.ui

import java.io.Serializable

data class Plant(val nomePlanta: String?, val origem: String?,
                 val descricaoPlanta: String?, val imagemPlanta: Int,
                val horarioRegar: String?) : Serializable