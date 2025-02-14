package com.example.restauranteapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.restauranteapp.databinding.ActivityResumoBinding

class ResumoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityResumoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent
        val totalPedido = i.extras?.getString("total")

        binding.textValorTotal.text="$totalPedido €"

    }
}