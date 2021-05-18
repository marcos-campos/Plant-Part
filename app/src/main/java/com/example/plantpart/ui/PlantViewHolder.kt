package com.example.plantpart.ui

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.plantpart.R

class PlantViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val originPlant by lazy { view.findViewById<TextView>(R.id.tv_origem) }
    val namePlant by lazy { view.findViewById<TextView>(R.id.tv_nome_planta) }
    val imagePlant by lazy { view.findViewById<ImageView>(R.id.iv_imagem_planta) }
}