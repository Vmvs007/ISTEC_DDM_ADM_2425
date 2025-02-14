package com.example.onlinestoreapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.onlinestoreapp.databinding.ActivityLoginBinding
import java.lang.Thread.sleep

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("magalhaes", Context.MODE_PRIVATE)
        val usernameGuardado = sharedPreferences.getString("username", "").toString()
        val passwordGuardada = sharedPreferences.getString("password", "").toString()

        binding.editUsername.setText(usernameGuardado)
        binding.editPassword.setText(passwordGuardada)

        val listaAcessos = ArrayList<Utilizador>()
        listaAcessos.add(Utilizador("vitor", "12345"))
        listaAcessos.add(Utilizador("joaquim", "quim"))
        listaAcessos.add(Utilizador("cr7", "georgina"))

        var acessoValido = false

        binding.buttonLogin.setOnClickListener {

            acessoValido = false

            var usernameInserido = binding.editUsername.text.toString()
            var passwordInserida = binding.editPassword.text.toString()

            for (i in 0..listaAcessos.size - 1) {
                if (usernameInserido.equals(listaAcessos.get(i).username) && passwordInserida.equals(
                        listaAcessos.get(i).password
                    )
                ) { // Acesso válido
                    // Avançar para Online Store Activity
                    acessoValido = true

                    Toast.makeText(this, "LOGIN EFETUADO... LOADING...", Toast.LENGTH_LONG).show()

                    // Guardar o acesso no sharedPreferences
                    val editor: SharedPreferences.Editor = sharedPreferences.edit()
                    editor.putString("username",usernameInserido)
                    editor.putString("password",passwordInserida)
                    editor.apply()

                    // Play audio
                    val mediaPlayer = MediaPlayer.create(applicationContext,R.raw.cr7)
                    mediaPlayer.start()
                    sleep(7000)

                    val i = Intent(this, OnlineStoreActivity::class.java)
                    startActivity(i)
                }
            }

            // Acesso inválido
            if (acessoValido == false) {
                Toast.makeText(this, "Acesso Inválido", Toast.LENGTH_SHORT).show()
            }

            binding.editUsername.setText("")
            binding.editPassword.setText("")

        }

    }
}