package app.core;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex21 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean gotIt = false;
        int num = 0;
        System.out.println("Holla muchicho!");
        System.out.println("Today we're doing Fibonacci Java style.");

        while (!gotIt) {
            System.out.println("Choose an index and Java will show you on what number " +
                    "the index stands in the Fibonacci series.");
            String input = scan.nextLine();

            try {
                num = Integer.parseInt(input);
                if (num < 0)
                    throw new NumberFormatException();
                gotIt = true;

            } catch (NumberFormatException ignore) {
                System.out.println("Can't do it man, make sure the number is a positive integer.");
            }

        }




    }

    private static int findIndexValue(int i) {



        return 0;
    }

}
