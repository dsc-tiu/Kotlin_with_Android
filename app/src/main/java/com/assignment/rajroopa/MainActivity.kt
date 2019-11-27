package com.assignment.rajroopa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var r1:Int=0
        var r2:Int=0
        var SA:Int=0
        var SB:Int=0
        var Total:Int=0

        button.setOnClickListener {
            r1=(1..6).random()
            SA=r1
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
            SB=r2
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
            Total=SA+SB
            textView.text=Total.toString()
        }



    }
}
