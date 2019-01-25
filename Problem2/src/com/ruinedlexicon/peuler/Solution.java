package com.ruinedlexicon.peuler;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        
        long a = 1;
        long b = 1;
        long c = a + b; // Prime the pump
        long sum = 0;

        // Every 3rd number in the Fibonacci sequence is even.  
        // Therefore we need not waste time checking to see if each number is even.
        while (c < 4000000) {
            sum += c;
            a = b + c;
            b = a + c;
            c = a + b;
        }

        System.out.printf("The sum of the even Fibonacci numbers less than 4 Million is %d.", sum);
    }
}