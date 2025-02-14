package com.example.loginlistapp

class Utilizador(
    val username:String,
    val password:String,
    val anoCriacao: Int
){
    override fun toString(): String {
        return username
    }
}