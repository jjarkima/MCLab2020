package com.example.mclab2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_main.setOnClickListener {
            toast("Toasted!")
        }

        button_ta.setOnClickListener{
            val intent = Intent(applicationContext, TimeActivity::class.java)
            startActivity(intent)
        }

        button_ma.setOnClickListener {
            val intent = Intent(applicationContext, TimeActivity::class.java)
            startActivity(intent)
        }


    }
}
