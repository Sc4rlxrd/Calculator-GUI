import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String num1;
        String num2;
        double result = 0;
        String text;
        String option1 ;
        int option =0;

        do{
            num1= JOptionPane.showInputDialog("Informe o primeiro valor: ");
            double value1 = Double.parseDouble(num1);

            num2= JOptionPane.showInputDialog("Informe o segundo valor: ");
            double value2 = Double.parseDouble(num2);

            option1 = JOptionPane.showInputDialog("Tell which arithmetic operation you want: \n [1] SUM\n [2] SUBTRACTION\n [3] MULTIPLICATION\n [4] DIVISION\n [5] REST OF DIVISION\n [6] POTENTIATION\n[7] DOBRO\n[8] TRIPLO\n[9] RAIZ\n[10] STOP ");
            option = Integer.parseInt(option1);

            switch (option){
                case 1 ->{
                    result = Operates.sum(value1,value2);
                    text = JOptionPane.showInputDialog("Result: " , result);

                }
                case 2 ->{
                    result = Operates.subtraction(value1,value2);
                    text = JOptionPane.showInputDialog("Result: " , result);

                }
                case 3 ->{
                    result = Operates.multiplication(value1,value2);
                    text = JOptionPane.showInputDialog("Result: " , result);
                }
                case 4 ->{
                    result = Operates.division(value1,value2);
                    text = JOptionPane.showInputDialog("Result: " , result);
                }
                case 5 ->{
                    result = Operates.restOfDivision(value1,value2);
                    text = JOptionPane.showInputDialog("Result: " , result);
                }
                case 6 ->{

                    result = Operates.potentiation(value1,value2);
                    text = JOptionPane.showInputDialog("Result: " , result);
                }
                case 7->{
                    result = Operates.dobro(Double.parseDouble(num1));
                    text = JOptionPane.showInputDialog("Result: " , result);
                }
                case 8 ->{
                    result = Operates.triplo(Double.parseDouble(num1));
                    text = JOptionPane.showInputDialog("Result: " , result);
                }
                case 9 ->{
                    result = Operates.raiz(Integer.parseInt(num1));
                    text = JOptionPane.showInputDialog("Result: " , result);

                }
                default -> {
                    System.out.println("DESCULPA OPÇÃO INVALIDA");
                    System.out.println("ENTRE EM CONTATO COM O SUPORTE");
                    System.out.println("CONTATO: guilherme2suporte@gmail.com");
                }
            }
        }while(10 != option);





    }
}