package com.bonioctavianus.android.assistedinjectexample

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

class SecondViewModel(id: Int) : ViewModel() {

    init {
        Log.d(SecondViewModel::class.java.simpleName, "Received Value: $id")
    }
}

class SecondViewModelFactory @AssistedInject constructor(
    @Assisted private val id: Int
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(Int::class.java)
            .newInstance(id)
    }

    @AssistedInject.Factory
    interface Factory {
        fun create(id: Int): SecondViewModelFactory
    }
}