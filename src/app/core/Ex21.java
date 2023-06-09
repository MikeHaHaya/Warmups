package app.core;

import java.util.Scanner;

public class Ex21 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean gotIt = false;
        int index = 0;
        System.out.println("Holla muchicho!");
        System.out.println("Today we're doing Fibonacci Java style.");

        while (!gotIt) {
            System.out.println("Choose an index and Java will show you on what number " +
                    "the index stands in the Fibonacci series:");
            String input = scan.nextLine();

            try {
                index = Integer.parseInt(input);
                if (index <= 0)
                    throw new NumberFormatException();
                gotIt = true;

            } catch (NumberFormatException ignore) {
                System.out.println("Can't do it man, make sure the number is a positive integer.");
            }

        }

        int value = findIndexValue(index);
        System.out.println("In the fibonacci series, the value in index " + index
                + " is: " + value);



    }

    private static int findIndexValue(int fibIndex) {

        int num1 = 1;
        int num2 = 1;
        int num3;

        // Return 1 if the index is 1 or 2 (since doing the loop will only complicate the code)
        if (fibIndex == 1 || fibIndex == 2)
            return 1;

        // Fib loop
        else {
            for (int i = 2; i <= fibIndex; i++) {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;

            }

            return num2;
        }
    }

}
