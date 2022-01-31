package com.cookandroid.a60182174_week8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rdobtn2, rdobtn3;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.rg);
        rdobtn2 = (RadioButton) findViewById(R.id.radioBtn2);
        rdobtn3 = (RadioButton) findViewById(R.id.radioBtn3);
        btn = (Button) findViewById(R.id.btnNewActivity);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (rg.getCheckedRadioButtonId()){
                    case R.id.radioBtn2 :
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.radioBtn3 :
                        intent = new Intent(MainActivity.this, ThirdActivity.class);
                        intent.putExtra("name", "Alice");
                        intent.putExtra("age", 33);
                        startActivity(intent);
                        break;
                }

            }
        });

    }
}