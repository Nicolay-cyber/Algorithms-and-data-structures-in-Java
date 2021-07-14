package Recursion;

public class Main {
    private static Item[] knapsackItems;

    public static void main(String[] args) {

        // 1. Написать программу по возведению числа в степень с помощью рекурсии.

        System.out.println(exponentiation(5, 9));

        // 2. Написать программу «Задача о рюкзаке» с помощью рекурсии.


        knapsackItems = new Item[]{
                new Item(1, 1),
                new Item(2, 1),
                new Item(4, 5),
                new Item(3, 6),
                new Item(3, 2),
                new Item(4, 3)

        };
        System.out.println(knapsack(knapsackItems.length, 100));
    }

    private static int knapsack(int i, int weighLimit) {
        if (i <= 0) {
            return 0;
        }
        if (weigh(i - 1) > weighLimit) {
            return knapsack(i - 1, weighLimit);
        } else {

            return Math.max(knapsack(i - 1, weighLimit),
                    value(i - 1) + knapsack(i - 1, weighLimit - weigh(i - 1)));
        }
    }


    private static int weigh(int i) {
        return knapsackItems[i].getWeigh();
    }


    private static int value(int i) {
        return knapsackItems[i].getValue();
    }

    private static int exponentiation(int base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        return exponentiation(base, (exponent - 1)) * base;
    }
}
