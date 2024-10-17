/* Programmer: JAAR
 *  Assignment Chapter 5: Question 22
 *  Date modified: 10/15/2024
 *  IDE/Tool used: IntelliJ
 */

// Lets the user play a dice game and tallies up how many times the user wins.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiceGame newGame = new DiceGame(); // TODO: Update to sides args
        intro();
        gameRound(newGame);
        finalScore(newGame);

        // Shows the final tally
        // Congratulates the user if they won this round of games
        // Otherwise tells them better luck next time.
        // Saves the games as a binary file. for each individual game.

    }

    // Introduction blurb for the player and asks them to start the game.
    public static void intro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Get ready to play a dice game.");
        System.out.println("It's you vs me!");
        System.out.println("Let's see who wins!");
        System.out.print("(Press Enter to start): ");
        input.nextLine(); // Assume the user hits enter.
    }

    // Plays the next round in the game and shows the player the winner of
    // the round.
    // Param:
    //  - DiceGame newGame: the game that the individual round belongs to.
    public static void gameRound(DiceGame newGame){
        System.out.println("Ready for round 1!?");
        for (int roundCounter = 0; roundCounter < 10; roundCounter++){
            try { // Pauses for the re-roll
                if ( roundCounter != 0 ) {
                    System.out.printf("Ready for round %d!?", roundCounter + 1);
                    System.out.println();
                }
                System.out.println("Lets roll 'em!");
                Thread.sleep(2500);
                int winner = newGame.nextRound();
                System.out.printf("I rolled a %d You rolled a %d",
                        newGame.getFaceUp(0), newGame.getFaceUp(1));
                System.out.println();
                switch (winner) {
                    case -1:
                        System.out.println("It's a tie.");
                        break;
                    case 0 :
                        System.out.println("I won; Hurray!");
                        break;
                    case 1 :
                        System.out.println("You won; way to go!");
                        break;
                }
                System.out.printf("My Score: %d",
                        newGame.getPlayerScore(0));
                System.out.println();
                System.out.printf("Your Score: %d",
                        newGame.getPlayerScore(1));
                System.out.println();
                System.out.println();
                System.out.println();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Shows the user the final score and gives a short prompt based on
    // whether they won or lost the game.
    public static void finalScore(DiceGame newGame) {
        System.out.println("Final Score: ");
        System.out.println("Player 1: " + newGame.getPlayerScore(0) +
                "\t\t\tPlayer 2: " + newGame.getPlayerScore(1));
        System.out.println();
        if (newGame.getPlayerScore(0) < newGame.getPlayerScore(1)) {
            System.out.println("You won today's Game! I'll get you next time!");
        } else if (newGame.getPlayerScore(0) > newGame.getPlayerScore(1)) {
            System.out.println("I won! You got next game!");
        } else {
            System.out.println("We tied. I really thought I was going to win!");
        }
        // TODO: Save previous games in a binary file.
    }
}