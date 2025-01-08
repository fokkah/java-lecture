package se.lexicon;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {

        Scanner yearInput = new Scanner(System.in);
        System.out.println("Enter a year, e.g 1981 to see if its a Leap year or not");
        int year = yearInput.nextInt();
        boolean leapOrNotToLeap;
        leapOrNotToLeap = (year % 4 == 0);
        leapOrNotToLeap = leapOrNotToLeap && (year % 100 != 0 || year % 400 == 0);

        if (leapOrNotToLeap) {
            System.out.println(year + " Is a leap year! :)");
        } else System.out.println(year + " Is NOT a leap year! :(");
        yearInput.close();
        System.out.println("Program is now closing, thank you for playing.");
    }
}
