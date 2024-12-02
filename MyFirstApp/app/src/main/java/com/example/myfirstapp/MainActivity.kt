package com.example.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonCumprimentar.setOnClickListener{ // Evento do clique do botão - sempre que o botão for carregado, este código vai ser executado

            var nomeUtilizador : String = binding.editNome.text.toString() // Buscar o nome
            binding.textCumprimentar.text="Olá $nomeUtilizador" // Cumprimentar pelo nome

        }

    }
}