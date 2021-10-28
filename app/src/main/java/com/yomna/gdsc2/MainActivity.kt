package com.yomna.gdsc2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var etusername:EditText
    private lateinit var etemail:EditText
    private lateinit var etpassword:EditText
    private lateinit var etvalid:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etusername =findViewById (R.id.editTextTextPersonName)
        etemail =findViewById(R.id.editTextTextEmailAddress)
        etpassword =findViewById(R.id.editTextTextPassword)
        etvalid =findViewById(R.id.button)

        etvalid.setOnClickListener {

            val user = etusername.text.toString().trim()
            val email = etusername.text.toString().trim()
            val pass = etusername.text.toString().trim()
            if (user.isEmpty())
            {

               etusername.error = "username Required"
                return@setOnClickListener
            }
            if (email.isEmpty()) {
                etemail.error = "email Required"
                return@setOnClickListener

            }
            if (pass.isEmpty())
            {
                etpassword.error = "password Required"
                return@setOnClickListener

            }
            else
            {

                val Intent = Intent (this,hello::class.java)
                startActivity(Intent)

            }

        }




       val secondAct =findViewById<Button>(R.id.secondActivityBtn)
        secondAct .setOnClickListener {
            val Intent = Intent (this,signin::class.java)
            startActivity(Intent)
        }
        val hh =findViewById<Button>(R.id.button)
        hh .setOnClickListener {
            val Intent = Intent (this,hello::class.java)
            startActivity(Intent)
        }

    }
}