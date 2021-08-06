package com.sunnyweather.sunnyweather.logic.network

import retrofit2.Retrofit

object ServiceCreator {
    const val BASE_URL = "https://api.caiyunapp.com/"

    val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(OptionalCon.create())
}