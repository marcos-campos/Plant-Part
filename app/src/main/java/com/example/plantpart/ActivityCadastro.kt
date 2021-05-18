package com.example.plantpart

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.plantpart.ui.main.MainFragment
import com.google.android.material.snackbar.Snackbar

class ActivityCadastro : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val nomeDoUsuario = findViewById<EditText>(R.id.username).text
        val emailDoUsuario = findViewById<EditText>(R.id.email).text
        val senhaDoUsuario = findViewById<EditText>(R.id.Password).text
        val confirmacaoSenhaDoUsuario = findViewById<EditText>(R.id.conf_password).text

        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)
        btnCadastrar.setOnClickListener {

            validacaoCadastro(nomeDoUsuario.toString(),  emailDoUsuario.toString(),
                    senhaDoUsuario.toString(), confirmacaoSenhaDoUsuario.toString())
        }

    }

    private fun validacaoCadastro(nome: String, email: String, senha: String, confirmacaoSenha: String) : Boolean {
        val nomeError = findViewById<EditText>(R.id.username)
        val emailError = findViewById<EditText>(R.id.email)
        val senhaError = findViewById<EditText>(R.id.Password)
        val confirmacaoSenhaError = findViewById<EditText>(R.id.conf_password)

        when {
            nome.isEmpty() -> {
                Toast.makeText(this, "Nome invalido", Toast.LENGTH_SHORT).show()
                nomeError.error = "Campo obrigatório"
                return false

            }
            email.isEmpty() -> {
                Toast.makeText(this, "Sobrenome invalido", Toast.LENGTH_SHORT).show()
                emailError.error = "Campo obrigatório"
                return false

            }
            senha.isEmpty() -> {
                Toast.makeText(this, "Telefone invalido", Toast.LENGTH_SHORT).show()
                senhaError.error = "Campo obrigatório"
                return false

            }
            confirmacaoSenha.isEmpty() -> {
                Toast.makeText(this, "Email invalido", Toast.LENGTH_SHORT).show()
                confirmacaoSenhaError.error = "Campo obrigatório"
                return false

            } else -> {

            Toast.makeText(this, "Usuário cadastrado", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)

            return true

            }
        }
    }
}





