package com.sunnyweather.sunnyweather.logic.network

import com.sunnyweather.sunnyweather.logic.model.PlaceResponse
import retrofit2.http.GET
import com.sunnyweather.sunnyweather.SunyWeatherApplication
import retrofit2.Call
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${SunyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}