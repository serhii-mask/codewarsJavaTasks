package org.example.codewars.kyu8;

/*
Complete the solution so that it reverses the string passed into it.

        'world'  =>  'dlrow'
        'word'   =>  'drow'
*/
public class ReversedStrings {

    public static void main(String[] args) {
        System.out.println("solutionVersionOne(\"world\") = " + solutionVersionOne("world"));
        System.out.println("solutionVersionTwo(\"world\") = " + solutionVersionTwo("world"));
    }

    public static String solutionVersionOne(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String solutionVersionTwo(String str) {
        String newStr="";

        for(int i = str.length()-1; i >= 0; i--){
            newStr += str.charAt(i);
        }

        return newStr;
    }

    private ReversedStrings() {
        throw new IllegalStateException("Utility class");
    }
}
