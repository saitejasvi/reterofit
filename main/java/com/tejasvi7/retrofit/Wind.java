package com.tejasvi7.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tejasvi7 on 12/2/2016.
 */

public class Wind {
    @SerializedName("speed")
    String speed;
    @SerializedName("deg")
    String deg;

    public String getSpeed() {
        return speed;
    }

    public String getDeg() {
        return deg;
    }

}