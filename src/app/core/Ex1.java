package app.core;

import java.util.Scanner;

/**
 * Randomize numbers, convert them to binary, ask  the user to guess the number,
 * tell if correct, if not reveal the right digit of the number, keep revealing
 * digits and ask of the number until they guess it correctly or the number was
 * completely revealed
 */
public class Ex1 {

    private static Scanner scan = new Scanner(System.in);

    private static void print(Object text) {
        System.out.println(text);
    }

    private static int ranNum;
    private static int binRanNum;

    public static void main(String[] args) {
        if (intro()) {
            randomNum();
            print(ranNum);
            print(binRanNum);
        } else
            System.out.println("Goodbye!");
    }

    // Randomizes numbers and converts them
    private static void randomNum() {
        ranNum = ((int) (Math.random() * 16 + 1));
        binRanNum = Integer.valueOf(Integer.toBinaryString(ranNum));
    }

    // Introduction
    private static boolean intro() {
        System.out.println("Hello! Welcome to guess the number!");
        System.out.println("In this program, a number from 1 to 16 will be randomized and converted to binary.");
        System.out.println("We will show you the number of digits the binary number has and you will have to guess it.");
        System.out.println("Each time you'll guess a wrong number, another digit will be folded and you could try again!");
        System.out.println();
        System.out.println("Are you ready to play? (Y/N)");
        String answer = scan.nextLine();
        
        while (!(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N"))) {
            System.out.println("Didn't catch that, try again please.");
            System.out.println("Are you ready to play? (Y/N)");
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
