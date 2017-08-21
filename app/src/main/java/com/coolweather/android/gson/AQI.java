package com.coolweather.android.gson;

/**
 * Created by 孟浩瀚 on 2017/8/21.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
