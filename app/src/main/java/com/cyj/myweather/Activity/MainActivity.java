package com.cyj.myweather.Activity;

import android.annotation.SuppressLint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


import com.cyj.myweather.Dialog.MyweatherDialog;
import com.cyj.myweather.Callback.OnResponse;
import com.cyj.myweather.R;
import com.cyj.myweather.Request.BaseRequest;
import com.cyj.myweather.Bean.WeatherBean;

import static android.provider.ContactsContract.Intents.Insert.ACTION;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView city_name;
    private Button btn_select;
    private Button five;
    private TextView g_date;
    private TextView week;
    private TextView n_data;
    private TextView temperature;
    private TextView weather;
    private TextView win_direct;
    private TextView quality;
    private TextView jianyi;
    private TextView chuanyi;
    private TextView chuanyi_jy;
    private TextView kongtiao;
    private TextView kongtiao_jy;
    private TextView ganmao;
    private TextView ganmao_jy;
    private TextView xiche;
    private TextView xiche_jy;
    private TextView yudong;
    private TextView yudong_jy;
    private TextView ziwaixian;
    private TextView ziwaixian_jy;
    private ScrollView activity_main;
    private ImageView img_shuaxin;

    private Handler handler;
    private MyweatherDialog dialog;
    private boolean flagReceiveRegis;
    @SuppressLint("HandlerLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                if (msg.what == 1) {
                    img_shuaxin.clearAnimation();
                    RequestWeather(city_name.getText().toString());
                     Toast.makeText(MainActivity.this, "刷新成功", Toast.LENGTH_SHORT).show();
                }
                super.handleMessage(msg);
            }
        };


        initView();
        RequestWeather("广州");
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String str=intent.getStringExtra("CityName");
        RequestWeather(str);
        Log.d("CYJ",str);
    }



    private void RequestWeather(String citycanme) {
        BaseRequest.MyRequest(citycanme, new OnResponse() {
            @Override
            public void response(Object result) {
                /**
                 * 数据解析
                 */
                WeatherBean weatherBean = (WeatherBean) result;
                city_name.setText(weatherBean.getResult().getCity());
                weather.setText(weatherBean.getResult().getWeather());
                g_date.setText(weatherBean.getResult().getDate());
                week.setText(weatherBean.getResult().getWeek());
                win_direct.setText(weatherBean.getResult().getWinddirect());
                quality.setText("空气质量 :" + weatherBean.getResult().getAqi().getQuality());
                temperature.setText(weatherBean.getResult().getTemphigh() + "℃");
                jianyi.setText("出行建议 : " + weatherBean.getResult().getAqi().getAqiinfo().getAffect());
                kongtiao.setText("空调指数 :" + weatherBean.getResult().getIndex().get(0).getIvalue());
                kongtiao_jy.setText("建议: " + weatherBean.getResult().getIndex().get(0).getDetail());
                yudong.setText("运动指数: " + weatherBean.getResult().getIndex().get(1).getIvalue());
                yudong_jy.setText("运动建议: " + weatherBean.getResult().getIndex().get(1).getDetail());
                chuanyi.setText("穿衣指数: " + weatherBean.getResult().getIndex().get(6).getIvalue());
                chuanyi_jy.setText("穿衣建议: " + weatherBean.getResult().getIndex().get(6).getDetail());
                xiche.setText("洗车指数: " + weatherBean.getResult().getIndex().get(4).getIvalue());
                xiche_jy.setText("洗车建议: " + weatherBean.getResult().getIndex().get(4).getDetail());
                ganmao.setText("感冒指数: " + weatherBean.getResult().getIndex().get(3).getIvalue());
                ganmao_jy.setText("建议: " + weatherBean.getResult().getIndex().get(3).getDetail());
                ziwaixian.setText("紫外线指数:  " + weatherBean.getResult().getIndex().get(2).getIvalue());
                ziwaixian_jy.setText("建议: " + weatherBean.getResult().getIndex().get(2).getDetail());


                /**
                 * 跑马灯效果
                 */
                ziwaixian_jy.setSelected(true);
                ganmao_jy.setSelected(true);
                kongtiao_jy.setSelected(true);
                xiche_jy.setSelected(true);
                yudong_jy.setSelected(true);
                chuanyi_jy.setSelected(true);
                dialog.setWeather(weatherBean.getResult().getDaily());
                /**
                 * 背景图片设置
                 */
                switch (weather.getText().toString()) {
                    case "雷阵雨":
                        activity_main.setBackgroundResource(R.mipmap.xiaoyu);
                        break;
                    case "小雨":
                        activity_main.setBackgroundResource(R.mipmap.xiaoyu);
                        break;
                    case "雨":
                        activity_main.setBackgroundResource(R.mipmap.xiaoyu);
                        break;
                    case "多云":
                        activity_main.setBackgroundResource(R.mipmap.duoyun);
                    case "阵雨":
                        activity_main.setBackgroundResource(R.mipmap.xiaoyu);
                        break;
                    case "晴":
                        activity_main.setBackgroundResource(R.mipmap.qintian);
                        break;
                    case "微风":
                        activity_main.setBackgroundResource(R.mipmap.qintian);
                        break;
                    case "阴":
                        activity_main.setBackgroundResource(R.mipmap.yintian);
                        break;
                    default:
                        activity_main.setBackgroundResource(R.mipmap.weather);
                        break;
                }

            }
        });
    }

    private void initView() {
        city_name = (TextView) findViewById(R.id.city_name);
        btn_select = (Button) findViewById(R.id.btn_select);
        five = (Button) findViewById(R.id.five);
        g_date = (TextView) findViewById(R.id.g_date);
        week = (TextView) findViewById(R.id.week);
        n_data = (TextView) findViewById(R.id.n_data);
        temperature = (TextView) findViewById(R.id.temperature);
        weather = (TextView) findViewById(R.id.weather);
        win_direct = (TextView) findViewById(R.id.win_direct);
        quality = (TextView) findViewById(R.id.quality);
        jianyi = (TextView) findViewById(R.id.jianyi);
        chuanyi = (TextView) findViewById(R.id.chuanyi);
        chuanyi_jy = (TextView) findViewById(R.id.chuanyi_jy);
        kongtiao = (TextView) findViewById(R.id.kongtiao);
        kongtiao_jy = (TextView) findViewById(R.id.kongtiao_jy);
        ganmao = (TextView) findViewById(R.id.ganmao);
        ganmao_jy = (TextView) findViewById(R.id.ganmao_jy);
        xiche = (TextView) findViewById(R.id.xiche);
        xiche_jy = (TextView) findViewById(R.id.xiche_jy);
        yudong = (TextView) findViewById(R.id.yudong);
        yudong_jy = (TextView) findViewById(R.id.yudong_jy);
        ziwaixian = (TextView) findViewById(R.id.ziwaixian);
        ziwaixian_jy = (TextView) findViewById(R.id.ziwaixian_jy);
        activity_main = (ScrollView) findViewById(R.id.activity_main);
        img_shuaxin = findViewById(R.id.img_shuaxin);
        dialog = new MyweatherDialog(this);
        img_shuaxin.setOnClickListener(this);
        btn_select.setOnClickListener(this);
        five.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            /**
             * 选择城市
             */
            case R.id.btn_select:
                Intent intent=new Intent(MainActivity.this, CitySelectActivity.class);
                startActivity(intent);
                break;
            case R.id.five:
                /**
                 * 未来7天
                 */
                dialog.show();
                break;
            /**
             * 刷新
             */
            case R.id.img_shuaxin:
                /**
                 * 动画加载
                 */
                Animation operatingAnim = AnimationUtils
                        .loadAnimation(this, R.anim.tip);
                LinearInterpolator lin = new LinearInterpolator();
                operatingAnim.setInterpolator(lin);
                if (operatingAnim != null) {
                    img_shuaxin.clearAnimation();
                    img_shuaxin.startAnimation(operatingAnim);

                }
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Message msg = new Message();
                        msg.what = 1;
                        handler.sendMessage(msg);
                    }
                }).start();

                break;
        }
    }


}
