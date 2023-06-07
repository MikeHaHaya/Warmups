package app.core;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Scan 5 numbers
        System.out.println("Please enter a bunch of numbers (5 to be exact): ");
        for (int i = 0; i < 5; i++) {
            try {
                String input = scan.nextLine();
                int num = Integer.parseInt(input);


            } catch (NumberFormatException e) {
                System.out.println("What the fuck man.");
            }
        }
    }

}
