package com.example.calc3;

public class Operation {

    // ��Ģ����
    // ����
    public double plus(double x, double y){
        return x+y;
    }

    // ����: -1�� ���� ������ ��ȯ
    public double minus(double x, double y){
        return x+(-1)*y;
    }

    // ����
    public double multiplication(double x, double y){
        return x*y;
    }

    // ������
    public double division(double x, double y){
        return x/y;
    }

    // ������ ����
    public double mod(double x, double y){
        return x%y;
    }


    // exp() ���� ����
    public double expFunction(double x){

        return Math.exp(x);
    }

    // ���α� ����
    public double commonLogFunction(double x){
        return Math.log10(x);
    }


    // �ŵ����� ����
    public double involutionFunction(double x, double y) {
        return Math.pow(x,y);
    }

    // ���丮�� ����
    public double factorialFunction(double x) {
		if (x == 0) {
			return 1;
		}
        else if (x <= 1) {
            return 1;
        } else {
            return factorialFunction(x - 1)*x;
        }
    }

}
