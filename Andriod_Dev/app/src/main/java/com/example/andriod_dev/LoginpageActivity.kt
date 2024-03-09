package com.example.andriod_dev

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginpageActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        val usernameTextView: EditText = findViewById(R.id.username_view)
        val passwordTextView: EditText = findViewById(R.id.password_view)
        val loginDisplay: Button = findViewById(R.id.loginBtn)
        val name = "mohsin@gmail.com"
        val password = "123"

        loginDisplay.setOnClickListener {
            val userName = usernameTextView.text.toString()
            val userPassword = passwordTextView.text.toString()
            if (userName == name && userPassword == password) {
                Toast.makeText(applicationContext, "Successfully Verified", Toast.LENGTH_LONG)
                    .show()
            } else if (userName !== name && userPassword == password) {
                Toast.makeText(applicationContext, "Incorrect username", Toast.LENGTH_LONG).show()
            } else if (userPassword !== password && userName == name) {
                Toast.makeText(applicationContext, "Incorrect password", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Verification failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
