package org.example.codewars.kyu8;

/*
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"
 */


public class RockPaperScissors {

    public static void main(String[] args) {
        System.out.println("rpsVersionOne(\"scissors\", \"paper\") = " + rpsVersionOne("scissors", "paper"));
        System.out.println("rpsVersionTwo(\"paper\", \"paper\") = " + rpsVersionTwo("paper", "paper"));
    }

    private static String rpsVersionOne(String p1, String p2) {
        if(p1 == p2) {
            return "Draw!";
        }

        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;

        return "Player " + p + " won!";
    }

    private static String rpsVersionTwo(String p1, String p2) {

        if (p1 == p2) {
            return "Draw!";
        }

        else if (p1 == "rock" && p2 == "scissors") {
            return "Player 1 won!";
        }

        else if  ( p1 == "scissors" && p2 == "paper") {
            return "Player 1 won!";
        }

        else if ( p1 == "paper" && p2 == "rock") {
            return "Player 1 won!";
        }

        else {
            return "Player 2 won!";
        }
    }
}
