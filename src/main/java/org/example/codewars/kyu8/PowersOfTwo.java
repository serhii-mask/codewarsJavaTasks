package org.example.codewars.kyu8;

import java.util.Arrays;

import static java.util.stream.IntStream.rangeClosed;

/*
Complete the function that takes a non-negative integer n as input, and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ).

Examples
n = 0  ==> [1]        # [2^0]
n = 1  ==> [1, 2]     # [2^0, 2^1]
n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
 */

public class PowersOfTwo {

    public static void main(String[] args) {
        System.out.println("powersOfTwoVersionOne(5) = " + Arrays.toString(powersOfTwoVersionOne(5)));
        System.out.println("powersOfTwoVersionTwo(5) = " + Arrays.toString(powersOfTwoVersionTwo(5)));
        System.out.println("powersOfTwoVersionThree(5) = " + Arrays.toString(powersOfTwoVersionThree(5)));
    }

    static long[] powersOfTwoVersionOne(int n) {
        return rangeClosed(0, n).mapToLong(i -> (long) Math.pow(2, i)).toArray();
    }

    public static long[] powersOfTwoVersionTwo(int n){
        long[] arr = new long[n + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.pow(2, i));
        }

        return arr;
    }

    public static long[] powersOfTwoVersionThree(int n) {
        long[] ret = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            ret[i] = 1L << i;
        }

        return ret;
    }
}
