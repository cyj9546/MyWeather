package com.cyj.myweather.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cyj.myweather.R;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    List<String> letterToCity=new ArrayList<String>();
    final static int TYPE_1=1;
    final static int TYPE_2=2;
    String[] letter={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private Context mcontext;
    public MyAdapter(Context mcontext,List<String> letterToCity) {
        this.mcontext=mcontext;
        this.letterToCity=letterToCity;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return letterToCity.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return letterToCity.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }



    @Override
    public int getItemViewType(int position) {
        for(int i=0;i<letter.length;i++){
            if(letterToCity.get(position).equals(letter[i])){
                return TYPE_1;
            }
        }
        return TYPE_2;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder1 vh1 = null;
        ViewHolder2 vh2 = null;
        int type = getItemViewType(position);
        if (convertView == null) {
            switch (type) {
                case TYPE_1:
                    convertView = LayoutInflater.from(mcontext).inflate(R.layout.letter, null);
                    vh1 = new ViewHolder1();
                    vh1.tv = (TextView) convertView.findViewById(R.id.letterTextView);
                    convertView.setTag(vh1);
                    break;
                case TYPE_2:
                    convertView = LayoutInflater.from(mcontext).inflate(R.layout.city, null);
                    vh2 = new ViewHolder2();
                    vh2.tv = (TextView) convertView.findViewById(R.id.cityTextView);
                    convertView.setTag(vh2);
                    break;
                default:
                    break;
            }
        } else {
            switch (type) {
                case TYPE_1:
                    vh1 = (ViewHolder1) convertView.getTag();
                    break;
                case TYPE_2:
                    vh2 = (ViewHolder2) convertView.getTag();
                    break;
                default:
                    break;
            }
        }
        switch (type) {
            case TYPE_1:
                vh1.tv.setText(letterToCity.get(position));
                break;
            case TYPE_2:
                vh2.tv.setText(letterToCity.get(position));
                break;
            default:
                break;
        }
        return convertView;

    }
    class ViewHolder1{
        TextView tv;
    }

    class ViewHolder2{
        TextView tv;
    }
}
