package com.example.testus.viewmodels

import androidx.lifecycle.ViewModel
import com.example.testus.Koko
import com.example.testus.retrofit.api.CallApi
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(val fds: Koko, val callApi: CallApi) : ViewModel() {

    var tttt = 432

}