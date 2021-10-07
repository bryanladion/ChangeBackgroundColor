package com.newproject.changebackgroundcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click_button = findViewById(R.id.click_me_btn) as Button
        click_button.setOnClickListener{
            Toast.makeText(applicationContext,"Bryan B. Ladion",Toast.LENGTH_LONG).show()
        }
        //yellow
        var layout = findViewById(R.id.constraintLayout) as ConstraintLayout
        val yellow =findViewById(R.id.yellow_btn) as Button
        yellow.setOnClickListener{
           layout.setBackgroundResource(R.drawable.yellow_background)
        }
    }
}

