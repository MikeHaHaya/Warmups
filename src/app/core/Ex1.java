package app.core;

import java.util.Scanner;

/**
 * Randomize numbers, convert them to binary, ask  the user to guess the number,
 * tell if correct, if not reveal the right digit of the number, keep revealing
 * digits and ask of the number until they guess it correctly or the number was
 * completely revealed
 */
public class Ex1 {

    private static final Scanner scan = new Scanner(System.in);

    private static void print(Object text) {
        System.out.println(text);
    }

    private static int ranNum;
    private static String binRanNum;

    public static void main(String[] args) {
        if (intro()) {
            randomNum();
            print(ranNum);
            print(binRanNum);
            printDotsByNumber();
        } else
            System.out.println("Goodbye!");
    }

    // Prints dots according to variables
    private static void printDotsByNumber() {

        String answer;
        int answerToInt;
        int binaryNum = Integer.parseInt(binRanNum);

        print("So let us begin!");
        print(".");
        print(".");
        print(".");
        print(".");
        print(".");
        print(".");

        boolean correct = false;
        int length = binRanNum.length();
        int showDigits = 0;

        while (length > 0 && !correct) {

            print("Guess the number with these binary digits :");


            // Prints digits by variables
            for (int i = 0; i < showDigits; i++) {
                // TODO -- Fix bug here, doesn't print the correct binary number
                double divBy = Math.pow(10.0, (binRanNum.length() - i));
                int digitsToPrint = (int) (binaryNum / divBy);
                System.out.print(digitsToPrint);
            }

            // Prints dots by variables
            for (int i = 0; i < length; i++) {
                System.out.print("-");
            }

            print("");

            // Scan answer
            while (true) {
                try {
                    answer = scan.nextLine();
                    answerToInt = Integer.parseInt(answer);

                    if (answerToInt >= 1 && answerToInt <= 16) {
                        break;
                    } else {
                        print("The answer has to be a number between 1 to 16.");
                    }
                } catch (NumberFormatException e) {
                    print("The answer has to be a number between 1 to 16.");
                }
            }

            //
            if (answerToInt != ranNum) {
                showDigits++;
                length--;
            } else {
                correct = true;
            }

        }

        if (correct)
            print("You did it champ!");
        else
            print("Man you suck at this.");

        print("The number was " + ranNum + " and it's binary number was " + binaryNum);
        print("Come back soon!");

    }

    // Randomizes numbers and converts them
    private static void randomNum() {
        ranNum = ((int) (Math.random() * 16 + 1));
        binRanNum = Integer.toBinaryString(ranNum);

    }

    // Introduction
    private static boolean intro() {

        print("Hello! Welcome to guess the number!");
        print("In this program, a number from 1 to 16 will be randomized and converted to binary.");
        print("We will show you the number of digits the binary number has and you will have to guess it.");
        print("Each time you'll guess a wrong number, another digit will be folded and you could try again!");
        print("");
        print("Are you ready to play? (Y/N)");
        String answer = scan.nextLine();

        while (!(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N"))) {
            print("Didn't catch that, try again please.");
            print("Are you ready to play? (Y/N)");
            answer = scan.nextLine();
        }

        if (answer.equalsIgnoreCase("Y"))
            return true;
        else if (answer.equalsIgnoreCase("N"))
            return false;
        else
            return false;

    }


}
