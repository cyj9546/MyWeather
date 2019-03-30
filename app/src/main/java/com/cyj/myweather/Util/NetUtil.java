package com.cyj.myweather.Util;

import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;

import com.cyj.myweather.Callback.OnResponse;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetUtil {

    private static Handler handler=new Handler(Looper.getMainLooper());
    public static void sendpost(final String url , final OnResponse response){
            new Thread(){
                @Override
                public void run() {
                    try {
                        URL url1=new URL(url);
                        HttpURLConnection connection= (HttpURLConnection) url1.openConnection();
                        connection.setRequestMethod("GET");
                        connection.setDoOutput(true);
                        connection.setDoInput(true);
                        connection.setReadTimeout(6000);
                        connection.setConnectTimeout(6000);
                        int code = connection.getResponseCode();//获得相应码
                        if(code == 200) {//相应成功，获得相应的数据
                            InputStream is = connection.getInputStream();//得到数据流（输入流）
                            byte[] buffer = new byte[1024];
                            int length = 0;
                            String data = "";
                            while ((length = is.read(buffer)) != -1) {
                                String str = new String(buffer, 0, length);
                                data += str;
                            }
                            final String finalData = data;
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    response.response(finalData);
                                }
                            });
                        }
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
    }
}
