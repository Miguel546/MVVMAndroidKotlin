package com.luismiguel.viewmodelkotlinandroidlmc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.luismiguel.viewmodelkotlinandroidlmc.R
import com.luismiguel.viewmodelkotlinandroidlmc.databinding.ActivityDbldBinding
import com.luismiguel.viewmodelkotlinandroidlmc.utils.User
import com.luismiguel.viewmodelkotlinandroidlmc.viewmodel.DBLDViewModel

class DBLDActivity : AppCompatActivity() {
    lateinit var viewModel: DBLDViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_dbld)
        val binding: ActivityDbldBinding = DataBindingUtil.setContentView(this@DBLDActivity, R.layout.activity_dbld)
        binding.setLifecycleOwner(this)
        viewModel = ViewModelProvider(this).get(DBLDViewModel::class.java)

        binding.viewModel = viewModel
        val user = User("Alberto", "30")

        viewModel.setUser(user)
    }
}