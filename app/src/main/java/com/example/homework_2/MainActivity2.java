package com.example.homework_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        ArrayList<String> arrayList = intent.getStringArrayListExtra("array");
        int size = arrayList.size();
        String result = " ";
        for(int i = 0; i < size; i++)
        {
            result = result + arrayList.get(i) + "  ";
        }
        textView.setText(result);
    }
}