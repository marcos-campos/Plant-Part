package com.example.plantpart

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.plantpart.ui.main.MainFragment
import com.google.android.material.snackbar.Snackbar

class ActivityLogin : AppCompatActivity() {

     var SENHA = "12345";
     lateinit var btn_login: Button
    lateinit var btnCadastrarGmaill: Button

    //esse e o metodfo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setando o nome da tela
        setContentView(R.layout.main_fragment)

        //teste
        buscarComponentesPeloId();

        //botão Logingit add
        btn_login.setOnClickListener() {
            println("clicou no botão")
            val et_senha = findViewById<EditText>(R.id.et_senha)
            val senha = et_senha.getText().toString();

            //Reconhecer senha
            if (SENHA.equals(senha)) {
                val intent = Intent(this, MainFragment::class.java)
                startActivity(intent)
            } else {
                Snackbar.make(it, "senha inválida", Snackbar.LENGTH_SHORT).show()
            }
        }

        //botão cadastrar
       // btnCadastrarGmaill.setOnClickListener() {
       //     val intent = Intent(this, ActivityMainCadastroGmail::class.java)
        //    startActivity(intent)
       // }

    }

    private  fun buscarComponentesPeloId() {
        //btnCadastrarGmaill = findViewById<Button>(R.id.tv_gmail)
        btn_login = findViewById<Button>(R.id.btn_login)
    }

}





