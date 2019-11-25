package com.example.mydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.dice_button)

        button.setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll() {
        val randomNumberDice = Random().nextInt(6)+1

        val diceImage = when(randomNumberDice){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6

            else -> R.drawable.empty_dice
        }

        val  diceImageView : ImageView = findViewById(R.id.dice_image)
        diceImageView.setImageResource(diceImage)
    }
}