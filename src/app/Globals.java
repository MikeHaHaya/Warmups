package app;

import java.util.InputMismatchException;
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

    public static boolean getBooleanInput() throws InputMismatchException {

        String input = scan.nextLine();
        if (input.equalsIgnoreCase("Y"))
            return true;
        else if (input.equalsIgnoreCase("N"))
            return false;
        else
            throw new InputMismatchException();

    }

}
