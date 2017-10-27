package com.skaliotisdev.github.repositories.Interface

import com.skaliotisdev.github.repositories.Result

interface interfaceGitHub {

    /*
       Created By Spiros Skaliotis 27/10/2017
     */

    @retrofit2.http.GET("search/repositories")
    fun search(@retrofit2.http.Query("sort") sort: String = "stars",
               @retrofit2.http.Query("order") order: String = "desc",
               @retrofit2.http.Query("q") query: String): io.reactivex.Observable<Result>


    companion object Factory {
        fun create(): interfaceGitHub {
            val retrofit = retrofit2.Retrofit.Builder()
                    .addCallAdapterFactory(retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory.create())
                    .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
                    .baseUrl("https://api.github.com/")
                    .build()

            return retrofit.create(interfaceGitHub::class.java);
        }
    }
}