package se.lexicon;

import java.util.Scanner;

public class ConvertSecondsToMinutesToSeconds {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input seconds to convert to Hr:Min:Sec");

        int seconds = input.nextInt();
        float hour = seconds /24;
        System.out.println(hour);


    }
}
