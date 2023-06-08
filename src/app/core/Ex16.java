package app.core;

import java.util.Scanner;

public class Ex16 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        // Input loop
        boolean gotIt = false;
        while (!gotIt) {

            System.out.println("Enter the first positive integer: ");
            String input1 = scan.nextLine();
            System.out.println("Enter the second one: ");
            String input2 = scan.nextLine();

            try {

                int x1 = Integer.parseInt(input1);
                int x2 = Integer.parseInt(input2);

                if (x1 < 0 || x2 < 0)
                    throw new NumberFormatException();

                num1 = x1;
                num2 = x2;
                gotIt = true;

            } catch (NumberFormatException e) {
                System.out.println("Come on now, a positive integer please.");

            }

        }

        // Multiply num1 with num2 without asterisks
        int mult = Math.multiplyExact(num1, num2);
        System.out.println("Here is your multiplication of your 2 numbers: " + mult);
        System.out.println("Probably couldn't do it by yourself ha? you are so stupid omg.");

    }

}
