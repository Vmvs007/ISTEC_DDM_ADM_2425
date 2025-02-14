package com.example.intentextraapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentextraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonAvancar.setOnClickListener {

            var nomeUtilizador: String = binding.editNomeUtilizador.text.toString()
            var apelidoUtilizador: String = binding.editApelidoUtilizador.text.toString()

            val i: Intent = Intent(this, SecondActivity::class.java)

            i.putExtra("nome", nomeUtilizador)
            i.putExtra("apelido",apelidoUtilizador)


            startActivity(i)

        }

    }
}