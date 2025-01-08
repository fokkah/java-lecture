package se.lexicon;

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter a second number");
        int num2 = input.nextInt();
        System.out.println(" Result "  + Math.addExact(num1, num2));
        System.out.println(Math.floorDiv(num1, num2));
        */

//System.out.println(num1);
//System.out.println(num2);

        /*int num1 = input.nextInt();
        int num2 = input.nextInt();
        char num3 = input.next().charAt(0);
        double result = num1 + num3 + num2;
        System.out.println(result);
        */

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter a number");
        num1 = input.nextDouble();
        System.out.println("Enter a second number");
        num2 = input.nextDouble();
        System.out.println("Enter one of these operators: +, -, / or *");
        char operator = input.next().charAt(0);

        input.close();
        double output;

        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            case '*':
                output = num1 * num2;
                break;

            default:
                System.out.println("You didnt enter a correct operator, please try again");
                return;
        }

        System.out.println(num1 + "" + operator + num2 + "=" + output);


    }
}
// https://beginnersbook.com/2017/09/java-program-to-make-a-calculator-using-switch-case/
