package com.example.my_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var Sum:Int=0
    var rolldice:Int=0
    var rolldice2:Int=0
    var SumA: String="main"
    var SumB:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butt:Button = findViewById(R.id.button3)
        butt.setOnClickListener {

            textView.text= "Total="+(rolldice+rolldice2).toString()
        }
        button.setOnClickListener {

            rolldice =(1..6).random()
            Sum=Sum+rolldice
            when(rolldice){

                1->{ imageView.setImageResource(R.drawable.one)}
                2->{imageView.setImageResource(R.drawable.two)}
                3->{imageView.setImageResource(R.drawable.three)}
                4->{imageView.setImageResource(R.drawable.four)}
                5->{imageView.setImageResource(R.drawable.five)}
                6->{imageView.setImageResource(R.drawable.six)}

            }



        }
        button2.setOnClickListener {

            rolldice2 =(1..6).random()
            Sum=Sum+rolldice2
            when(rolldice2){

                1->{ imageView2.setImageResource(R.drawable.one)}
                2->{imageView2.setImageResource(R.drawable.two)}
                3->{imageView2.setImageResource(R.drawable.three)}
                4->{imageView2.setImageResource(R.drawable.four)}
                5->{imageView2.setImageResource(R.drawable.five)}
                6->{imageView2.setImageResource(R.drawable.six)}

            }


        }

    }
}

