package com.example.calculadoraimc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val altura = findViewById<EditText>(R.id.altEDT)
        val peso = findViewById<EditText>(R.id.pesoEDT)
        val title  = findViewById<TextView>(R.id.titleTXT)
        val botao = findViewById<Button>(R.id.calcBNT)

        altura?.doAfterTextChanged { text ->
            title.text = text
        }

        peso?.doOnTextChanged { text, _, _, _ ->
            title.text = text}

        botao?.setOnClickListener {
            calcularIMC(peso.text.toString(), altura.text.toString())
        }

    }

    private fun calcularIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        val title  = findViewById<TextView>(R.id.titleTXT)
        val classificacao = findViewById<TextView>(R.id.classificacaoTXT)
        var imc : Float = 0.0f

        if(peso != null && altura != null){
            imc = peso / (altura * altura)
            title.text = "Seu IMC é: \n%.2f".format(imc)
            classificacao.text = checkIMC(imc)
            checkClass(imc)
        } else if(imc == 0f){

        }

        if(peso == 0f && altura == 0f ) {
            title.text = "Informe os valores corretos"
            classificacao.text = ""
        }
    }

    private fun checkIMC(valor: Float) : String {
        return when(valor) {
            in 1.0..17.0 -> "Muito abaixo do peso"
            in 17.0..18.49 -> "Abaixo do peso"
            in 18.5..24.99 -> "Peso ideal"
            in 25.0..29.99 -> "Sobrepeso"
            in 30.0..34.99 -> "Obesidade"
            in 35.0..39.99 -> "Obesidade severa"
            in 0.0..0.9 -> "Informe os valores corretos"
            else -> "Obesidade morbida"
        }
    }

    private fun checkClass(valor: Float){
        val classificacao = findViewById<TextView>(R.id.classificacaoTXT)
         when(valor) {
            in 1f..17f -> classificacao.setTextColor(Color.YELLOW)
            in 17.0..18.49 -> classificacao.setTextColor(Color.YELLOW)
            in 18.5..24.99 -> classificacao.setTextColor(Color.GREEN)
            in 25.0..29.99 -> classificacao.setTextColor(Color.YELLOW)
            in 30.0..34.99 -> classificacao.setTextColor(Color.RED)
            in 35.0..39.99 -> classificacao.setTextColor(Color.RED)
            in 0f..0f -> classificacao.setTextColor(Color.BLUE)
            else -> classificacao.setTextColor(Color.RED)
        }
    }



}