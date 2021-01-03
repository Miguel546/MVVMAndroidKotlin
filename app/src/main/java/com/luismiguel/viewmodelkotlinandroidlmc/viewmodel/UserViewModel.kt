package com.luismiguel.viewmodelkotlinandroidlmc.viewmodel

import androidx.lifecycle.ViewModel
import com.luismiguel.viewmodelkotlinandroidlmc.utils.User

class UserViewModel: ViewModel {
    var userList: MutableList<User>

    constructor(){
        userList = ArrayList()
    }

    fun addUser(user: User){
        userList.add(user)
    }
}