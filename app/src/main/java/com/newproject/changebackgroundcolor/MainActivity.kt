package com.newproject.changebackgroundcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yellow_sound= MediaPlayer.create(this,R.raw.yellow_audio)
        val blue_sound= MediaPlayer.create(this,R.raw.blue_audio)
        val green_sound= MediaPlayer.create(this,R.raw.green_audio)
        val black_sound= MediaPlayer.create(this,R.raw.black_audio)
        val brown_sound= MediaPlayer.create(this,R.raw.brown_audio)
        val orange_sound= MediaPlayer.create(this,R.raw.orange_audio)
        val msatlogo_sound= MediaPlayer.create(this,R.raw.msatlogo_audio)
        val msatlogo_music= MediaPlayer.create(this,R.raw.coding)
        val clickme_sound= MediaPlayer.create(this,R.raw.clickme_audio)
        val click_button = findViewById(R.id.click_me_btn) as Button
        click_button.setOnClickListener{
            Toast.makeText(applicationContext,"Bryan B. Ladion",Toast.LENGTH_LONG).show()
            clickme_sound.start()
        }
        val logo =findViewById(R.id.msatLogo) as ImageView
        var x = 1
            logo.setOnClickListener{
                x+=1
                if(x%2==0) {
                    msatlogo_sound.start()
                    msatlogo_music.start()
                }else{
                    msatlogo_sound.pause()
                    msatlogo_music.pause()
                }
            }
        //yellow
        var layout = findViewById(R.id.constraintLayout) as ConstraintLayout
        val yellow =findViewById(R.id.yellow_btn) as Button
        yellow.setOnClickListener{
           layout.setBackgroundResource(R.drawable.yellow_background)
            yellow_sound.start()
        }
        //blue
        val blue = findViewById(R.id.blue_btn) as Button
        blue.setOnClickListener{
            layout.setBackgroundResource(R.drawable.blue_background)
            blue_sound.start()
        }
        //green
        val green =findViewById(R.id.green_btn) as Button
        green.setOnClickListener{
            layout.setBackgroundResource(R.drawable.green_background)
            green_sound.start()
        }
        val black = findViewById(R.id.black_btn) as Button
        black.setOnClickListener{
            layout.setBackgroundResource(R.drawable.black_background)
            black_sound.start()
        }
        val brown = findViewById(R.id.brown_btn) as Button
        brown.setOnClickListener{
            layout.setBackgroundResource(R.drawable.brown_background)
            brown_sound.start()
        }
        val orange = findViewById(R.id.orange_btn) as Button
        orange.setOnClickListener{
            layout.setBackgroundResource(R.drawable.orange_background)
            orange_sound.start()
        }


        //making logic for the counter.
        val increase =findViewById(R.id.increase_btn) as Button
        val decrease =findViewById(R.id.decrease_btn) as Button

        var count = 0
        val print_count=findViewById(R.id.counter) as TextView
        increase.setOnClickListener{
            count +=1
            print_count.text =count.toString()
        }
        decrease.setOnClickListener{
            count -=1
            print_count.text = count.toString()
        }


    }
}

