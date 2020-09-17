package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_tela_historico.*
import kotlinx.android.synthetic.main.activity_tela_historico.view.*
import org.json.JSONObject

class telaHistorico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_historico)

        //Usando uma String concatenada com ";" para receber o histórico
        val historico = intent.getStringExtra("historico")

    }
}