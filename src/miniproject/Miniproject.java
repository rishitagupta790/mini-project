package miniproject;

import java.util.*;

class Guesser {

    int guessNum;

    int guessNum() {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser kindly guess the number between range 10 - 100");
        System.out.println("you have 3 chance");
        while (i < 3) {
            guessNum = scan.nextInt();
            if (guessNum > 9 && guessNum < 101) {
                System.out.println("Great job");
                break;
            } else {
                if (i < 2) {
                    System.out.println("Kindly Guess number between range of 10 - 100" + "  You use  " + (i + 1) + "   chance");
                } else {
                    System.out.println("Restart the game");
                    System.out.println(" ");
                    guessNum();
                    
                }
                i++;
            }
        }

        return guessNum;
    }
}

class Player {

    int guessNum;

    int guessNum(String S1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("   "+S1+"   kindly guess the number Between range of 10 - 100  ");
        guessNum = scan.nextInt();
        if(guessNum>9&&guessNum<101)
        {
            System.out.println("Wait for the result");
        }
        else
        {
            System.out.println("Guess Number  between valid range");
            System.out.println("GUESS AGAIN");
            guessNum(S1);
        }
        return guessNum;
    }
}

class Umpire {

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNum();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessNum("Player 1");
        numFromPlayer2 = p2.guessNum("Player 2");
        numFromPlayer3 = p3.guessNum("Player 3");
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All players won the game");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 & Player2 won");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 & Player3 won");
            } else {
                System.out.println("Player 1 won the game");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 & Player3 won");
            } else {
                System.out.println("Player 2 won the game");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Game lost Try Again!");
        }

    }

}

public class Miniproject {

    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }

}
