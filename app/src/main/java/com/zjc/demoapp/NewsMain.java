package com.zjc.demoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;

/**
 * Created by taren on 2017/12/19.
 */

public class NewsMain extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.news_main);

    }
}
