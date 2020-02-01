package com.bonioctavianus.android.assistedinjectexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class SecondActivity : AppCompatActivity() {

    private val viewModelFactory: SecondViewModelFactory by lazy {
        (application as App).graph.secondViewModelFactory.create(
            id = intent.getIntExtra("id", -1)
        )
    }

    private lateinit var viewModel: SecondViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        viewModel = ViewModelProvider(this, viewModelFactory).get(SecondViewModel::class.java)
    }
}