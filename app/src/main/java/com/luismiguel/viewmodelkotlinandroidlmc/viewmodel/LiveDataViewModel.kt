package com.luismiguel.viewmodelkotlinandroidlmc.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luismiguel.viewmodelkotlinandroidlmc.utils.User

class LiveDataViewModel: ViewModel() {
    //Objeto observable va a enviar a los observadores de manera reactiva los cambios
    var userListLiveData: MutableLiveData<List<User>> = MutableLiveData()
    //Lista de usuarios normal que cuando haya un cambio no lo va a notificar
    var userList: MutableList<User> = ArrayList()

    fun getUserList(): LiveData<List<User>>{
        return userListLiveData
    }

    fun addUser(user: User){
        userList.add(user)
        userListLiveData.value = userList
    }


}