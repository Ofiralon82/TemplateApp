package com.example.testus.dagger

import android.app.Application
import android.content.Context
import com.example.testus.application.App
import com.example.testus.dagger.modules.ApiModule
import com.example.testus.dagger.modules.ViewModelModule
import com.example.testus.dagger.modules.YantraModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
//        CoreModule::class,
//        NetworkModule::class,
//        ViewModelAssistedFactoriesModule::class,
//        SettingsModule::class,
//        ViewModelModule::class,
        //FragmentBindingModule::class,
        ActivityBindingModule::class,
        AndroidInjectionModule::class,
        ViewModelModule::class,
        YantraModule::class,
        ApiModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        @BindsInstance
        fun context(context: Context): Builder
        fun build(): AppComponent
    }

//    fun inject(target: Koko)
}
