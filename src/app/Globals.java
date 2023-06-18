package app;

import java.util.Scanner;

public class Globals {

    public static Scanner scan = new Scanner(System.in);


    public int getPositiveIntegerInput() {

        String input = scan.nextLine();
        try {
            int num = Integer.parseInt(input);
            return num;

        } catch (NumberFormatException ignore) {
            throw new NumberFormatException("Something went wrong, make sure the number is a positive integer.");
        }

    }

}
