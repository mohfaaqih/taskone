package com.example.taskone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val btnHappy = findViewById<Button>(R.id.btn_happy)
    val btnSad = findViewById<Button>(R.id.btn_sad)
    val btnMad = findViewById<Button>(R.id.btn_mad)
    lateinit var etName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = intent.getStringExtra("result")

        btnHappy.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please input your name",
                    Toast.LENGTH_SHORT)
                    while (etName.text.isNotEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Hi $result, You are <happy> today.",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
            }
        }
        btnSad.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please input your name",
                    Toast.LENGTH_SHORT)
                    while (etName.text.isNotEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Hi $result, You are <sad> today.",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
            }

        }
        btnMad.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please input your name",
                    Toast.LENGTH_SHORT)
                    while (etName.text.isNotEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Hi $result, You are <mad> today.",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
            }
        }

    }
}


