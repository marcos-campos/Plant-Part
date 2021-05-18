package com.example.plantpart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityLogin : AppCompatActivity() {

    val btnCadastrar by lazy { findViewById<Button>(R.id.btn_cadastro) }
    val btnLogin by lazy { findViewById<Button>(R.id.btn_login) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        logar()
        cadastrar()

    }

    fun logar() {

        btnLogin.setOnClickListener {
            val intent = Intent(this, ActivityListaEspecies::class.java)
            startActivity(intent)
        }
    }

    fun cadastrar() {

        btnCadastrar.setOnClickListener {
            val intent = Intent(this, ActivityCadastro::class.java)
            startActivity(intent)
        }
    }
}