package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var randomInt:Int = 0
    var randomInt1:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceButton : Button = findViewById(R.id.button)
        val diceButton2 : Button = findViewById(R.id.button2)
        val diceTotal :Button = findViewById(R.id.button3)
        diceButton.setOnClickListener{
            dice()
        }
        diceButton2.setOnClickListener{
            dice2()
        }
        diceTotal.setOnClickListener {
            total()
        }


    }


    private fun dice() {
         randomInt = Random().nextInt(6) + 1

        val diceImages = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        val diceImage:ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(diceImages)
    }
    private fun dice2() {
         randomInt1 = Random().nextInt(6) + 1

        val diceImages = when(randomInt1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        val diceImage:ImageView = findViewById(R.id.dice_image2)
        diceImage.setImageResource(diceImages)
    }

    private fun total(){
        var sum:Int = randomInt+randomInt1;
        var myText:TextView = findViewById(R.id.textView2)
        myText.text = "total = "+sum.toString();



    }
}