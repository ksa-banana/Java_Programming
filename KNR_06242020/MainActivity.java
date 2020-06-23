package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //리소스 연결
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);


        Button btnReset = (Button) findViewById(R.id.btnReset);
        Button btnDel = (Button) findViewById(R.id.btnDel);
        Button btnLeftP = (Button) findViewById(R.id.btnLeftParenthesis);
        Button btnRightP = (Button) findViewById(R.id.btnRightParenthesis);
        Button btnDot = (Button) findViewById(R.id.btnDot);
        Button btnEqual = (Button) findViewById(R.id.btnEqual);


        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnMinus = (Button) findViewById(R.id.btnMinus);
        Button btnMulti = (Button) findViewById(R.id.btnMulti);
        Button btnDivide = (Button) findViewById(R.id.btnDivision);
        Button btnMod = (Button) findViewById(R.id.btnMod);
        Button btnLog = (Button) findViewById(R.id.btnLog);
        Button btnExp = (Button) findViewById(R.id.btnExp);
        Button btnInvolution = (Button) findViewById(R.id.btnInvolution);
        Button btnFactorial = (Button) findViewById(R.id.btnFactorial);


        TextView OperationDisplay = (TextView) findViewById(R.id.operExpression);

        //변수 선언
        String operExpression = null;


        //리스너 정의
        //
        Button.OnClickListener NumListener = new Button.OnClickListener(){

        }

        btn0.setOnClickListener(NumListener);







    }
}