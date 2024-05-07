package com.example.newtask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var emailInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        emailInput = findViewById(R.id.idemail)
        passwordInput = findViewById(R.id.idpassword)
        loginBtn = findViewById(R.id.idlogin)


        loginBtn.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }


    }
}