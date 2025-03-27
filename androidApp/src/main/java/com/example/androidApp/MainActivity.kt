package com.example.androidApp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.skipline.shared.Validator

class MainActivity : AppCompatActivity() {

    private val validator = Validator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de que activity_main.xml exista en res/layout

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val validateButton = findViewById<Button>(R.id.validateButton)
        val textView = findViewById<TextView>(R.id.textView)

        validateButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            val isEmailValid = validator.validateEmail(email)
            val isPasswordValid = validator.validatePassword(password)

            textView.text = if (isEmailValid && isPasswordValid) {
                "Valid"
            } else {
                "Invalid"
            }
        }
    }
}
