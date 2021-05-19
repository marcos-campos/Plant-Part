package com.example.plantpart.ui

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.plantpart.R

class Details : AppCompatActivity() {

    val detalheNome by lazy { findViewById<TextView>(R.id.details_titulo) }
    val detalheImagem by lazy { findViewById<ImageView>(R.id.details_imagem) }
    val detalheDescricao by lazy { findViewById<TextView>(R.id.details_descricao) }
    val detalheInfo by lazy { findViewById<TextView>(R.id.details_info) }
    val horarioDeRegar by lazy { findViewById<TextView>(R.id.details_horario_rega) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_activity)

        val informacoes = intent.extras

        if (informacoes != null) {

            val detalhesDasPlantas = informacoes.getSerializable("plantas") as Plant

            detalheNome.text = detalhesDasPlantas.nomePlanta
            detalheDescricao.text = detalhesDasPlantas.descricaoPlanta
            detalheInfo.text = detalhesDasPlantas.origem
            detalheImagem.setImageResource(detalhesDasPlantas.imagemPlanta)
            horarioDeRegar.text = detalhesDasPlantas.horarioRegar


        } else {

            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()

        }


    }

}