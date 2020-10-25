package com.example.homework_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.Serializable;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup_1;
    RadioGroup radioGroup_2;
    RadioButton radioButton_1;
    RadioButton radioButton_2;
    CheckBox checkBox_1,checkBox_2,checkBox_3,checkBox_4;
    ArrayList<String> array = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup_1=findViewById(R.id.radioGroup1);
        radioGroup_2=findViewById(R.id.radioGroup2);
        checkBox_1 = findViewById(R.id.checkBox);
        checkBox_2 = findViewById(R.id.checkBox2);
        checkBox_3 = findViewById(R.id.checkBox3);
        checkBox_4 = findViewById(R.id.checkBox4);
    }
    @Override protected void onRestart()
    {
        super.onRestart();
        array.clear();
    }
    public void showSelection(View view) {
        int checked_1 = radioGroup_1.getCheckedRadioButtonId();
        radioButton_1 = findViewById(checked_1);
        int checked_2 = radioGroup_2.getCheckedRadioButtonId();
        radioButton_2 = findViewById(checked_2);
        String radio1 = radioButton_1.getText().toString();
        String radio2 = radioButton_2.getText().toString();
        array.add(radio1);
        array.add(radio2);
        if(checkBox_1.isChecked())
        {
            array.add("checkBox_1");
        }
        if(checkBox_2.isChecked())
        {
            array.add("checkBox_2");
        }
        if(checkBox_3.isChecked())
        {
            array.add("checkBox_3");
        }
        if(checkBox_4.isChecked())
        {
            array.add("checkBox_4");
        }
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putStringArrayListExtra("array",array);
        startActivity(intent);
    }
}