package com.example.viewmodelchallenge

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/14/21.
 */
class MainActivityViewModelFactory(private val startingTotal: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
           return MainActivityViewModel(startingTotal) as T
       }
        throw IllegalArgumentException("Unknown view model class")
    }
}