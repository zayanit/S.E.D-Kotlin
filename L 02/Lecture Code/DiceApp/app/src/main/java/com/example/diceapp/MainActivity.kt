package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // set UI design to activity
        setContentView(R.layout.activity_main)

        // get button id
        val roll_btn = findViewById<Button>(R.id.roll_dice_btn)

        // define dice object
        var dice = Dice(6)

        // get imageview id
        val dice_img = findViewById<ImageView>(R.id.dice_img)

       // add click event to button and listen to execute roll funtion
        roll_btn.setOnClickListener {

            // roll dice and return value of random number
           val dice_no  = dice.roll()

            // switch over random value to change imageview content according to value
            when(dice_no){

                1 -> dice_img.setImageResource(R.drawable.dice_1)
                2 -> dice_img.setImageResource(R.drawable.dice_2)
                3 -> dice_img.setImageResource(R.drawable.dice_3)
                4 -> dice_img.setImageResource(R.drawable.dice_4)
                5 -> dice_img.setImageResource(R.drawable.dice_5)
                6 -> dice_img.setImageResource(R.drawable.dice_6)
            }
        }
    }





}