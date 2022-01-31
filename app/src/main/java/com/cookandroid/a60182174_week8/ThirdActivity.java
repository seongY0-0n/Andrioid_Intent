package com.cookandroid.a60182174_week8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    Button btn;
    Intent intent;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        intent = getIntent();
        Bundle extras = intent.getExtras();
        String rxName = extras.getString("name");
        int rxAge = extras.getInt("age");

        editText = (EditText) findViewById(R.id.editText);
        editText.setText("이름 : " + rxName + "   나이 : " + rxAge);
        
        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
