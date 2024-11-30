package com.example.lab2version2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var number1: EditText
    lateinit var number2: EditText
    lateinit var btn_add: Button
    lateinit var btn_minus: Button
    lateinit var btn_times: Button
    lateinit var btn_divide: Button
    lateinit var textview_result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        btn_add = findViewById(R.id.btn_add)
        btn_minus = findViewById(R.id.btn_minus)
        btn_times = findViewById(R.id.btn_times)
        btn_divide = findViewById(R.id.btn_divide)
        textview_result = findViewById(R.id.answer)

        btn_add.setOnClickListener{
            val num1 = number1.text.toString().toInt()
            val num2 = number2.text.toString().toInt()
            val res = num1 + num2
            textview_result.text = res.toString()

            btn_minus.setOnClickListener {
                val num1 = number1.text.toString().toInt()
                val num2 = number2.text.toString().toInt()
                val res = num1 - num2
                textview_result.text = res.toString()

                btn_times.setOnClickListener {
                    val num1 = number1.text.toString().toInt()
                    val num2 = number2.text.toString().toInt()
                    val res = num1 * num2
                    textview_result.text = res.toString()

                    btn_divide.setOnClickListener {
                        val num1 = number1.text.toString().toInt()
                        val num2 = number2.text.toString().toInt()
                        val res = num1 / num2
                        textview_result.text = res.toString()
                    }
                }
            }
        }
    }
}