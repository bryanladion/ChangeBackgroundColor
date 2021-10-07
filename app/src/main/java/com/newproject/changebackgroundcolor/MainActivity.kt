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
        //blue
        val blue = findViewById(R.id.blue_btn) as Button
        blue.setOnClickListener{
            layout.setBackgroundResource(R.drawable.blue_background)
        }
        //green
        val green =findViewById(R.id.green_btn) as Button
        green.setOnClickListener{
            layout.setBackgroundResource(R.drawable.green_background)
        }
        val black = findViewById(R.id.black_btn) as Button
        black.setOnClickListener{
            layout.setBackgroundResource(R.drawable.black_background)
        }
        val brown = findViewById(R.id.brown_btn) as Button
        brown.setOnClickListener{
            layout.setBackgroundResource(R.drawable.brown_background)
        }
        val orange = findViewById(R.id.orange_btn) as Button
        orange.setOnClickListener{
            layout.setBackgroundResource(R.drawable.orange_background)
        }
    }
}

