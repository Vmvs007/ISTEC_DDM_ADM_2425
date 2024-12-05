package com.example.activityapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonVoltarMain.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}