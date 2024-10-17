/* Programmer: JAAR
 *  Assignment Chapter 5: Question 22
 *  Date modified: 10/15/2024
 *  IDE/Tool used: IntelliJ
 */

// Lets the user play a dice game and tallies up how many times the user wins.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DiceGame newGame = new DiceGame(); // TODO: Update to sides args
        intro();
        playGame(newGame);

        // Shows the final tally
        // Congratulates the user if they won this round of games
        // Otherwise tells them better luck next time.
        // Saves the games as a binary file. for each individual game.

    }

    // Introduction blurb for the player.
    public static void intro(){
        System.out.println("Get ready to play a dice game.");
        System.out.println("It's you vs me!");
        System.out.println("Let's see who wins!");
    }

    public static void playGame(DiceGame newGame){
        System.out.println("Ready for round 1!?");
        for (int roundCounter = 0; roundCounter < 10; roundCounter++){
            try { // Pauses for the reroll
                System.out.println("Lets roll 'em!");
                Thread.sleep(2500);
                // TODO: Add what each player rolled
                switch (newGame.nextRound()) {
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
                // TODO: Print the scoreboard.

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}