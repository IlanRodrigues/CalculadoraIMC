package com.example.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular: Button = findViewById(R.id.calcular)
        val edtPeso: EditText = findViewById(R.id.edittext_Peso)
        val edtAltura: EditText = findViewById(R.id.edittext_Altura)

        calcular.setOnClickListener {

            val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {
                val altura: Float = alturaStr.toFloat()
                val alturafinal: Float = altura * altura
                val peso: Float = pesoStr.toFloat()
                val result: Float = peso / alturafinal

                val intent = Intent(this, ResultActivity::class.java)
                    .apply {
                        putExtra("extra_result", result)
                    }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
            }
            }
        }
    }



