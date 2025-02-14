package com.example.loginlistapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginlistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaUtilizadores = ArrayList<Utilizador>()
        listaUtilizadores.add(Utilizador("admin", "123", 2024))
        listaUtilizadores.add(Utilizador("it", "password123", 2024))
        listaUtilizadores.add(Utilizador("RH", "rh22", 2025))
        listaUtilizadores.add(Utilizador("RP", "rp25", 2025))
        listaUtilizadores.add(Utilizador("ceo", "ceo123", 2025))
        listaUtilizadores.add(Utilizador("CR7", "georgina", 2022))

        val arrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listaUtilizadores)
        binding.listUtilizadores.adapter = arrayAdapter

        binding.listUtilizadores.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"${listaUtilizadores.get(position).password}",Toast.LENGTH_SHORT).show()
        }

    }
}