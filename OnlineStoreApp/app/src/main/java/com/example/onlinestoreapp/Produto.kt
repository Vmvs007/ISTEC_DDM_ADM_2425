package com.example.onlinestoreapp

class Produto(val nome: String, val categoria: String, val preco: Double, val pesoKg: Double) {

    override fun toString(): String {
        return categoria + "\t| " + nome + "\t| " + preco + " €"
    }
}