package com.example.andriod_dev
import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CounterActivity  : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.counter_view)

        val counter: Button =  findViewById(R.id.counterbtn)
        val counterTextView: TextView = findViewById(R.id.counter_text)
        counterTextView.text = "0"
        counter.setOnClickListener {
            val countValue = Integer.parseInt(counterTextView.text.toString())
            counterTextView.text = (countValue + 1).toString()
        }

        val textDsiplayButtonView: Button = findViewById(R.id.textDisplayBtn)
        val nameView: EditText = findViewById(R.id.name)

        textDsiplayButtonView.setOnClickListener {
            Log.e("logger -> ", "Click listner called")
            Toast.makeText(applicationContext,nameView.text.toString(),Toast.LENGTH_SHORT).show()

        }
    }
}