package org.example.codewars.kyu6;

/*
Digital root is the recursive sum of all the digits in a number.

    Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

    Examples
    16  -->  1 + 6 = 7
    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
    493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

 */

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("sumOfDigitsOne(4526) = " + sumOfDigitsOne(4526));
        System.out.println("sumOfDigitsTwo(4526) = " + sumOfDigitsTwo(4526));
        System.out.println("sumOfDigitsThree(4526) = " + sumOfDigitsThree(4526));
    }

    // My solution
    private static int sumOfDigitsOne(int n) {
        int result = n;
        boolean isValid = false;

        while (!isValid) {
            int tripNumber = 0;
            String trip = String.valueOf(result);
            String[] list = trip.split("");

            for (int i = 0; i < list.length; i++) {
                tripNumber += Integer.parseInt(list[i]);
            }

            result = tripNumber;
            isValid = (String.valueOf(tripNumber).length() == 1);
        }

        return result;
    }

    // Best solutions
    private static int sumOfDigitsTwo(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }

    public static int sumOfDigitsThree(int n) {
        while(n > 9){
            n = n/10 + n % 10;
        }
        return(n);
    }
}
