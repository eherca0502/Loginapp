package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGoRegistrar = findViewById<TextView>(R.id.tv_go_to_registrar)
        tvGoRegistrar.setOnClickListener{
            goToRegistrar()
        }
    }
    private fun goToRegistrar(){
        val i= Intent(this,RegistrarActivity::class.java)
        startActivity(i)
    }
}