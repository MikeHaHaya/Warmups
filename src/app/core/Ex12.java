package app.core;

import java.util.Scanner;

public class Ex12 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Get an answer from the user
        System.out.println("Dear friend, tel me, in what number should I start printing?");
        String startString = scan.nextLine();
        System.out.println("Now dear friend, tell me when I should stop printing?");
        String stopString = scan.nextLine();
        int start;
        int stop;

        try {

            start = Integer.parseInt(startString);
            stop = Integer.parseInt(stopString);
            if (start >= stop) {
                throw new NumberFormatException("The start number has to be smaller than the top number.");
            }

            for (int i = start; i <= stop; i++) {
                System.out.print(i + ", ");
            }

            for (int i = stop - 1; i > start; i--) {
                System.out.print(i + ", ");
            }
            System.out.print(start);

        } catch (NumberFormatException e) {
            System.out.println("Something went wrong, make sure the start number is smaller than" +
                    " the top number and that you input only integers.");
        }

    }

}
