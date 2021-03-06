package com.example.testus.dagger

import com.example.templateapp.MainActivity
import com.example.testus.Koko
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    //@ActivityScoped
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

//    @Binds
//    abstract fun experiencesApi(api: Koko)
}
