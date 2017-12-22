package com.zjc.demoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by taren on 2017/12/15.
 */

public class TestActivity extends BaseActivity implements View.OnClickListener{
    private Button button;
    private ImageView imageView;
    private EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        button = (Button) findViewById(R.id.button_test);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.imageview_test);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_test:
                imageView.setImageResource(R.drawable.az);
                break;
            default:
                break;
        }
    }
}
