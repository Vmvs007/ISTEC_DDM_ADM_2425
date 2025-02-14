package com.example.listviewapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaNomes = ArrayList<String>()
        listaNomes.add("Vitor")
        listaNomes.add("Joaquim")
        listaNomes.add("Joana")
        listaNomes.add("João")
        listaNomes.add("António")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNomes)
        binding.listNomes.adapter = arrayAdapter

        binding.listNomes.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this,"Olá ${listaNomes.get(position)}",Toast.LENGTH_SHORT).show()
        }

    }
}