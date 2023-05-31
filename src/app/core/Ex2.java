package app.core;

import java.util.Scanner;

public class Ex2 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Get an answer from the user
        System.out.println("Dear friend, tel me, in what number should I stop printing?");
        String answer = scan.nextLine();
        int top;

        // Translate String answer to int top
        try {

            top = Integer.parseInt(answer);
            if (top <= 0) {
                throw new NumberFormatException("Number has to be an integer above 0.");
            }

            for (int i = 0; i < top; i++) {
                System.out.print(i + ", ");
            }
            System.out.print(top);

        } catch (NumberFormatException e) {
            System.out.println("Number has to be an integer above 0.");
            System.out.println("Can't do that baby doll, goodbye now.");
        }

    }

}
