package com.example.restauranteapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.restauranteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonEfetuarPedido.setOnClickListener {

            var totalPedido: Double = 0.0

            var qntMassa: Int = 0
            var qntLasanha: Int = 0
            var qntPizza: Int = 0
            var qntFrancesinha: Int = 0
            var qntLitrosa: Int = 0


            if (binding.editQntMassa.text.toString().isNotEmpty()) {
                qntMassa = binding.editQntMassa.text.toString().toInt()
            }

            if (binding.editQntLasanha.text.toString().isNotEmpty()) {
                qntLasanha = binding.editQntLasanha.text.toString().toInt()
            }

            if (binding.editQntPizza.text.toString().isNotEmpty()) {
                qntPizza = binding.editQntPizza.text.toString().toInt()
            }

            if (binding.editQntFrancesinha.text.toString().isNotEmpty()) {
                qntFrancesinha = binding.editQntFrancesinha.text.toString().toInt()
            }

            if (binding.editQntLitrosa.text.toString().isNotEmpty()) {
                qntLitrosa = binding.editQntLitrosa.text.toString().toInt()
            }


            totalPedido =
                (qntMassa * 4.5) + (qntLasanha * 2.9) + (qntPizza * 9) + (qntFrancesinha * 9.5) + (qntLitrosa * 0.5)

            val i = Intent(this, PedidoActivity::class.java)
            i.putExtra("total", totalPedido.toString())
            startActivity(i)
        }


    }
}