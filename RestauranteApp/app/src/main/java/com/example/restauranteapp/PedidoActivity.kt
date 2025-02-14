package com.example.restauranteapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class PedidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        val i = intent
        val totalPedido = i.extras?.getString("total")


        Handler(Looper.getMainLooper()).postDelayed({

            val iResumo = Intent(this, ResumoActivity::class.java)

            iResumo.putExtra("total", totalPedido.toString())

            startActivity(iResumo)
            finish()

        }, 4000)

    }
}