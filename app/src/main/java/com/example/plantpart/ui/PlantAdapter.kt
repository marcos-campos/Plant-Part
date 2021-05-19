package com.example.plantpart.ui

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plantpart.R

class PlantAdapter(val listPlants: MutableList<Plant>): RecyclerView.Adapter<PlantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.lista_plantas, parent, false)
        return PlantViewHolder(view)
    }

    override fun getItemCount(): Int = listPlants.size

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
        val nome = holder.namePlant
        nome.text = listPlants[position].nomePlanta

        val origem = holder.originPlant
        origem.text = listPlants[position].origem

        val imagem = holder.imagePlant
        imagem.setImageResource(listPlants[position].imagemPlanta)

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, Details::class.java)

            intent.putExtra("plantas", listPlants[position])

            it.context.startActivity(intent)
        }
    }
}