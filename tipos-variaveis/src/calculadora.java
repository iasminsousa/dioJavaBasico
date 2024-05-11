import java.util.Scanner;
public class Calculadora{
    public static double adicao( double num1 , double num2){
        return num1+num2;
    }
    public static double subtracao(double num1, double num2){
        return num1-num2;
    }
    public static double multiplicacao(double num1, double num2){
        return num1*num2;
    }
    public static double divisao(double num1, double num2){
        if(num2 ==0){
            throw new IllegalArgumentException("Não é possível fazer a divisão por zero");
        }
        return num1/num2;
    }
    public static void main(String[] args) throws Exception {
     double num1;
     double num2;
     Scanner scan= new Scanner(System.in);
     System.out.println("Digite um número: ");
     num1= scan.nextDouble();
     System.out.println("Digite outro número: ");
     num2= scan.nextDouble();
     System.out.println("O resultado das quatro operações com esses números são: ");
     System.out.println("Soma= " +adicao(num1,num2));
     System.out.println("Subtração= " +subtracao(num1,num2));
     System.out.println("Multiplicação= " +multiplicacao(num1,num2));
     System.out.println("Divisão= " +divisao(num1,num2));
    
    }

}