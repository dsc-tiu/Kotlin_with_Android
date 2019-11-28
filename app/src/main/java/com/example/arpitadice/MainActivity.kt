package com.example.arpitadice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var dice1:Int=0
    var dice2:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butt:Button = findViewById(R.id.button3)
        butt.setOnClickListener {

            textView.text= "Total="+(dice1+dice2).toString()
        }
        button.setOnClickListener {

            dice1 =(1..6).random()
            when(dice1){

                1->{
                    imageView.setImageResource(R.drawable.dice_1)
                }
                2->{imageView.setImageResource(R.drawable.dice_2)}
                3->{imageView.setImageResource(R.drawable.dice_3)}
                4->{imageView.setImageResource(R.drawable.dice_4)}
                5->{imageView.setImageResource(R.drawable.dice_5)}
                6->{imageView.setImageResource(R.drawable.dice_6)}

            }



        }
        button2.setOnClickListener {

            dice2 =(1..6).random()
            when(dice2){

                1->{
                    imageView2.setImageResource(R.drawable.dice_1)
                }
                2->{imageView2.setImageResource(R.drawable.dice_2)}
                3->{imageView2.setImageResource(R.drawable.dice_3)}
                4->{imageView2.setImageResource(R.drawable.dice_4)}
                5->{imageView2.setImageResource(R.drawable.dice_5)}
                6->{imageView2.setImageResource(R.drawable.dice_6)}

            }


        }

    }
}