package com.yomna.gdsc2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val hh =findViewById<Button>(R.id.button)
        hh .setOnClickListener {
            val Intent = Intent (this,hello::class.java)
            startActivity(Intent)
        }
    }
}