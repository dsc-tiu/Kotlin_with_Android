package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.mydice.R
import java.util.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dice: Button = findViewById(R.id.button)
        val dice1: Button = findViewById(R.id.button1)
        var button:Button=findViewById(R.id.button2)
        var a:Int
        var b:Int
        var c:Int
        dice.setOnClickListener {
            a = diceroller()
            var diceImages = when (a) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }
            var diceImage: ImageView = findViewById(R.id.dice_image)
            diceImage.setImageResource(diceImages)
            dice1.setOnClickListener { b = diceroller2()
                var images1 = when (b) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    6 -> R.drawable.dice_6
                    else -> R.drawable.empty_dice
                }
                var diceImage1: ImageView = findViewById(R.id.dice_image1)
                diceImage1.setImageResource(images1)
                var add: TextView = findViewById(R.id.textView)
                button.setOnClickListener { c = a + b
                    add.setText(Integer.toString(c))
                }
            }
        }
    }
}
fun diceroller(): Int {
    var number = Random().nextInt(6) + 1
    return number
}
fun diceroller2(): Int {
    var number1 = Random().nextInt(6) + 1
    return number1
}

