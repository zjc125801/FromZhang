package com.zjc.demoapp;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    private EditText name;
    private EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        pwd = (EditText) findViewById(R.id.pwd);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namet = name.getText().toString();
                String pwdw = pwd.getText().toString();

                String nameText = namet.replace(" ","");
                String pwdText = pwdw.replace(" ","");

                Boolean b = TextUtils.isEmpty(nameText) || TextUtils.isEmpty(pwdText);
                System.out.println(b);
                if (b == true){
                    Toast.makeText(MainActivity.this, "账号和密码不能为空!", Toast.LENGTH_SHORT).show();
                }else {
                    if (nameText.equals("吴彦祖") && pwdText.equals("123")) {
                        Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                        //Intent intent = new Intent(MainActivity.this,HelloWorld.class);
                        //startActivity(intent);
                        String data = nameText;
                        Intent intent = new Intent(MainActivity.this,HelloWorld.class);
                        startActivityForResult(intent,1);
                        intent.putExtra("extra_data",data)  ;
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity.this, "账号或密码有误！", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (requestCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    System.out.println(returnedData);
                }
                break;
            default:
        }
    }
}
