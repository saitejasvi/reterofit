package com.tejasvi7.retrofit;

import android.util.Log;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface ApiInterface {
    @GET("/data/2.5/weather")  //
    void getWeather(@Query("q") String city, Callback<ResponseData> callback);

}