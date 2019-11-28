package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var v1: Int = 0
    var v2: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceButton1: Button = findViewById(R.id.button1)
        val diceButton2: Button = findViewById(R.id.button2)

        diceButton1.setOnClickListener {
            dice1()
        }
        diceButton2.setOnClickListener {
            dice2()
        }
        button3.setOnClickListener {
            val add = v1 + v2
            textView.text = "Total sum=" + add.toString()
        }
    }

    private fun dice1() {
        val randomInt1 = Random().nextInt(6) + 1

        val diceImages = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        v1 = randomInt1
        val diceImage1: ImageView = findViewById(R.id.dice_image1)
        diceImage1.setImageResource(diceImages)
    }

    private fun dice2() {
        val randomInt2 = Random().nextInt(6) + 1

        val diceImages = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        v2 = randomInt2
        val diceImage2: ImageView = findViewById(R.id.dice_image2)
        diceImage2.setImageResource(diceImages)
    }
}