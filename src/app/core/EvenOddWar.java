package app.core;

import java.util.ArrayList;

/**
 * Create a function that takes an array of integers, sums the even and odd numbers separately,
 * then returns the difference between the sum of the even and odd numbers.
 */
public class EvenOddWar {
    public static void main(String[] args) {

        // Creates an array of integers.
        ArrayList<Integer> allNums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            allNums.add((int) (Math.random() * 10) + 1);
        }

        // Separates the array into two different arrays of evens and odds.
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (Integer num : allNums) {
            if (num % 2 == 0)
                evens.add(num);
            else
                odds.add(num);
        }

        int evensSum = sumUpArr(evens);
        int oddsSum = sumUpArr(odds);

        if (evensSum > oddsSum) {
            System.out.println("It's the evens' territory now!");
            System.out.println("The odds' death-lineup " + odds + " fell down today against a tenacious evens group " + evens);
            System.out.println("Winning them " + evensSum + " to " + oddsSum + " and doing it in fashion.");
            System.out.println("Evens' lead general after the battle: \"Yeah, you are odd.\"");

        } else {
            System.out.println("The odds rule the land!");
            System.out.println("The evens army " + evens + " couldn't hold on against odds' squad " + odds);
            System.out.println("Winning them " + oddsSum + " to " + evensSum + ". Showtime.");
            System.out.println("Odds' supreme emperor after the battle: \"Not so even after all are ya?\"");

        }

    }

    // Sums up arrays
    private static int sumUpArr(ArrayList<Integer> nums) {

        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }
}
