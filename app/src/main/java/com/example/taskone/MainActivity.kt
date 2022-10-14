package com.example.taskone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var etName : EditText
    lateinit var btnHappy : Button
    lateinit var btnSad : Button
    lateinit var btnMad : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.et_name)
        btnHappy = findViewById(R.id.btn_happy)
        btnSad = findViewById(R.id.btn_sad)
        btnMad = findViewById(R.id.btn_mad)

        btnHappy.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please input your name",
                    Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
            Toast.makeText(
                applicationContext,
                "Hi " + etName.text + " You are happy today.",
                Toast.LENGTH_SHORT).show()

        }
        btnSad.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please input your name",
                    Toast.LENGTH_SHORT)
                    return@setOnClickListener
                }
            Toast.makeText(
                applicationContext,
                "Hi " + etName.text + " You are sad today.",
                Toast.LENGTH_SHORT).show()

            }
        btnMad.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please input your name",
                    Toast.LENGTH_SHORT)
                return@setOnClickListener
            }
            Toast.makeText(
                applicationContext,
                "Hi " + etName.text + " You are mad today.",
                Toast.LENGTH_SHORT).show()
        }

    }


}

