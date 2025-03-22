package com.example.androidApp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity // Asegúrate de que esto está presente
import com.example.skipline.Greeting // Importa el Greeting desde commonMain

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = Greeting().sayHello()
            textSize = 24f
            setPadding(32, 100, 32, 32)
        }

        setContentView(textView)
    }
}
