package com.assignment.hridyafinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
 var r1:Int=0
    var r2:Int=0
    var s1:Int=0
    var s2:Int=0
    var Sum:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            r1=(1..6).random()
            s1=r1
            when(r1)
            {
                1-> {imageView.setImageResource(R.drawable.dice_1)}
                2-> {imageView.setImageResource(R.drawable.dice_2)}
                3-> {imageView.setImageResource(R.drawable.dice_3)}
                4-> {imageView.setImageResource(R.drawable.dice_4)}
                5-> {imageView.setImageResource(R.drawable.dice_5)}
                6-> {imageView.setImageResource(R.drawable.dice_6)}


            }

        }
        button2.setOnClickListener {
            r2=(1..6).random()
            s2=r2
            when(r2)
            {
                1-> {imageView2.setImageResource(R.drawable.dice_1)}
                2-> {imageView2.setImageResource(R.drawable.dice_2)}
                3-> {imageView2.setImageResource(R.drawable.dice_3)}
                4-> {imageView2.setImageResource(R.drawable.dice_4)}
                5-> {imageView2.setImageResource(R.drawable.dice_5)}
                6-> {imageView2.setImageResource(R.drawable.dice_6)}


            }

        }
         button3.setOnClickListener {
             Sum=s1+s2
             textView.text="Total="+Sum.toString()
         }

        }
    }

