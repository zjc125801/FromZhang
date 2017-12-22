package com.zjc.demoapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taren on 2017/12/15.
 */

public class NormalActivity extends BaseActivity implements View.OnClickListener{

    private ProgressBar progressBar;
    private Button normal_a;
    private Button button_hello;
    private Button progress_button;
    private Button dialog_button;
    private Button listview_button;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Log.d("NormalActivity", "Task id is " + getTaskId());
        setContentView(R.layout.normal_layout);


        normal_a = (Button) findViewById(R.id.normal_a);
        button_hello = (Button) findViewById(R.id.button_hello);
        progress_button = (Button) findViewById(R.id.progress_button);
        progressBar = (ProgressBar) findViewById(R.id.progress_normal);
        dialog_button = (Button) findViewById(R.id.dialog_button);
        listview_button = (Button) findViewById(R.id.listview_button);
        normal_a.setOnClickListener(this);
        button_hello.setOnClickListener(this);
        progress_button.setOnClickListener(this);
        dialog_button.setOnClickListener(this);
        listview_button.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.normal_a:
                AlertDialog.Builder dialog = new AlertDialog.Builder(NormalActivity.this);
                dialog.setTitle("确认返回？");
                dialog.setMessage("是否确认");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                dialog.setNegativeButton("Canel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.show();
                break;
            case R.id.button_hello:
                Intent intent = new Intent(NormalActivity.this, HelloWorld.class);
                startActivity(intent);
                break;
            case R.id.progress_button:
//                if (progressBar.getVisibility() == v.GONE){
//                    progressBar.setVisibility(v.VISIBLE);
//                }else {
//                    progressBar.setVisibility(v.GONE);
//                }
                int progress = progressBar.getProgress();
                progress = progress + 5;
                progressBar.setProgress(progress);
                break;
            case R.id.dialog_button:
                ProgressDialog progressDialog = new ProgressDialog(NormalActivity.this);
                progressDialog.setTitle("正在测试");
                progressDialog.setMessage("请等待...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            case R.id.listview_button:

                Intent intent1 = new Intent(NormalActivity.this, ListViewActivity.class);
                startActivity(intent1);
            default:
                break;
        }
    }

    //快速启动类
    public static void actionStart(Context context) {
        Intent intent = new Intent(context, NormalActivity.class);
        context.startActivity(intent);
    }
}
