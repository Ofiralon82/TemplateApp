package com.example.testus.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClients {

//    val Instance = RetrofitClients()

//    private val retrofit = Retrofit.Builder()
//        .baseUrl("BaseUrl")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()

    val yantraRetrofit: Retrofit = initYantraRetrofit()
    private val mBaseOkHttpClient = OkHttpClient()
//    var okHttpClientBuilder: OkHttpClient.Builder = mBaseOkHttpClient.newBuilder()

    private fun initYantraRetrofit(): Retrofit {
//        val okHttpClientBuilder: OkHttpClient.Builder = mBaseOkHttpClient.newBuilder()
//        RetrofitClients.addInterceptors(okHttpClientBuilder)
//        okHttpClientBuilder.addInterceptor(
//            Interceptor { chain: Interceptor.Chain ->
//                val builder: Builder = chain.request().newBuilder()
//                builder.addHeader("x-yantra-ssr", "true")
//                val override: String = prefDataStore.getString(
//                    YantraConstants.KEY_YANTRA_HEADER_OVERRIDE,
//                    ""
//                )
//                if (!override.isEmpty()) {
//                    builder.addHeader("x-yantra-override", override)
//                }
//                chain.proceed(builder.build())
//            }
//        )
        return Retrofit.Builder()
            .baseUrl("Base url")
//            .addConverterFactory(
//                Builder()
//                    .add(Moshi::class.java, moshiWrapper.getMoshiConverterFactory())
//                    .build()
//            )
            .addConverterFactory(GsonConverterFactory.create())
//            .addConverterFactory(mGsonFactory)
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(mBaseOkHttpClient)
            .build()
    }

}