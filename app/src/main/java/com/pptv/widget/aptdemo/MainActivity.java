package com.pptv.widget.aptdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.AutoCreate;

@AutoCreate
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
