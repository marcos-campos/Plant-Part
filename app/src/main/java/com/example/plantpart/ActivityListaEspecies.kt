package com.example.plantpart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plantpart.ui.Plant
import com.example.plantpart.ui.PlantAdapter

class ActivityListaEspecies : AppCompatActivity() {

    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view_plantas) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_especies)

        val tiposPlantas = listaDePlantas()

        recycler.layoutManager = LinearLayoutManager(this)

        val adapter = PlantAdapter(tiposPlantas as MutableList<Plant>)

        recycler.adapter = adapter
    }

    private fun listaDePlantas(): List<Plant> {

        val listaPlantas = mutableListOf<Plant>()

        listaPlantas.add(Plant("Dólar-de-prata","Ásia, Bálcãs, Europa" ,"A dólar-de-prata é uma planta herbácea, que pode se comportar como anual ou bienal, de florescimento e frutificação ornamentaisl.", R.drawable.tipo_planta_01))
        listaPlantas.add(Plant("Rosa-do-deserto", "Iêmen, Oriente Médio, Península Arábica","O Adenium arabicum ocorre ao longo da margem sul e oeste da Península Arábica, que compreende principalmente o Iêmen e a Arábia Saudita.", R.drawable.tipo_planta_02))
        listaPlantas.add(Plant("Begônia-maculata", "América do Sul, Brasil","A begônia-maculata é uma planta herbácea, de folhagem e florescimento ornamentais.", R.drawable.tipo_planta_03))
        listaPlantas.add(Plant("Orquídea-abacaxi", "Ásia, Filipinas, Nova Guiné, Oceania","A Robiquetia cerina é uma orquídea natural, de crescimento monopodial, originária das Filipinas e Papua Nova Guiné.", R.drawable.tipo_planta_04))
        listaPlantas.add(Plant("Bifrenaria", "América do Sul, Brasil","A Bifrenaria harrisoniae é uma orquídea natural, simpodial, de comportamento epífito a ocasionalmente rupícola, ou seja, ela cresce sobre os galhos das árvores, mas pode aparecer entre rochas.", R.drawable.tipo_planta_05))
        listaPlantas.add(Plant("Brassocattleya Pastoral", "América Central, América do Sul, Brasil, Colômbia","Desenvolvida por Rolf Altenburg em 1961, na Florália Orquidários Reunidos de Niterói (RJ), esta orquídea é originária de cruzamentos entre as espécies Cattleya trianei (Colômbia), Cattleya mossiae (Venezuela).", R.drawable.tipo_planta_06))
        listaPlantas.add(Plant("Vanda-teres", "Ásia, Birmânia, Butão, China","A vanda-teres é uma orquídea de crescimento monopodial, que se desenvolve sobre os ramos de árvores (epífita) e possuem flores grandes e bonitas, que lembram borboletas", R.drawable.tipo_planta_07))
        listaPlantas.add(Plant("Cattleya nobilior", "América do Sul, Brasil","A Cattleya nobilior Rchb.f.,1883. é uma orquídea simpodial e epífita, típica do bioma de cerrado, onde vegeta próxima a rios, lagos e fontes de água.", R.drawable.tipo_planta_08))

        return listaPlantas

    }
}