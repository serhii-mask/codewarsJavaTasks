package org.example.kyu8;

/*
Complete the solution so that it reverses the string passed into it.

        'world'  =>  'dlrow'
        'word'   =>  'drow'
*/
public class ReversedStrings {
    public static String solution(String str) {

        // -----------------------
        return new StringBuilder(str).reverse().toString();



        // -----------------------
//        String newStr="";
//
//        for(int i = str.length()-1; i >= 0; i--){
//            newStr += str.charAt(i);
//        }
//
//        return newStr;
    }


    private ReversedStrings() {
        throw new IllegalStateException("Utility class");
    }
}
