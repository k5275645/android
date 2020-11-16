package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // new -> old (new + old)
        var new = "0"
        var old = "0"

        one.setOnClickListener {
            new = new + "1"
            main.setText(new)
        }

        two.setOnClickListener {
            new = new + "2"
            main.setText(new)
        }

        three.setOnClickListener {
            new = new + "3"
            main.setText(new)
        }

        four.setOnClickListener {
            new = new + "4"
            main.setText(new)
        }

        five.setOnClickListener {
            new = new + "5"
            main.setText(new)
        }

        six.setOnClickListener {
            new = new + "6"
            main.setText(new)
        }

        seven.setOnClickListener {
            new = new + "7"
            main.setText(new)
        }

        eight.setOnClickListener {
            new = new + "8"
            main.setText(new)
        }

        nine.setOnClickListener {
            new = new + "9"
            main.setText(new)
        }

        zero.setOnClickListener {
            new = new + "0"
            main.setText(new)
        }

        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            main.setText(old)
        }

        clear.setOnClickListener {
            old = "0"
            new = "0"
            main.setText("0")
        }

    }
}