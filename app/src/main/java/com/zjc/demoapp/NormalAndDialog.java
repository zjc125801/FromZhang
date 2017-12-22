package com.zjc.demoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import junit.framework.Test;

import static android.content.ContentValues.TAG;


/**
 * Created by taren on 2017/12/15.
 */

public class NormalAndDialog extends BaseActivity implements View.OnClickListener{

    private EditText editText1;
    private Button UI_button;
    private Button _Fragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Log.d("NormalAndDialog","task id is "+ getTaskId());
        if (savedInstanceState != null){
            String tempdata = savedInstanceState.getString("datakey");
            editText1 = (EditText) findViewById(R.id.edittext_cs);
            editText1.setText(tempdata);
        }
        setContentView(R.layout.normal_dialog);

        float xdpi = getResources().getDisplayMetrics().xdpi;
        float ydpi = getResources().getDisplayMetrics().ydpi;
        Log.d("NormalAndDialog", "xdpi is " + xdpi);
        Log.d("NormalAndDialog", "ydpi is " + ydpi);

        _Fragment = (Button) findViewById(R.id._fragment);
        _Fragment.setOnClickListener(this);

        Button _news = (Button)findViewById(R.id._news);
        _news.setOnClickListener(this);

        Button button_normal = (Button) findViewById(R.id.start_normal_activity);
        button_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(NormalAndDialog.this,NormalActivity.class);
                //startActivity(intent);
                NormalActivity.actionStart(NormalAndDialog.this);
            }
        });
        Button button_dialog = (Button) findViewById(R.id.start_dialog_activity);
        button_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NormalAndDialog.this,DialogActivity.class);
                startActivity(intent);
            }
        });
        Button button = (Button) findViewById(R.id.button_fin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button button_test = (Button) findViewById(R.id.test);
        button_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NormalAndDialog.this, TestActivity.class);
                startActivity(intent);
            }
        });

        UI_button = (Button) findViewById(R.id.UI_button);
        UI_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UiAvtivity.uistart(NormalAndDialog.this);
            }
        });

        Button button_qq = (Button) findViewById(R.id.qq);
        button_qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NormalAndDialog.this,antivity_token.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        editText1 = (EditText) findViewById(R.id.edittext_cs);
        String tempdata = editText1.getText().toString();
        outState.putString("datakey", tempdata);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id._fragment:
                Intent intent = new Intent(NormalAndDialog.this,Fragment_main.class);
                startActivity(intent);
                break;
            case R.id._news:
                Intent intent1 = new Intent(NormalAndDialog.this,NewsMain.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(TAG,"onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d(TAG,"onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(TAG, "onPause");
//    }
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(TAG, "onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(TAG, "onDestroy");
//    }
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d(TAG, "onRestart");
//    }
}
