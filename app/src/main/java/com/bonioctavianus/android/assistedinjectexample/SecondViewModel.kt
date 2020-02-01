package com.bonioctavianus.android.assistedinjectexample

import android.util.Log
import androidx.lifecycle.ViewModel
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

class SecondViewModel @AssistedInject constructor(
    @Assisted val id: Int
) : ViewModel() {

    init {
        Log.d(SecondViewModel::class.java.simpleName, "Received Value: $id")
    }

    @AssistedInject.Factory
    interface Factory {
        fun create(id: Int): SecondViewModel
    }
}