package com.tejasvi7.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tejasvi7 on 12/2/2016.
 */
public class  Cordinate {
    @SerializedName("lat")
    String lat;
    @SerializedName("lon")
    String lon;

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }
}