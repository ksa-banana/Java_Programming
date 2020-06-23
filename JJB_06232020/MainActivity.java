package com.example.cal;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cal.History;

public class MainActivity extends AppCompatActivity {

    Operation operator = new Operation();
    History history = new History();
    Reset reset = new Reset();

    Button btn_plus;
    Button btn_minus;
    Button btn_multi;
    Button btn_divide;
    Button btn_mod;

    Button btn_exp;
    Button btn_log;

    Button btn_pow;
    Button btn_factorial;

    Button btn_history;
    Button btn_reset;

    TextView tv;

    double result = 0;
    double x = 5;
    double y = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_plus=(Button) findViewById(R.id.btn_plus);
        btn_minus=(Button) findViewById(R.id.btn_minus);
        btn_multi=(Button) findViewById(R.id.btn_multi);
        btn_divide=(Button) findViewById(R.id.btn_divide);
        btn_mod=(Button) findViewById(R.id.btn_mod);
        btn_exp=(Button) findViewById(R.id.btn_exp);
        btn_log=(Button) findViewById(R.id.btn_log);
        btn_pow=(Button) findViewById(R.id.btn_pow);
        btn_factorial=(Button) findViewById(R.id.btn_factorial);
//        btn_history =(Button)  findViewById(R.id.btn_history);
        btn_reset=(Button) findViewById(R.id.btn_reset);

        tv=(TextView) findViewById(R.id.operExpression);

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(operator.plus(x,y)));
            }
        });


        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(operator.multiplication(x,y)));
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(operator.division(x,y)));
            }
        });

        btn_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(operator.mod(x,y)));
            }
        });

        btn_exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(operator.expFunction(x)));
            }
        });

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(operator.commonLogFunction(x)));
            }
        });


        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(operator.minus(x,y)));
            }
        });


        btn_pow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                tv.setText(String.valueOf(operator.involutionFunction(x, y)));
            }

        });

        btn_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(operator.factorialFunction(x)));
            }
        });

//        btn_history.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv.setText(String.valueOf(history.showHistory(x)));
//            }
//        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(reset.resetData(x)));
            }
        });
    }


}