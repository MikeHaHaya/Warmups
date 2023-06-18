package app.core;

import static app.Globals.*;

public class Ex2 {

    public static void main(String[] args) {

        // Get an answer from the user
        System.out.println("Dear friend, tel me, in what number should I stop printing?");

        // Translate String answer to int top
        try {

            int top = getPositiveIntegerInput();

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
