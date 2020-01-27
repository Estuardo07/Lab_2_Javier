package com.example.fitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num = 0
        var total = 10

        round_button.setOnClickListener{
            num++
            when (num) {
                1 -> counter.setText("1")
                2 -> counter.setText("2")
                3 -> counter.setText("3")
                4 -> counter.setText("4")
                5 -> counter.setText("5")
                6 -> counter.setText("6")
                7 -> counter.setText("7")
                8 -> counter.setText("8")
                9 -> counter.setText("9")
                10 -> {
                    counter.setText("10")
                    Toast.makeText(this, "¡Felicidades!", Toast.LENGTH_LONG).show()
                    image1.setImageResource(R.drawable.medal)
                    image1.visibility = View.VISIBLE
                    total = 20
                }
                11 -> counter.setText("11")
                12 -> counter.setText("12")
                13 -> counter.setText("13")
                14 -> counter.setText("14")
                15 -> counter.setText("15")
                16 -> counter.setText("16")
                17 -> counter.setText("17")
                18 -> counter.setText("18")
                19 -> counter.setText("19")
                20 -> {
                    counter.setText("20")
                    image1.setImageResource(R.drawable.trophie)
                    image1.visibility = View.VISIBLE
                    Toast.makeText(this, "¡Logrado!", Toast.LENGTH_LONG).show()
                }
            }
        }

        round_button.setOnLongClickListener(){
            Toast.makeText(this, "Faltan " + (total - num) + " vueltas para el siguiente objetivo", Toast.LENGTH_LONG).show()
            return@setOnLongClickListener true
        }

        restart_button.setOnClickListener{
            num = 0
            total = 10
            counter.setText("0")
            image1.visibility = View.INVISIBLE
        }

    }
}
