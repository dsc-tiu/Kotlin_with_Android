package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var randomInt: Int = 0
    var randomInt1: Int = 0
    var sum: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceButton: Button = findViewById(R.id.button)

        diceButton.setOnClickListener {
            dice()
        }


        fun dice() {
             randomInt = Random().nextInt(6) + 1

            val diceImages = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }


            val diceImage: ImageView = findViewById(R.id.dice_image)
            diceImage.setImageResource(diceImages)
        }


        val diceRollerg: Button = findViewById(R.id.Rollerg)
        diceRollerg.setOnClickListener {
            dice()
        }
        val diceTotal: Button = findViewById(R.id.niladri)
        diceTotal.setOnClickListener {
            dice3()
        }
    }


    fun dice() {
             randomInt1 = Random().nextInt(6) + 1

            val diceImages = when (randomInt1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }
            val diceImage: ImageView = findViewById(R.id.dice_nilu)
            diceImage.setImageResource(diceImages)
        }

    fun dice3() {
        var sum: Int = randomInt + randomInt1;
        var myText:TextView= findViewById(R.id.textView)
        myText.text= "Total ="+ sum.toString();


    }
    }
