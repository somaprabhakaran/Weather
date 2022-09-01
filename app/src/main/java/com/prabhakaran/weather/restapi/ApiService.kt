package com.prabhakaran.weather.restapi

import com.prabhakaran.weather.model.Weather
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("forecast.json")
    fun getWeather(
        @Query("key") key: String,
        @Query("q") query: String,
        @Query("days") days: Int,
        @Query("aqi") aqi: String,
        @Query("alerts") alerts: String
    ): Flowable<Weather>


}