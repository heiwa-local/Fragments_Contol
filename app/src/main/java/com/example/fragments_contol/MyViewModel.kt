package com.example.fragments_contol

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    val currentColor: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun onClickBtn(color : Int){
        currentColor.value = color
    }

    companion object {
        @Volatile
        private var INSTANCE: MyViewModel? = null

        fun getMyViewModel(): MyViewModel {
            return INSTANCE ?: synchronized(this){
                val instance = MyViewModel()
                INSTANCE = instance
                instance
            }
        }
    }
}