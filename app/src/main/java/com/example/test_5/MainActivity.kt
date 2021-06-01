package com.example.test_5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var insert_name:EditText
    lateinit var greet:Button
    lateinit var name:TextView
    
    if (savedInstanceState!= null){
            val a = savedInstanceState.getString("name")
            name.text = "Hello, $a"
        }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        insert_name = findViewById(R.id.text)
        greet = findViewById(R.id.greet)
        name = findViewById(R.id.show_name)

        greet.setOnClickListener {
            name.text = "Hello, ${insert_name.text.trim()}"
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("name", insert_name.text.toString().trim())
    }
}
