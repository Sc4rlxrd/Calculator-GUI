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
      try {
//          if (num2 == 0 ){
//              System.out.println("[ERRO] DIVISOR É ZERO ");
//          }
          double result =0;
          result= num1/num2;
          return result;
      }catch (ArithmeticException e){
          System.out.println("Exception: "  + e);
      }
      return 0;
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

    public static double dobro(double num1){
        return num1*2;
    }
    public static  double triplo(double num1){
        return num1*3;
    }
    public static double raiz(int num1){
       try {
         double result = Math.sqrt(num1);
         return result;

       }catch (Exception e){
           System.out.println("Exception: " + e );
       }finally {
           System.out.println("Finalizando....");
       }
        return 0;
    }

    
}
