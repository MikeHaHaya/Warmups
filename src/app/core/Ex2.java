package app.core;

import java.util.Scanner;

public class Ex2 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dear friend, tel me, in what number should I stop printing?");
        String stringAnswer = scan.nextLine();
        int answer;

        // Translate String answer to int answer
        try {
            answer = Integer.parseInt(stringAnswer);
        } catch (NumberFormatException e) {
            System.out.println("Can't do that baby doll, goodbye now.");
        }

    }

}
