package com.cyj.myweather.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.cyj.myweather.Adapter.MyAdapter;
import com.cyj.myweather.Adapter.MyAdapter1;
import com.cyj.myweather.R;

import java.util.ArrayList;
import java.util.List;

import static android.provider.ContactsContract.Intents.Insert.ACTION;

public class CitySelectActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private TextView dqdw;
    private Button btn_yes;
    private ImageView img_back;
    private TextView txt_city;
    String[] letter = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] cityLetter = {"C", "B", "H", "G", "W", "C", "S", "S", "C", "W", "H", "Z", "C", "D", "N", "L", "Q", "S", "S"
            , "L", "N", "H", "X", "H", "S", "Z", "G", "N", "J", "T", "S", "X", "A"};
    String[] cityName = {"长沙", "北京", "杭州", "广州", "武汉", "重庆", "上海", "深圳", "长春", "乌鲁木齐", "哈尔滨", "郑州", "成都", "大连", "南昌", "兰州", "齐齐哈尔", "汕头", "苏州"
            , "拉萨", "南京", "呼和浩特", "厦门", "合肥", "沈阳", "张家界", "贵州", "宁夏", "济南", "天津", "石家庄", "西安", "澳门"};
    List<String> letterToCity = new ArrayList<String>();

    ListView lv;
    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city__select);
        btn_yes = findViewById(R.id.btn_yes);
        txt_city = findViewById(R.id.txt_city);
        img_back = findViewById(R.id.img_back);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitySelectActivity.this, MainActivity.class);
                String cc = txt_city.getText().toString();
                intent.putExtra("CityName", "广州");
                Log.d("CYJ", cc);
                startActivity(intent);
                finish();
            }
        });
        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitySelectActivity.this, MainActivity.class);
                String city = txt_city.getText().toString();
                intent.putExtra("CityName", city);
                startActivity(intent);
                finish();
            }
        });
        String str = "";
        for (int i = 0; i < letter.length; i++) {
            str = letter[i];
            boolean isAddLetter = false;
            for (int j = 0; j < cityLetter.length; j++) {
                if (str.equals(cityLetter[j])) {
                    if (!isAddLetter) {
                        letterToCity.add(str);
                        isAddLetter = true;
                    }
                    letterToCity.add(cityName[j]);
                }
            }
        }

        lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(new MyAdapter(this, letterToCity));
        lv.setOnItemClickListener(this);

        lv1 = (ListView) findViewById(R.id.listView2);
        lv1.setAdapter(new MyAdapter1(this, letter));
        lv1.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        switch (parent.getId()) {
            case R.id.listView1:
                for (int i = 0; i < letter.length; i++) {
                    if (letter[i].equals(letterToCity.get(position))) {
                        break;
                    }
                }
//                if (!isLetter) {
//                      Toast.makeText(this, letterToCity.get(position), Toast.LENGTH_SHORT).show();
//                }
                txt_city.setText(letterToCity.get(position));
                break;
            case R.id.listView2:
                for (int i = 0; i < letterToCity.size(); i++) {
                    if (letter[position].equals(letterToCity.get(i))) {
                        lv.setSelection(i);
                        break;
                    }
                }

                break;
            default:
                break;
        }
    }


}






