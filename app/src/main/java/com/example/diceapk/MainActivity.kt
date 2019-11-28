package com.example.diceapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Short2
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    var Sum:Int=0
    var randomdice1:Int=0
    var randomdice2:Int=0
    var SumA: String="main"
    var SumB:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butt:Button = findViewById(R.id.button3)
        butt.setOnClickListener {

            textView.text= "Total="+(randomdice1+randomdice2).toString()
        }
        button.setOnClickListener {

            randomdice1 =(1..6).random()
            Sum=Sum+randomdice1
            when(randomdice1){

                1->{
                    imageView.setImageResource(R.drawable.dice1)}
                2->{imageView.setImageResource(R.drawable.dice2)}
                3->{imageView.setImageResource(R.drawable.dice3)}
                4->{imageView.setImageResource(R.drawable.dice4)}
                5->{imageView.setImageResource(R.drawable.dice5)}
                6->{imageView.setImageResource(R.drawable.dice6)}

            }



        }
        button2.setOnClickListener {

            randomdice2 =(1..6).random()
            Sum=Sum+randomdice2
            when(randomdice2){

                1->{
                    imageView2.setImageResource(R.drawable.dice1)
                }
                2->{imageView2.setImageResource(R.drawable.dice2)}
                3->{imageView2.setImageResource(R.drawable.dice3)}
                4->{imageView2.setImageResource(R.drawable.dice4)}
                5->{imageView2.setImageResource(R.drawable.dice5)}
                6->{imageView2.setImageResource(R.drawable.dice6)}

            }


        }

    }
}