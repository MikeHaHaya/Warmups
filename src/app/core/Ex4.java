package app.core;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String answer;
        int num = 0;
        boolean gotIt = false;

        // Receive correct input
        while (!gotIt) {

            // Get answer
            System.out.println("Enter a number please: ");
            answer = scan.nextLine();

            // Check answer
            try {
                num = Integer.parseInt(answer);
                if (num <= 0)
                    throw new NumberFormatException();
                gotIt = true;
                System.out.println("We did it!");

            } catch (NumberFormatException e) {
                System.out.println("Make sure you entered a number that is a positive integer.");

            }
        }

        ArrayList<Integer> divBy3 = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (i % 3 == 0)
                divBy3.add(i);
        }

        for (Integer i : divBy3) {
            sum += i;
        }


        System.out.println("All numbers divided by 3 from 0 to " + num + ": ");
        System.out.println(divBy3);
        System.out.println();
        System.out.println("Total sum of those numbers: ");
        System.out.println(sum);

    }

}
