package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

 var Sum:Int=0
 var random:Int=0
    var random1:Int=0
    var SumA: Int = 0
    var SumB:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {

            random =(1..6).random()
           SumA= random
            when(random){

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

            random1 =(1..6).random()
            SumB=random1
            when(random1){
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
        button3.setOnClickListener {
            Sum= SumA+SumB
             textView.text="TOTAL="+Sum.toString()
        }

        }
    }


