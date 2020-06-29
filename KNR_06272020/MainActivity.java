package com.example.calc3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //필드
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnReset, btnDel, btnLeftP, btnRightP, btnDot, btnEqual;
    Button btnPlus, btnMinus, btnMulti, btnDivision, btnLog, btnExp, btnMod, btnInvolution, btnFactorial;
    TextView operExpressionDisplay;

    ArrayList<InputOutput> inputOutputs;
    int index;
    String operExpression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** 초기화 **/
        init();

        /** 버튼 리스너 **/
        setNumListener(inputOutputs);
        setOperListener(inputOutputs);
    }

    private void setNumListener(final ArrayList<InputOutput> inputOutputs){

        View.OnClickListener NumListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()){
                    case R.id.btn0:
                        inputOutputs.get(index).input('0');
                        operExpression += "0";
                        break;
                    case R.id.btn1:
                        inputOutputs.get(index).input('1');
                        operExpression += "1";
                        break;
                    case R.id.btn2:
                        inputOutputs.get(index).input('2');
                        operExpression += "2";
                        break;
                    case R.id.btn3:
                        inputOutputs.get(index).input('3');
                        operExpression += "3";
                        break;
                    case R.id.btn4:
                        inputOutputs.get(index).input('4');
                        operExpression += "4";
                        break;
                    case R.id.btn5:
                        inputOutputs.get(index).input('5');
                        operExpression += "5";
                        break;
                    case R.id.btn6:
                        inputOutputs.get(index).input('6');
                        operExpression += "6";
                        break;
                    case R.id.btn7:
                        inputOutputs.get(index).input('7');
                        operExpression += "7";
                        break;
                    case R.id.btn8:
                        inputOutputs.get(index).input('8');
                        operExpression += "8";
                        break;
                    case R.id.btn9:
                        inputOutputs.get(index).input('9');
                        operExpression += "9";
                        break;
                }

                /** 화면 출력 **/
                operExpressionDisplay.setText(operExpression);
            }
        };


        btn0.setOnClickListener(NumListener);
        btn1.setOnClickListener(NumListener);
        btn2.setOnClickListener(NumListener);
        btn3.setOnClickListener(NumListener);
        btn4.setOnClickListener(NumListener);
        btn5.setOnClickListener(NumListener);
        btn6.setOnClickListener(NumListener);
        btn7.setOnClickListener(NumListener);
        btn8.setOnClickListener(NumListener);
        btn9.setOnClickListener(NumListener);
    }



    private void setOperListener(final ArrayList<InputOutput> inputOutputs){

        /** 리스너 정의 **/
        View.OnClickListener OperationListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()){
                    case R.id.btnPlus:
                        inputOutputs.get(index).input('+');
                        operExpression += "+";
                        break;
                    case R.id.btnMinus:
                        inputOutputs.get(index).input('-');
                        operExpression += "-";
                        break;
                    case R.id.btnMulti:
                        inputOutputs.get(index).input('*');
                        operExpression += "*";
                        break;
                    case R.id.btnDivision:
                        inputOutputs.get(index).input('/');
                        operExpression += "/";
                        break;
                    case R.id.btnMod:
                        inputOutputs.get(index).input('m');
                        operExpression += "mod";
                        break;
                    case R.id.btnInvolution:
                        inputOutputs.get(index).input('^');
                        operExpression += "^";
                        break;
                    case R.id.btnLog:
                        inputOutputs.get(index).input('l');
                        operExpression += "log";
                        break;
                    case R.id.btnExp:
                        inputOutputs.get(index).input('e');
                        operExpression += "exp";
                        break;
                    case R.id.btnFactorial:
                        inputOutputs.get(index).input('!');
                        operExpression += "!";
                        break;
                    case R.id.btnLeftParenthesis:

//                        /** InputOutput 객체 새로 만들기 **/
//                        index++;
//                        inputOutputs.add(index, new InputOutput());

                        break;
                    case R.id.btnRightParenthesis:

//                        result = inputOutputs.get(index).inputEqual();
//
//                        /** InputOutput 객체 없애기 **/
//                        inputOutputs.remove(index);
//                        index--;
//
//                        inputOutputs.get(index).s_num = result + "";

                        break;
                    case R.id.btnEqual:
                        /** 아직 10개 이상 들어갈 경우 처리 안함**/
                        //result = inputOutputs.get(index).inputEqual();
                        inputOutputs.get(index).inputEqual();
                        //operExpression = String.valueOf(result);

                        /** 연산하지 않고 숫자만 입력했을 경우 **/
                        //inputOutputs.get(index).inputNum(result+"");
                        break;
                    case R.id.btnReset:
                        operExpressionDisplay.setText("");
                        break;
                }

                /** 화면 출력 **/
                operExpressionDisplay.setText(operExpression);

            }
        };


        /** 리스너 연결 **/
        btnPlus.setOnClickListener(OperationListener);
        btnMinus.setOnClickListener(OperationListener);
        btnMulti.setOnClickListener(OperationListener);
        btnDivision.setOnClickListener(OperationListener);
        btnMod.setOnClickListener(OperationListener);
        btnInvolution.setOnClickListener(OperationListener);
        btnLog.setOnClickListener(OperationListener);
        btnExp.setOnClickListener(OperationListener);
        btnFactorial.setOnClickListener(OperationListener);
        btnEqual.setOnClickListener(OperationListener);
        btnReset.setOnClickListener(OperationListener);
        btnLeftP.setOnClickListener(OperationListener);
        btnRightP.setOnClickListener(OperationListener);
        btnReset.setOnClickListener(OperationListener);
    }




    private void init(){

        //리소스 연결
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);


        btnReset = (Button) findViewById(R.id.btnReset);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnLeftP = (Button) findViewById(R.id.btnLeftParenthesis);
        btnRightP = (Button) findViewById(R.id.btnRightParenthesis);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEqual = (Button) findViewById(R.id.btnEqual);


        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMod = (Button) findViewById(R.id.btnMod);
        btnLog = (Button) findViewById(R.id.btnLog);
        btnExp = (Button) findViewById(R.id.btnExp);
        btnInvolution = (Button) findViewById(R.id.btnInvolution);
        btnFactorial = (Button) findViewById(R.id.btnFactorial);


        operExpressionDisplay = (TextView) findViewById(R.id.operExpression);
        operExpression = "";
        inputOutputs = new ArrayList<>();
        inputOutputs.add(0, new InputOutput());
        index = 0;
    }
}