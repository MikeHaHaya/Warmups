package app.core;

import java.util.Scanner;

public class Ex8 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int rows = 0;
        int columns = 0;

        // Gets correct input
        boolean gotIt = false;
        while (!gotIt) {

            System.out.println("Enter number of rows: ");
            String rowsInput = scan.nextLine();
            System.out.println("Enter number of columns: ");
            String columnsInput = scan.nextLine();

            try {
                rows = Integer.parseInt(rowsInput);
                columns = Integer.parseInt(columnsInput);

                if (rows <= 0 || columns <= 0)
                    throw new NumberFormatException();

                gotIt = true;

            } catch (NumberFormatException ignore) {
                System.out.println("Make sure to enter a positive integer.");
            }

        }

        // Prints correct output
        System.out.println("Here is your grid: ");
        for (int r = 0; r < rows; r++) {
            System.out.println();

            for (int c = 0; c < columns; c++) {
                System.out.print("*");
            }

        }

    }
}
