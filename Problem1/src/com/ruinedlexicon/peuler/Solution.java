package com.ruinedlexicon.peuler;

public class Solution {

    public static void main(String[] argv) {
        /*
        * Problem can be split up into 3 parts.
        * 1) Sum of numbers divisible by 3
        * 2) Sum of numbers divisibile by 5
        * 3) Subtraction of numbers divisible by 15 (both 3 and 5), do avoid double-counting them.
        */

        int sumDivisibleBy3 = sumDivisibleBy(3, 1000);
        int sumDivisibleBy5 = sumDivisibleBy(5, 1000);
        int sumDivisibleBy15 = sumDivisibleBy(15, 1000);

        int total = sumDivisibleBy3 + sumDivisibleBy5 - sumDivisibleBy15;

        System.out.printf("%d + %d - %d == %d.", sumDivisibleBy3, sumDivisibleBy5, sumDivisibleBy15, total);

    }

    private static int sumDivisibleBy(int divisor, int max) {

        // Simplify the arithmetic and put this problem into the form solvable by Gauss' Law by
        // factoring out the divisor such that:
        // 3 + 6 + 9 + ... + 999 == 3(1 + 3 + 6 + ... + 333)
        int scaledMax = max / divisor;

        // Now, calculate that remaining simplified sum using Gauss' Law:
        // Sum 1 - n == (n(n+1))/2
        int scaledTotal = (scaledMax * (scaledMax + 1)) / 2;

        // Rehydrate the total by multiplying by the divisor we pulled out initially
        int total = divisor * scaledTotal;

        return total;
    }
}
