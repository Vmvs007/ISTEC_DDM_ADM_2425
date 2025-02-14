package com.example.onlinestoreapp

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.onlinestoreapp.databinding.ActivityOnlineStoreBinding
import kotlin.math.roundToInt

class OnlineStoreActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityOnlineStoreBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaProdutos = ArrayList<Produto>()
        listaProdutos.add(Produto("Magalhães Renovado", "Magalhães", 50.99, 4.5))
        listaProdutos.add(Produto("Magalhães Tuning", "Magalhães", 55.99, 4.0))
        listaProdutos.add(Produto("Rato Magalhães", "Periféricos", 5.95, 2.9))
        listaProdutos.add(Produto("Teclado Magalhães", "Periféricos", 95.99, 12.0))
        listaProdutos.add(Produto("Phones Magalhães", "Audio", 25.95, 22.50))
        listaProdutos.add(Produto("Tapete Magalhães", "Periféricos", 200.95, 30.9))
        listaProdutos.add(Produto("Microphone Magalhães", "Periféricos", 1.50, 0.1))
        listaProdutos.add(Produto("Comando Magalhães", "Periféricos", 399.99, 99.99))
        listaProdutos.add(Produto("Volante Magalhães", "Periféricos", 3.50, 0.2))

        val listaCarrinho = ArrayList<Produto>()

        var arrayAdapterProdutos =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listaProdutos)
        binding.listProdutos.adapter = arrayAdapterProdutos

        var arrayAdapterCarrinho =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listaCarrinho)
        binding.listCarrinho.adapter = arrayAdapterCarrinho

        var pesoTotal: Double = 0.0
        var precoTotal: Double = 0.0

        // ADICIONAR AO CARRINHO
        binding.listProdutos.setOnItemClickListener { parent, view, position, id ->

            val mediaPlayer = MediaPlayer.create(applicationContext,R.raw.mariocoin)
            mediaPlayer.start()

            listaCarrinho.add(listaProdutos.get(position))

            arrayAdapterCarrinho =
                ArrayAdapter(this, android.R.layout.simple_list_item_1, listaCarrinho)
            binding.listCarrinho.adapter = arrayAdapterCarrinho

            // Atualizar preço e peso
            pesoTotal += (listaProdutos.get(position).pesoKg* 100).roundToInt().toDouble() / 100;
            precoTotal += (listaProdutos.get(position).preco* 100).roundToInt().toDouble() / 100;

            binding.textPeso.text = "${(pesoTotal* 100).roundToInt().toDouble() / 100} Kg. ";
            binding.textPreco.text = "| ${(precoTotal* 100).roundToInt().toDouble() / 100} €";

        }

        // REMOVER DO CARRINHO
        binding.listCarrinho.setOnItemClickListener { parent, view, position, id ->

            val mediaPlayer = MediaPlayer.create(applicationContext,R.raw.metalpipe)
            mediaPlayer.start()

            // Atualizar preço e peso
            pesoTotal -= (listaCarrinho.get(position).pesoKg* 100).roundToInt().toDouble() / 100;
            precoTotal -= (listaCarrinho.get(position).preco* 100).roundToInt().toDouble() / 100;

            binding.textPeso.text = "${(pesoTotal* 100).roundToInt().toDouble() / 100} Kg. ";
            binding.textPreco.text = "| ${(precoTotal* 100).roundToInt().toDouble() / 100} €";

            listaCarrinho.removeAt(position)

            arrayAdapterCarrinho =
                ArrayAdapter(this, android.R.layout.simple_list_item_1, listaCarrinho)
            binding.listCarrinho.adapter = arrayAdapterCarrinho


        }


    }
}