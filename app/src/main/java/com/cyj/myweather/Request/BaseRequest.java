package com.cyj.myweather.Request;

import com.cyj.myweather.Util.NetUtil;
import com.cyj.myweather.Callback.OnResponse;
import com.cyj.myweather.Bean.WeatherBean;
import com.google.gson.Gson;

public  class BaseRequest {

    private static String url="http://api.jisuapi.com/weather/query?appkey=04c75d47ccb2674d&city=";

   public  static void MyRequest(String CityName, final OnResponse response){
       NetUtil.sendpost(url + CityName, new OnResponse() {
           @Override
           public void response(Object result) {
                WeatherBean weatherBean=new Gson().fromJson((String) result,WeatherBean.class);
               response.response(weatherBean);
           }
       });
   }

}
