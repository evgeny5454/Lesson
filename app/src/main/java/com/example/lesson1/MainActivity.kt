package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.nio.file.Files.copy
import java.util.Collections.copy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dataClass: List<Data>


        var button = findViewById<View>(R.id.float_button)
        var textView: TextView = findViewById(R.id.text)

        dataClass = listOf(Data("name", 56))

        textView.text

        dataClass = listOf(Data("Name", 45))

        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "test", Toast.LENGTH_LONG).show()
        })
    }
}