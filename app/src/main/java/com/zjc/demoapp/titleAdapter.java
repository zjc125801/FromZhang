package com.zjc.demoapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by taren on 2017/12/20.
 */

public class titleAdapter extends ArrayAdapter<News> {
    private int resoutceId;
    public titleAdapter(@NonNull Context context, @LayoutRes int resource, List<News> listNews) {
        super(context, resource,listNews);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        News news =  getItem(position);
        View view;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resoutceId,null);
        }else {
            view = convertView;
        }

        ListView titleView = (ListView) view.findViewById(R.id._left_title);
        titleView.setAdapter(this);
        return view;
    }
}
