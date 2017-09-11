package com.jiaotang.githubtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void clickButton(View view) {
        Toast.makeText(this,"第一次上传",Toast.LENGTH_LONG).show();
    }
}
