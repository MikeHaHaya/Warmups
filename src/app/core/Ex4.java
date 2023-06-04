package app.core;

import java.util.Scanner;

public class Ex4 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String answer;
        int num;
        boolean gotIt = false;

        // Receive correct input
        while (!gotIt) {

            // Get answer
            System.out.println("Enter a number please: ");
            answer = scan.nextLine();

            // Check answer
            try {
                num = Integer.parseInt(answer);


            } catch (NumberFormatException e) {


            }

        }

    }

}
