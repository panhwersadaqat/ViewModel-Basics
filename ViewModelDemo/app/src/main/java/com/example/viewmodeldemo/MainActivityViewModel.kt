package com.example.viewmodeldemo

import androidx.lifecycle.ViewModel

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/14/21.
 */
class MainActivityViewModel : ViewModel() {
    private var count = 0

    fun getCurrentCount() : Int {
        return count
    }

    fun getUpdatedCount() : Int {
        return ++count
    }
}