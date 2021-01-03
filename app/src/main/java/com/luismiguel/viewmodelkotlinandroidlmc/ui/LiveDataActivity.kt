package com.luismiguel.viewmodelkotlinandroidlmc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.luismiguel.viewmodelkotlinandroidlmc.R
import com.luismiguel.viewmodelkotlinandroidlmc.utils.User
import com.luismiguel.viewmodelkotlinandroidlmc.viewmodel.LiveDataViewModel
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    var numero: Int  = 0
    lateinit var viewModel: LiveDataViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        setUpView()
    }

    fun setUpView(){
        viewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        btSave.setOnClickListener{
            if (numero == 0){
                val user = User()
                user.nombre = "Alberto"
                user.edad = "30"
                viewModel.addUser(user)
            }
            if (numero == 1){
                val user = User()
                user.nombre = "Maria"
                user.edad = "50"
                viewModel.addUser(user)
            }
            if (numero == 2){
                val user = User()
                user.nombre = "Manuel"
                user.edad = "40"
                viewModel.addUser(user)
            }
            numero++
        }

        val listObserver = Observer<List<User>>{
            userList ->
            var texto = ""
            for (user in userList){
                texto += user.nombre + " " + user.edad + "\n"
            }
            tvLiveData.text = texto
        }
        //El propietario del ciclo de vida y que observer va a observar a dicho livedata suscribir observer al observable y cada vez
        //que el observer cambie de valor de manera reactiva se ejecute el codigo de aqui testview data test con el observable
        viewModel.getUserList().observe(this@LiveDataActivity, listObserver)
    }
}