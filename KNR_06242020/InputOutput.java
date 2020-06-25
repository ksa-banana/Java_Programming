package com.example.calc;

import android.util.Log;

import java.util.ArrayList;

public class InputOutput {

    //필드
    ArrayList<Double> num = new ArrayList<>();
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
            //num1에 저장된 값을 arraylist에 저장
            //num1에는 연산된 연산된 결과값
            num.add(index, num1);
            index++;
            num1 = 0;

            /**
             * 일항 연산자를 사용하면
             * s_num에 값이 들어오지 않고
             * num2는 0으로 패딩되어
             * 연산 처리하지 않고 넘어감
             **/
            if(s_num != ""){
                num1 = Double.parseDouble(op1 + s_num);
                s_num = "";
            }


            //아직 연산되지 않은 연산자
            op1 = op2;
            Log.i("num list", num+"");
            Log.i("op1", op1);
            Log.i("num1", num1+"");
            Log.i("num2", num2+"");

        }
        else if(op1 == "*"){

            /**
             * 일항 연산자를 사용하면
             * s_num에 값이 들어오지 않고
             * num2는 0으로 패딩되어
             * 연산 처리하지 않고 넘어감
             **/
            if(s_num != ""){
                num2 = Double.parseDouble(s_num);
                s_num = "";
            }
            if(num2 != 0){
                num1 = oper.multiplication(num1, num2);
                num2 = 0;
            }

            op1 = op2;

            Log.i("num list", num+"");
            Log.i("op1", op1);
            Log.i("num1", num1+"");
            Log.i("num2", num2+"");

        }
        else if(op1 == "/"){


            /**
             * 일항 연산자를 사용하면
             * s_num에 값이 들어오지 않고
             * num2는 0으로 패딩되어
             * 연산 처리하지 않고 넘어감
             **/
            if(s_num != ""){
                num2 = Double.parseDouble(s_num);
                s_num = "";
            }


            if (num2 != 0){
                num1 = oper.division(num1, num2);
                num2 = 0;
            }

            op1 = op2;


            Log.i("num list", num+"");
            Log.i("op1", op1);
            Log.i("num1", num1+"");
            Log.i("num2", num2+"");

        }
        else if(op1 == "mod"){


            /**
             * 일항 연산자를 사용하면
             * s_num에 값이 들어오지 않고
             * num2는 0으로 패딩되어
             * 연산 처리하지 않고 넘어감
             **/
            if(s_num != ""){
                num2 = Double.parseDouble(s_num);
                s_num = "";
            }


            if (num2 != 0){
                num1 = oper.mod(num1, num2);
                num2 = 0;
            }

            op1 = op2;
        }
        else if (op1 == "pow"){


            /**
             * 일항 연산자를 사용하면
             * s_num에 값이 들어오지 않고
             * num2는 0으로 패딩되어
             * 연산 처리하지 않고 넘어감
             **/
            if(s_num != ""){
                num2 = Double.parseDouble(s_num);
                s_num = "";
            }
            if(num2 != 0){
                num1 = oper.involutionFunction(num1, num2);
                num2 = 0;
            }

            op1 = op2;
        }
        else if (op1 == "log"){

            /** log 연산자 앞에 이항 연산자가 없는 경우**/
            if (s_num != ""){
                num1 = Double.parseDouble(s_num);
                s_num = "";
            }

            num1 =oper.commonLogFunction(num1);
            num2 = 0;

            op1 = op2;

            Log.i("num list", num+"");
            Log.i("op1", op1);
            Log.i("num1", num1+"");
            Log.i("num2", num2+"");

        }
        else if(op1 == "exp"){

            /** log 연산자 앞에 이항 연산자가 없는 경우**/
            if (s_num != ""){
                num1 = Double.parseDouble(s_num);
                s_num = "";
            }

            num1 =oper.expFunction(num1);
            num2 = 0;

            op1 = op2;

            Log.i("num list", num+"");
            Log.i("op1", op1);
            Log.i("num1", num1+"");
            Log.i("num2", num2+"");

        }
        else if (op1 == "factorial"){
            /** log 연산자 앞에 이항 연산자가 없는 경우**/
            if (s_num != ""){
                num1 = Double.parseDouble(s_num);
                s_num = "";
            }

            num1 =oper.factorialFunction(num1);
            num2 = 0;

            op1 = op2;

            Log.i("num list", num+"");
            Log.i("op1", op1);
            Log.i("num1", num1+"");
            Log.i("num2", num2+"");
        }

    }

    double intputEqual(){


        //마지막 피연산자 연산
        inputOper("");


        Log.i("=========", "최종 연산 전========");
        Log.i("num list", num+"");
        Log.i("op1", op1);
        Log.i("num1", num1+"");
        Log.i("num2", num2+"");


        /** 마지막 연산 결과값 리스트에 저장 **/
        num.add(index, num1);
        index++;
        num1 = 0;

        //result 값
        double sum = oper.sum(num);
        inputNum(String.valueOf(sum));

        clearArrayList(); //arrayList.clear() -> 객체를 비우고 삭제함.
        index = 0;


        Log.i("=========", "최종 연산 후========");
        Log.i("num list", num+"");
        Log.i("op1", op1);
        Log.i("num1", num1+"");
        Log.i("num2", num2+"");


        return sum;
    }


    void clearArrayList(){
        num.clear();
        num = new ArrayList<>();
    }





}