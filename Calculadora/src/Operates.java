import java.awt.*;

public class Operates {
    public static double sum(double num1, double num2){
        double result = 0;
        result= num1+num2;
        return result ;
    }

    public  static double  subtraction(double num1, double num2){
        double result =0;
        result = num1-num2;
        return result;
    }

    public  static double division(double num1, double num2){
        if (num2 == 0 ){
            System.out.println("[ERRO] DIVISOR É ZERO ");
        }
        double result =0;
        result= num1/num2;
        return result;
    }

    public static double multiplication(double num1, double num2){
        double result = 0;
        result = num1*num2;
        return result;
    }

    public static double restOfDivision(double num1,double num2){
        double result = 0;
        result = num1 % num2;
        return result;
    }

    public  static double potentiation(double num1, double num2){
        double result = 0;
        result = Math.pow(num1,num2);
        return result;
    }

    
}
