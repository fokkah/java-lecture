package se.lexicon;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int num1 = input.nextInt();
        System.out.println("Input a second number");
        int num2 = input.nextInt();
        System.out.println("Input a third number");
        int num3 = input.nextInt();

        System.out.println("Average of the 3 numbers are: " + (num1 + num2 + num3) /3);
    }
}
