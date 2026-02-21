package com.dhiyana.snapeats

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Apply edge-to-edge display settings
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars: Insets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up a click listener for the "next" button
        findViewById<View>(R.id.order).setOnClickListener {
            val intent = Intent(this@SignUp, SiginIn::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.signinBtn2).setOnClickListener {
            val intent = Intent(this@SignUp, SiginIn::class.java)
            startActivity(intent)
        }
    }
}