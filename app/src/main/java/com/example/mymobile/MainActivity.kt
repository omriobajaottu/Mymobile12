package com.example.mymobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnForgotPassword = findViewById<Button>(R.id.btnForgotPassword)
        val btnShare = findViewById<Button>(R.id.btnShare) // Menambahkan tombol "Bagikan"

        btnRegister.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }


        btnForgotPassword.setOnClickListener {
            val intent = Intent(this, forget_password::class.java)
            startActivity(intent)
        }


        btnLogin.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        // Memulai intent implisit untuk membuka tautan YouTube

        btnShare.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "hallo.")
            }
            startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"))
        }
    }
}
