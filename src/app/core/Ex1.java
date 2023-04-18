package app.core;

import java.util.Scanner;

/**
 * Randomize numbers, convert them to binary, ask  the user to guess the number,
 * tell if correct, if not reveal the right digit of the number, keep revealing
 * digits and ask of the number until they guess it correctly or the number was
 * completely revealed
 * */
public class Ex1 {

    private Scanner scan = new Scanner(System.in);
    private static void print(Object text) {System.out.println(text);}

    private static int ranNum;
    private static int binRanNum;

    public static void main(String[] args) {
        randomNum();
        print(ranNum);
        print(binRanNum);
    }

    // Randomizes numbers
    private static void randomNum() {
        ranNum = ((int) (Math.random() * 16 + 1));
        binRanNum = Integer.valueOf(Integer.toBinaryString(ranNum));
    }

    private static void convertToBinary() {

    }
}
