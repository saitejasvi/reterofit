package com.tejasvi7.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tejasvi7 on 12/2/2016.
 */

public class System {
    @SerializedName("message")
    String msg;
    @SerializedName("country")
    String country;
    @SerializedName("sunrise")
    String sunrise;
    @SerializedName("sunset")
    String sunset;

    public String getMsg() {
        return msg;
    }

    public String getCountry() {
        return country;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }
}
