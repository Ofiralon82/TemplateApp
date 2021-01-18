package com.example.testus.application

import android.content.Context
import com.example.testus.dagger.AppComponent
import com.example.testus.dagger.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App: DaggerApplication() {

    /* dagger */
    private val mInjector: AppComponent = DaggerAppComponent.builder()
        .application(this)
        .context(this)
        .build()

    fun component(context: Context): AppComponent {
        return (context.applicationContext as App).mInjector
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return mInjector
    }

//    protected fun applicationInjector(): AndroidInjector<out DaggerApplication?>? {
//        return mInjector
//    }
}