package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText number1 = findViewById(R.id.n1);
        EditText number2 = findViewById(R.id.n2);
        TextView sign = findViewById(R.id.Sign);
        TextView ans = findViewById(R.id.answer);
        Button equality = findViewById(R.id.equalto);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button divide = findViewById(R.id.divide);
        Button mutiply = findViewById(R.id.multiply);
        final int[] id = {0};

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign.setText("-");
                id[0] = 1;
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign.setText("+");
                id[0] = 0;
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign.setText("/");
                id[0]=2;
            }
        });
        mutiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign.setText("*");
                id[0] = 3;
            }
        });
        equality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(number1.getText().toString());
                int no2 = Integer.parseInt(number2.getText().toString());
                Toast.makeText(MainActivity.this, "your answer is", Toast.LENGTH_SHORT).show();
                if (id[0] == 0){
                    String a = String.valueOf((no1+no2));
                    ans.setText(a);
                } else if (id[0] == 1){
                    String a = String.valueOf((no1-no2));
                    ans.setText(a);
                } else if (id[0] == 2){
                    String a = String.valueOf((no1/no2));
                    ans.setText(a);
                }else if (id[0] == 3){
                    String a = String.valueOf((no1*no2));
                    ans.setText(a);
                }
            }
        });
    }
}