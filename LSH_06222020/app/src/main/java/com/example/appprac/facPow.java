package com.example.appprac;

public class facPow {

    public int funcFactorial(int value) {

        if (value == 0) {

            return 1;
        }

        else if (value == 1) {

            return value;
        }

        return value * funcFactorial((value - 1));
    }

    public int funcPow(int value1, int value2) {

        int result = 1;

        for (int i = 0; i < value2; i++){

            result = value1 * result;
        }

        return result;
    }
}
