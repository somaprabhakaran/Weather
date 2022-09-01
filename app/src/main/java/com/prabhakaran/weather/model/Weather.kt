package com.prabhakaran.weather.model

import com.prabhakaran.weather.model.Forecast
import com.prabhakaran.weather.model.Hour
import com.prabhakaran.weather.model.Location

data class Weather(
    val current: Hour,
    val forecast: Forecast,
    val location: Location
)

