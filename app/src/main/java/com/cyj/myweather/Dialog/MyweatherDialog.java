package com.cyj.myweather.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.cyj.myweather.R;
import com.cyj.myweather.Adapter.WeatherAdapter;
import com.cyj.myweather.Bean.WeatherBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyj on 2019/3/29.
 */
//自定义对话框
public class MyweatherDialog extends Dialog{
    private LayoutInflater inflater;
   private ViewPager pager;
    private static List<View> views;
    private List<WeatherBean.ResultBean.DailyBean>list;

    public MyweatherDialog(@NonNull Context context) {
        super(context,R.style.MyDialog);
        inflater=LayoutInflater.from(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
        Window window=getWindow();
        DisplayMetrics dm=getContext().getResources().getDisplayMetrics();
        WindowManager.LayoutParams p=window.getAttributes();
        p.height=dm.heightPixels/3;
        p.width=(int)(dm.widthPixels*0.9f);
        window.setAttributes(p);
        initView();
        initData();
    }

    private void initData() {
        views=new ArrayList<>();
        for (int i=0;i<list.size();i++){
             View view=inflater.inflate(R.layout.item,null);
              TextView b_t=view.findViewById(R.id.b_t);
              TextView n_t=view.findViewById(R.id.n_t);
              TextView b_w=view.findViewById(R.id.b_w);
              TextView n_w=view.findViewById(R.id.n_w);
              TextView date=view.findViewById(R.id.f_date);
              TextView week=view.findViewById(R.id.f_week);
            WeatherBean.ResultBean.DailyBean entiy=list.get(i);
            b_t.setText("最高"+entiy.getDay().getTemphigh()+"℃");
            b_w.setText(entiy.getDay().getWeather());
            n_t.setText("最低"+entiy.getNight().getTemplow()+"℃");
            n_w.setText(entiy.getNight().getWeather());
            date.setText(""+entiy.getDate());
            week.setText(""+entiy.getWeek());
            views.add(view);
        }
        pager.setAdapter(new WeatherAdapter(views));
    }

    private void initView() {
        pager=findViewById(R.id.pager);
    }

    public void setWeather(List<WeatherBean.ResultBean.DailyBean> list){
        this.list=list;

    }


}
