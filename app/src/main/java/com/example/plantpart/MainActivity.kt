package com.example.plantpart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.plantpart.ui.main.MainFragment

class ActivityLogin : AppCompatActivity() {

    private val SENHA = "12345";
    lateinit var btn_login: Button


    //esse e o metodfo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setando o nome da tela
        setContentView(R.layout.main_fragment)

//teste
        buscarComponentesPeloId();

        //terminar esse projeto

        //botão Logingit add
        btn_login.setOnClickListener(){
            println("clicou no botão")}
            val et_senha =  findViewById<EditText>(R.id.et_senha)
            val senha = et_senha.getText().toString();

            //Reconhecer senha
            if(SENHA.equals(senha)) {
                val intent = Intent(this, MainFragment::class.java)
                startActivity(intent)
            }else{
          //      Snackbar.make(it, "senha inválida", Snackbar.LENGTH_SHORT).show()
            }
        }






    }

    fun buscarComponentesPeloId(){
      //  Button = findViewById<Button>(R.id.btn_login)
        //testeEmail = findViewById<TextView>(R.id.et_email)
    }





