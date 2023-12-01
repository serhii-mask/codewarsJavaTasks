package org.example.codewars.kyu7;

public class StringEndsWith {
    public static void main(String[] args) {
        System.out.println("solutionOne(\"samurai\", \"ai\") = " + solutionOne("samurai", "ai"));
        System.out.println("solutionTwo(\"samurai\", \"ai\") = " + solutionTwo("samurai", "ai"));
    }

    private static boolean solutionOne(String str, String ending) {
        if (str.length() < ending.length()) {
            return false;
        }
        return str.substring(str.length() - ending.length()).equals(ending);
    }

    private static boolean solutionTwo(String str, String ending) {
        return str.endsWith(ending);
    }
}
