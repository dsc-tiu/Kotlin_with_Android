package com.assignment.hridyareupload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

abstract class MainActivity : AppCompatActivity() {
    var r1:Int=0
    var r2:Int=0
    var S1:Int=0
    var S2:Int=0
    var total:Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        button.setOnClickListener {


            dice1()

        }
        button2.setOnClickListener {



            dice2()

        }
        button3.setOnClickListener {
            total=r1+r2
            textView.text="Total"+total.toString()
        }
    }

    private fun dice2() {
        r2=(1..6).random()
        S2=r2
         val dl=when(r2) {
            1 -> R.drawable.dice_1
            2 ->  R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
             else -> R.drawable.empty_dice

        }

        imageView2.setImageResource(dl)


    }

    private fun dice1()
    { r1=(1..6).random()
        S1=r1
        val d1= when(r1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6

            else -> R.drawable.empty_dice
        }
        imageView.setImageResource(d1)
    }
}
