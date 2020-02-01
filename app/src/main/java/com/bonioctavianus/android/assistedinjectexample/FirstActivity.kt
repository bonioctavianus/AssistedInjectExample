package com.bonioctavianus.android.assistedinjectexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        button_go_to_second_activity.setOnClickListener {
            startSecondActivity()
        }
    }

    private fun startSecondActivity() {
        startActivity(
            Intent(this, SecondActivity::class.java).apply {
                putExtra("id", 10)
            }
        )
    }
}