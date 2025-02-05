package com.example.third_application

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnMultiplier = this.findViewById<Button>(R.id.multiplication_btn)
        var btnDivider = this.findViewById<Button>(R.id.dividing_btn)
        var btnAdder = this.findViewById<Button>(R.id.adding_btn)
        var btnSubtractor = this.findViewById<Button>(R.id.subtraction_btn)
        var btnSin = this.findViewById<Button>(R.id.sin_btn)
        var btnModules = this.findViewById<Button>(R.id.modules_btn)
        var btnPower = this.findViewById<Button>(R.id.power_btn)
        var btnClear = this.findViewById<Button>(R.id.clear_btn)

        var firstNum = this.findViewById<EditText>(R.id.first_number)
        var secondNum = this.findViewById<EditText>(R.id.second_number)
        var resultNum = this.findViewById<TextView>(R.id.result)


        btnMultiplier.setOnClickListener(){
            var firstNumber = firstNum.text.toString().toDouble()
            var secondNumber = secondNum.text.toString().toDouble()
            var resultNumber = firstNumber * secondNumber
            resultNum.text = resultNumber.toString()
        }

        btnDivider.setOnClickListener(){
            var firstNumber = firstNum.text.toString().toDouble()
            var secondNumber = secondNum.text.toString().toDouble()
            var resultNumber = firstNumber / secondNumber
            resultNum.text = resultNumber.toString()
        }

        btnAdder.setOnClickListener(){
            var firstNumber = firstNum.text.toString().toDouble()
            var secondNumber = secondNum.text.toString().toDouble()
            var resultNumber = firstNumber + secondNumber
            resultNum.text = resultNumber.toString()
        }

        btnSubtractor.setOnClickListener(){
            var firstNumber = firstNum.text.toString().toDouble()
            var secondNumber = secondNum.text.toString().toDouble()
            var resultNumber = firstNumber - secondNumber
            resultNum.text = resultNumber.toString()
        }

        btnSin.setOnClickListener(){
            var firstNumber = firstNum.text.toString().toDouble()
            var resultNumber = Math.sin(Math.toRadians(firstNumber))
            resultNum.text = resultNumber.toString()
        }

        btnModules.setOnClickListener(){
            var firstNumber = firstNum.text.toString().toDouble()
            var secondNumber = secondNum.text.toString().toDouble()
            var resultNumber = firstNumber % secondNumber
            resultNum.text = resultNumber.toString()
        }

        btnPower.setOnClickListener(){
            var firstNumber = firstNum.text.toString().toDouble()
            var secondNumber = secondNum.text.toString().toDouble()
            var resultNumber = Math.pow(firstNumber, secondNumber)
            resultNum.text = resultNumber.toString()
        }

        btnClear.setOnClickListener(){
            firstNum.setText("")
            secondNum.setText("")
            resultNum.setText("")
        }

    }
}