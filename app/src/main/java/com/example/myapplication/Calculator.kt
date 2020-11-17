package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // new -> old (=>new + old)
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

/*강사 풀이*/
/*package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // new -> old (new + old)
        var new = "0"
        var old = "0"

//        "1" + "2"="12"

        one.setOnClickListener {
            new = new + "1"
            result.setText(new)
        }
        two.setOnClickListener {
            new = new + "2"
            result.setText(new)
        }
        three.setOnClickListener {
            new = new + "3"
            result.setText(new)
        }
        four.setOnClickListener {
            new = new + "4"
            result.setText(new)
        }
        five.setOnClickListener {
            new = new + "5"
            result.setText(new)
        }
        six.setOnClickListener {
            new = new + "6"
            result.setText(new)
        }
        seven.setOnClickListener {
            new = new + "7"
            result.setText(new)
        }
        eight.setOnClickListener {
            new = new + "8"
            result.setText(new)
        }
        nine.setOnClickListener {
            new = new + "9"
            result.setText(new)
        }
        zero.setOnClickListener {
            new = new + "0"
            result.setText(new)
        }

        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            result.setText(old)
        }

        clear.setOnClickListener {
            new = "0"
            old = "0"
            result.setText("0")
        }
    }
}*/