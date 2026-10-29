package com.cristina.oceanoapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SaludoActivity : AppCompatActivity() {


    private lateinit var etNombre: EditText
    private lateinit var btnSaludar: Button
    private lateinit var txtSaludo: TextView
    private lateinit var switchModo: Switch



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_saludo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        inicializarVistas()
        configurarEventoSaludo()
        configurarSwitch()
    }


    private fun inicializarVistas() {
        etNombre = findViewById(R.id.etNombre)
        btnSaludar = findViewById(R.id.btnSaludar)
        txtSaludo = findViewById(R.id.txtResultado)
        switchModo = findViewById(R.id.switchModo)

    }

    private fun configurarEventoSaludo(){
        btnSaludar.setOnClickListener {
            val nombre = etNombre.text.toString()
            if (nombre.isEmpty()) {
                Toast.makeText(this, "Inserte nombre", Toast.LENGTH_LONG)
                    .show()
                //txtSaludo.text = "Por favor, escribe un nombre"
            } else {
                txtSaludo.text = "Hola "+ nombre
            }

            btnSaludar.text = "Boton pulsado"
            btnSaludar.setTextColor(Color.BLACK)
        }
    }

    private fun configurarSwitch(){
        switchModo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {

            } else {

            }
        }
    }


}