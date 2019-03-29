package com.cyj.myweather.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cyj.myweather.R;

public class MyAdapter1 extends BaseAdapter {
    private Context context;
    private String[] letter;

    public MyAdapter1(Context context, String[] letter) {
        this.context = context;
        this.letter = letter;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return letter.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return letter[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(R.layout.letter_list, null);
        TextView tv=(TextView)view.findViewById(R.id.letterListTextView);
        tv.setText(letter[position]);
        return view;
    }
}
