package app.core;

import static app.Globals.*;

public class IncomeTax {

    public static void main(String[] args) {

        System.out.println("Hello, today we will see how much you need to pay just to exist.");
        System.out.println();
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your annual income: ");
        int income = getPositiveIntegerInput();


    }

    private static double calcTax(int income) {

        if (income <= 23000)
            return (income * 0.1); // 10% tax
        else if (income <= 46000)
            return (income * 0.2); // 20% tax
        else if (income <= 120000)
            return (income * 0.3); // 30% tax
        else if (income <= 220000)
            return  (income * 0.4); // 40% tax
        else
            return (income * 0.5); // 50% tax


    }

}
