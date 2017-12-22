package com.zjc.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taren on 2017/12/18.
 */

public class ListViewActivity extends BaseActivity{
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(ListViewActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(ListViewActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.mipmap.ic_launcher);
        fruitList.add(apple);
        Fruit orange = new Fruit("Orange",R.mipmap.ic_launcher);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.mipmap.ic_launcher);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.mipmap.ic_launcher);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape", R.mipmap.ic_launcher);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple",R.mipmap.ic_launcher);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.mipmap.ic_launcher);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry",R.mipmap.ic_launcher);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.mipmap.ic_launcher);
        fruitList.add(mango);
        Fruit mango1 = new Fruit("Mango1", R.mipmap.ic_launcher);
        fruitList.add(mango1);
        Fruit mango2 = new Fruit("Mango2", R.mipmap.ic_launcher);
        fruitList.add(mango2);
        Fruit mango3 = new Fruit("Mango3", R.mipmap.ic_launcher);
        fruitList.add(mango3);
    }
}
