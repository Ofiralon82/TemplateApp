package com.example.testus.dagger.modules

import com.example.testus.retrofit.RetrofitClients
import com.example.testus.retrofit.api.CallApi
import dagger.Module
import dagger.Provides

@Module
object ApiModule {
    @Provides
    fun CallApi(): CallApi {
        return RetrofitClients.yantraRetrofit
            .create(CallApi::class.java)
    }
}