package com.lab1.WeatherForecast.services;


import com.lab1.WeatherForecast.models.IpmaCityForecast;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IpmaService {

        @GET("forecast/meteorology/cities/daily/{city_id}.json")
        public Call<IpmaCityForecast> getForecastForACity(@Path("city_id") int cityId);

    }
