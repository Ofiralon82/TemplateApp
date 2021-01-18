package com.example.testus.dagger.modules

import com.example.testus.Koko
import dagger.Module
import dagger.Provides

@Module
object YantraModule {
    @Provides
    fun yantraApi(): Koko {
        return Koko(8)
    }
}