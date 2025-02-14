package com.example.intentextraapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentextraapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        var nomeUtilizadorMain = i.extras?.getString("nome")
        var apelidoUtilizadorMain = i.extras?.getString("apelido")

        binding.textCumprimentar.text= "Olá $nomeUtilizadorMain $apelidoUtilizadorMain"

    }
}