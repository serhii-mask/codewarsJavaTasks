package org.example.codewars.kyu7;

/*
Determine the total number of digits in the integer (n>=0) given as input to the function. For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits. Be careful to avoid overflows/underflows.

All inputs will be valid.
 */

public class NumberofDecimalDigits {
    public static void main(String[] args) {
        System.out.println("DigitsOne(832763) = " + digitsOne(832763));
        System.out.println("DigitsTwo(832763) = " + digitsTwo(832763));
    }

    private static int digitsOne(long n) {
        return Long.toString(n).length();
    }

    private static int digitsTwo(long n) {
        int l = 1;
        while(n >= 10) {
            n /= 10;
            l += 1;
        }
        return l;
    }

}
