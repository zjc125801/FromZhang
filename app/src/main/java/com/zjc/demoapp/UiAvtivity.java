package com.zjc.demoapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by taren on 2017/12/18.
 */

public class UiAvtivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_layout);
    }

    public static void uistart(Context context){
        Intent intent = new Intent(context, UiAvtivity.class);
        context.startActivity(intent);
    }
}
