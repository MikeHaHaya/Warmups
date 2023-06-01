package app.core;

import java.util.Scanner;

public class Ex3 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Get an answer from the user
        System.out.println("Dear friend, tel me, in what number should I start printing?");
        String startString = scan.nextLine();
        System.out.println("Now dear friend, tell me when I should stop printing?");
        String stopString = scan.nextLine();
        int start;
        int stop;

        // Translate String answer to int top
        try {

            start = Integer.parseInt(startString);
            stop = Integer.parseInt(stopString);
            if (start >= stop) {
                throw new NumberFormatException("The start number has to be smaller than the top number.");
            }

            for (int i = start; i < stop; i++) {
                System.out.print(i + ", ");
            }
            System.out.print(stop);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}
