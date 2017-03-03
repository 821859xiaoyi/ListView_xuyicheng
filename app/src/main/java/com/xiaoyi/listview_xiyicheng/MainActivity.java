package com.xiaoyi.listview_xiyicheng;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList=new ArrayList<>();

//    private String[] data={"夏侯惇","李白","关羽","张飞","刘备","曹操","黄忠","成杰","张立文",
//            "夏侯惇","李白","关羽","张飞","刘备","曹操","黄忠","成杰","张立文"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();//初始化数据
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView= (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView= (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i=0;i<2;i++){
            Fruit name=new Fruit("成杰",R.drawable.user);
            fruitList.add(name);
            Fruit name1=new Fruit("夏侯惇",R.drawable.user);
            fruitList.add(name1);
            Fruit name2=new Fruit("李白",R.drawable.user);
            fruitList.add(name2);
            Fruit name3=new Fruit("关羽",R.drawable.user);
            fruitList.add(name3);
            Fruit name4=new Fruit("张飞",R.drawable.user);
            fruitList.add(name4);
            Fruit name5=new Fruit("刘备",R.drawable.user);
            fruitList.add(name5);
            Fruit name6=new Fruit("曹操",R.drawable.user);
            fruitList.add(name6);
            Fruit name7=new Fruit("黄忠",R.drawable.user);
            fruitList.add(name7);
            Fruit name8=new Fruit("成杰",R.drawable.user);
            fruitList.add(name8);
            Fruit name9=new Fruit("张立文",R.drawable.user);
            fruitList.add(name9);
            Fruit name10=new Fruit("张立文",R.drawable.user);
            fruitList.add(name10);
            Fruit name11=new Fruit("成杰",R.drawable.user);
            fruitList.add(name11);
        }
    }
}
