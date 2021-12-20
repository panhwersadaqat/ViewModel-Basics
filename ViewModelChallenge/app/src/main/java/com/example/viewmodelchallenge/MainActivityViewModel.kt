package com.example.viewmodelchallenge

import androidx.lifecycle.ViewModel

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/14/21.
 */
class MainActivityViewModel(startingTotal: Int) : ViewModel() {
    private var result = 0

    init {
        result = startingTotal
    }

    fun getCurrentResult(): Int {
        return result
    }

    fun getUpdatedResult(number: Int) {
        result+=number
    }
}