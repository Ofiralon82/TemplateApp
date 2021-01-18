package com.example.templateapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testus.viewmodels.ViewModelFactory
import dagger.android.AndroidInjection
import androidx.activity.viewModels
import com.example.testus.Koko
import com.example.testus.viewmodels.MainActivityViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by viewModels<MainActivityViewModel> { viewModelFactory }

    @Inject
    lateinit var k: Koko

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var tre = 6
    }
}