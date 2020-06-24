package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnReset, btnDel, btnLeftP, btnRightP, btnDot, btnEqual;
    Button btnPlus, btnMinus, btnMulti, btnDivision, btnLog, btnExp, btnMod, btnInvolution, btnFactorial;
    TextView OperExpressionDisplay, HistoryDisplay;

    String operExpression;
    String history[];
    int historyIndex = 0;
    Double result;
    String history_data = null;

    // history, reset 객체생성
    History history = new History();
    Reset reset = new Reset();

    final InputOutput inputOutput = new InputOutput();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();


        setNumListener(inputOutput);
        setOperationListener(inputOutput);



    }



    void init(){
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


        OperExpressionDisplay = (TextView) findViewById(R.id.operExpression);
        HistoryDisplay = (TextView) findViewById(R.id.history);



        //변수 초기화
        operExpression = null;
        history = new String[10];
        result = 0.0;

    }



    void setNumListener(final InputOutput inputOutput){

        //리스너 정의
        //숫자 버튼 눌렸을 때
        View.OnClickListener NumListener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {


                /**   id 상수값으로 코드 줄이는 방법 생각해보기   **/
                switch (view.getId()){
                    case R.id.btn0:
                        inputOutput.inputNum("0");
                        operExpression += "0";
                        break;
                    case R.id.btn1:
                        inputOutput.inputNum("1");
                        operExpression += "1";
                        break;
                    case R.id.btn2:
                        inputOutput.inputNum("2");
                        operExpression += "2";
                        break;
                    case R.id.btn3:
                        inputOutput.inputNum("3");
                        operExpression += "3";
                        break;
                    case R.id.btn4:
                        inputOutput.inputNum("4");
                        operExpression += "4";
                        break;
                    case R.id.btn5:
                        inputOutput.inputNum("5");
                        operExpression += "5";
                        break;
                    case R.id.btn6:
                        inputOutput.inputNum("6");
                        operExpression += "6";
                        break;
                    case R.id.btn7:
                        inputOutput.inputNum("7");
                        operExpression += "7";
                        break;
                    case R.id.btn8:
                        inputOutput.inputNum("8");
                        operExpression += "8";
                        break;
                    case R.id.btn9:
                        inputOutput.inputNum("9");
                        operExpression += "9";
                        break;

                }
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


    void setOperationListener(final InputOutput inputOutput){

        View.OnClickListener OperationListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btnPlus:
                        inputOutput.inputOper("+");
                        operExpression += "+";
                        break;
                    case R.id.btnMinus:
                        inputOutput.inputOper("-");
                        operExpression += "-";
                        break;
                    case R.id.btnMulti:
                        inputOutput.inputOper("*");
                        operExpression += "*";
                        break;
                    case R.id.btnDivision:
                        inputOutput.inputOper("/");
                        operExpression += "/";
                        break;
                    case R.id.btnMod:
                        inputOutput.inputOper("mod");
                        operExpression += "mod";
                        break;
                    case R.id.btnInvolution:
                        inputOutput.inputOper("pow");
                        operExpression += "pow";
                        break;
                    case R.id.btnLog:
                        inputOutput.inputLog();
                        operExpression += "log";
                        break;
                    case R.id.btnExp:
                        inputOutput.inputExp();
                        operExpression += "exp";
                        break;
                    case R.id.btnFactorial:
                        inputOutput.intputFactorial();
                        operExpression += "!";
                        break;
                    case R.id.btnEqual:
                        /** 아직 10개 이상 들어갈 경우 처리 안함**/
                        result = inputOutput.intputEqual();
                        history[historyIndex] = operExpression + " = " + result;
                        operExpression = String.valueOf(result);
                        //showhistory
                        history_data = history.showHistory(x);
                        HistoryDisplay.setText(history_data);
                        break;
                    case R.id.btnReset:
                        operExpression = null;
                        OperExpressionDisplay.setText(operExpression);
                        break;
                }
            }
        };


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


    }


    void setOperExpressionDisplay(){





    }





}
