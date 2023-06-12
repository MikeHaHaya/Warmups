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
            System.out.println("You are odd indeed!");

        } else {

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
