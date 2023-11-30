package org.example.codewars.kyu8;

import java.util.Arrays;

/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */

public class SumOfPositive {

    public static void main(String[] args) {
        int[] arr = {1,-4,7,12};

        System.out.println("sumVersionOne(arr) = " + sumVersionOne(arr));
        System.out.println("sumVersionTwo(arr) = " + sumVersionTwo(arr));
    }

    public static int sumVersionOne(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    public static int sumVersionTwo(int[] arr){
        int result = 0;

        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }

        return result;
    }
}
