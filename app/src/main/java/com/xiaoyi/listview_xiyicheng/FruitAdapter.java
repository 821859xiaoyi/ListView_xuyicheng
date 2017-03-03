package com.xiaoyi.listview_xiyicheng;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 徐笑羿 on 2017/3/2.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    public FruitAdapter(Context context, int textViewresourceId, List<Fruit> objects) {
        super(context, textViewresourceId, objects);
        resourceId=textViewresourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        Fruit fruit=getItem(position);//获取当前的Fruit实例
//        View view;
//        if (convertView==null){
//            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
//        }else {
//            view=convertView;
//        }
//        ImageView fruitImage= (ImageView) view.findViewById(R.id.fruit_image);
//        TextView fruitName= (TextView) view.findViewById(R.id.fruit_name);
//        fruitImage.setImageResource(fruit.getImageId());
//        fruitName.setText(fruit.getName());
//        return view;

        Fruit fruit=getItem(position);
        ViewHolder viewHolder;
        if (convertView==null){
            convertView=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage= (ImageView) convertView.findViewById(R.id.fruit_image);
            //将ViewHolder存储在View中
            viewHolder.fruitName= (TextView) convertView.findViewById(R.id.fruit_name);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();//重新获取ViewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return convertView;
    }

    class ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
    }
}
