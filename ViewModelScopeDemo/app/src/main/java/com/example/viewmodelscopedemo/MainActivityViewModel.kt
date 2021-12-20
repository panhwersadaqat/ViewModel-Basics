package com.example.viewmodelscopedemo

import androidx.lifecycle.*
import com.example.viewmodelscopedemo.model.User
import com.example.viewmodelscopedemo.model.UserRepository
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {

    private var userRepository = UserRepository()

    var users = liveData(IO) {
        val result = userRepository.getUsers()
        emit(result)
    }
    //var users : MutableLiveData<List<User>> = MutableLiveData()
    /*fun getUserData() {
        viewModelScope.launch {
            var result : List<User>? = null
            withContext(IO){
                result = userRepository.getUsers()
            }
            users.value = result

        }
    }*/
}