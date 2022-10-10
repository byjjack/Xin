package com.example.mykt.te

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.mykt.R

class HActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hactivity)
        val rollButton: Button = findViewById(R.id.roll_button);

        rollButton.setOnClickListener { rollDice() }

    }


    private fun rollDice() {
        val randomInt = (1..6).random()
//        val resultText: TextView = findViewById(R.id.result_text);
//        resultText.text = randomInt.toString()
        diceImage = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}