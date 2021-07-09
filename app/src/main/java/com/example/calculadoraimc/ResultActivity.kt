package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.calculadoraimc.classes.DicasDoDia

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val bntOk = findViewById<Button>(R.id.nextBNT)
        bntOk.setOnClickListener { chageScreen() }
        setDicas()
    }


   private fun setDicas() {
        val dica = findViewById<TextView>(R.id.dicasTXT)
        val result  = DicasDoDia()
        dica.text = result.dicasDoDia()
    }

    private fun chageScreen() {
        val segundaTela = Intent(this, MainActivity::class.java)
        startActivity(segundaTela)
    }

}