package com.example.week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1 = findViewById<EditText>(R.id.editTextView1);
        var num2 = findViewById<EditText>(R.id.editTextView2);

        findViewById<Button>(R.id.button).setOnClickListener() {
            var result = num1.text.toString().toInt() +
                    num2.text.toString().toInt();

            findViewById<TextView>(R.id.textView2).text =
                "Result: " + result.toString();
        }
    }
}