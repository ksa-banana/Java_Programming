package inputOutput;

public class Operation {

    // »çÄ¢¿¬»ê
    // µ¡¼À
    public double plus(double x, double y){
        return x+y;
    }

    // »¬¼À: -1À» °öÇÑ °ÍÀ¸·Î º¯È¯
    public double minus(double x, double y){
        return x+(-1)*y;
    }

    // °ö¼À
    public double multiplication(double x, double y){
        return x*y;
    }

    // ³ª´°¼À
    public double division(double x, double y){
        return x/y;
    }

    // ³ª¸ÓÁö ¿¬»ê
    public double mod(double x, double y){
        return x%y;
    }


    // exp() Áö¼ö ¿¬»ê
    public double expFunction(double x){

        return Math.exp(x);
    }

    // »ó¿ë·Î±× ¿¬»ê
    public double commonLogFunction(double x){
        return Math.log10(x);
    }


    // °ÅµìÁ¦°ö ¿¬»ê
    public double involutionFunction(double x, double y) {
        return Math.pow(x,y);
    }

    // ÆÑÅä¸®¾ó ¿¬»ê
    public double factorialFunction(double x) {

        if (x <= 1) {
            return 1;
        } else {
            return factorialFunction(x - 1)*x;
        }
    }

}
