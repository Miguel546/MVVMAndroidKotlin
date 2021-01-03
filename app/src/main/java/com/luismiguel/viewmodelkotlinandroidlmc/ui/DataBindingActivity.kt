package com.luismiguel.viewmodelkotlinandroidlmc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.luismiguel.viewmodelkotlinandroidlmc.R
import com.luismiguel.viewmodelkotlinandroidlmc.databinding.ActivityDataBindingBindingImpl
import com.luismiguel.viewmodelkotlinandroidlmc.utils.User

class DataBindingActivity : AppCompatActivity() {
    lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_data_binding)
        val binding: ActivityDataBindingBindingImpl = DataBindingUtil.setContentView(this@DataBindingActivity, R.layout.activity_data_binding)
        user = User("Alberto", "30")

        binding.user = user
    }
}