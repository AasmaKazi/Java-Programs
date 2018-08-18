import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        char op;
        double num1,num2,result;

        Scanner sc=new Scanner(System.in);

        System.out.println(" Enetr oprator: ");
        op=sc.next().charAt(0);

        System.out.println("Enter num1:");
        num1=sc.nextDouble();

        System.out.println("Enter num2: ");
        num2=sc.nextDouble();

        switch (op){

            case '+':
                result = num1 + num2;
                System.out.println(num1 +" + "+ num2 +" = " + result );
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 +" - "+ num2 +" = " + result );
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 +" / "+ num2 +" = " + result );
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 +" * "+ num2 +" = " + result );
                break;

            case '%':
                result = num1 % num2;
                System.out.println(num1 +" % "+ num2 +" = " + result );
                break;

                default:
                    System.out.println("invalid case");
                    break;

        }
    }
}
