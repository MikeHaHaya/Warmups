package app;

import java.util.Scanner;

public class Globals {

    public static Scanner scan = new Scanner(System.in);

    public static int getPositiveIntegerInput() throws NumberFormatException {

        String input = scan.nextLine();
        try {
            return Integer.parseInt(input);

        } catch (NumberFormatException ignore) {
            throw new NumberFormatException("Something went wrong, make sure the number is a positive integer.");
        }

    }

}
