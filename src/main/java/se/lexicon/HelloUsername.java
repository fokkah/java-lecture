package se.lexicon;

import java.util.Scanner;

public class HelloUsername {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input username");
        String username = (input.next());
        System.out.println("Hello " + username );
    }
}
