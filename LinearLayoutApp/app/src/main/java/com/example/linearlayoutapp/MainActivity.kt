package com.example.linearlayoutapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonEn.setOnClickListener {
            var mensagem: String = binding.editMensagem.text.toString()

            var mensagemTraduzida: String = ""

            if (mensagem.equals("Olá")) {
                mensagemTraduzida = "Hello"
            }

            binding.textMensagemTraduzida.text = mensagemTraduzida

            Toast.makeText(applicationContext, "MENSAGEM TRADUZIDA", Toast.LENGTH_SHORT).show()
        }

        binding.buttonPt.setOnClickListener {
            var mensagem: String = binding.editMensagem.text.toString()

            var mensagemTraduzida: String = ""

            if (mensagem.equals("Olá")) {
                mensagemTraduzida = "Olá"
            }

            binding.textMensagemTraduzida.text = mensagemTraduzida

            Toast.makeText(applicationContext, "MENSAGEM TRADUZIDA", Toast.LENGTH_SHORT).show()
        }

        binding.buttonFr.setOnClickListener {
            var mensagem: String = binding.editMensagem.text.toString()

            var mensagemTraduzida: String = ""

            if (mensagem.equals("Olá")) {
                mensagemTraduzida = "Salut"
            }

            binding.textMensagemTraduzida.text = mensagemTraduzida

            Toast.makeText(applicationContext, "MENSAGEM TRADUZIDA", Toast.LENGTH_SHORT).show()
        }

    }
}