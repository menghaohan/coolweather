package com.coolweather.android;

/**
 * Created by 孟浩瀚 on 2017/8/21.
 */

public class Data {

    private static String weatherId="";

    public static String getWeatherId() {
        return weatherId;
    }

    public static void setWeatherId(String weatherId) {
        Data.weatherId = weatherId;
    }
}
