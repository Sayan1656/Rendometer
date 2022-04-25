package com.example.rendomer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll= findViewById<Button>(R.id.btnRoll)
        val seekbar= findViewById<SeekBar>(R.id.seekBar)
        val tvResult= findViewById<TextView>(R.id.tvResult)

        btnRoll.setOnClickListener {
            val rand = Random().nextInt(seekbar.progress)
            tvResult.text= rand.toString()
        }
    }
}