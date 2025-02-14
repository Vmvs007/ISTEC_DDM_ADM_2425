package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {

        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener{
            var username:String = binding.editUsername.text.toString()
            var password:String = binding.editPassword.text.toString()

            if(username.equals("admin") && password.equals("ronaldo")){
                val intent: Intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                binding.editUsername.setText("")
                binding.editPassword.setText("")
                Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
            }
        }

    }
}