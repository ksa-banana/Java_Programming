package com.example.appprac;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    facPow funFac = new facPow();
    Button factorial;
    Button pow;
    TextView tv;
    int value = 5;
    int value2 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        factorial=(Button) findViewById(R.id.factorial);
        pow=(Button) findViewById(R.id.pow);
        tv=(TextView) findViewById(R.id.tv);

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(funFac.funcFactorial(value)));
            }
        });

        pow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText(String.valueOf(funFac.funcPow(value, value2)));
            }
        });
    }


}