package com.zjc.demoapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by taren on 2017/12/14.
 */

public class HelloWorld extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("HelloWorld","Task id is " + getTaskId());
        setContentView(R.layout.hello_world);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Toast.makeText(HelloWorld.this,"登录用户为："+data,Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(data);
        Button button = (Button) findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelloWorld.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //finish
        Button button_fin = (Button) findViewById(R.id.button_finish);
        button_fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return","zhangjiaocng");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        Button button_baidu = (Button) findViewById(R.id.button_baidu);
        button_baidu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
        Button button_tel = (Button) findViewById(R.id.button_tel);
        button_tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });
    }

    //菜单栏
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.add_item:
//                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.remove_item:
//                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
//                break;
//            default:
//        }
//        return true;
//    }
}
