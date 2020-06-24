package com.example.calc;

import android.util.Log;

import java.util.ArrayList;

public class InputOutput {

    //필드
    ArrayList<Double> num = new ArrayList<Double>();
    Operation oper = new Operation();

    String s_num = "";
    String op1 = "+";
    double num1, num2 = 0;
    int index = 0;




    //메서드
    void inputNum(String s_num){
        this.s_num += s_num;
    }


    void inputOper(String op2){


        if(op1 == "+" || op1 == "-"){
            num1 = Double.parseDouble(op1 + s_num);
            s_num = "";

            if(op2 == "+" || op2 == "-"){
                num.add(index, num1);
                index++;
            }


            this.op1 = op2;
            Log.i("num1", num1+"");
            Log.i("num2", num2+"");
            Log.i("op1", op1);
            Log.i("op2", op2);
        }
        else if(op1 == "*"){
            num2 = Double.parseDouble(s_num);
            s_num = "";

            num1 = oper.multiplication(num1, num2);
            this.op1 = op2;
        }
        else if(op1 == "/"){
            num2 = Double.parseDouble(s_num);
            s_num = "";

            num1 = oper.division(num1, num2);
            this.op1 = op2;
        }
        else if(op1 == "mod"){
            num2 = Double.parseDouble(s_num);
            s_num = "";

            num1 = oper.mod(num1, num2);
            this.op1 = op2;
        }
        else if (op1 == "pow"){
            num2 = Double.parseDouble(s_num);
            s_num = "";

            num1 = oper.involutionFunction(num1, num2);
        }
    }


    void inputLog(){
        num2 = Double.parseDouble(s_num);
        s_num = "";

        num1 =oper.commonLogFunction(num2);
        op1 = "+";
    }


    void inputExp(){
        num2 = Double.parseDouble(s_num);
        s_num = "";

        num1 = oper.expFunction(num2);
        op1 = "+";
    }

    void intputFactorial(){
        num2 = Integer.parseInt(s_num);
        s_num = "";

        num1 = oper.factorialFunction(num2);
        op1 = "+";
    }


    double intputEqual(){

        Log.i("num1", num1+"");
        Log.i("num2", num2+"");
        Log.i("op1", op1);

        s_num = String.valueOf(oper.sum(num));

        return Double.parseDouble(s_num);
    }







}