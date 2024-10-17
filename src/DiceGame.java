// This class is a dice game. It stores information about the game.

public class DiceGame {
    Die[] pair;  // first is player 1 die
    // and the second is player 2 die.
    int[] score = new int[2];; // keeps track of the score board


    // Constructor:

    DiceGame() { // default at six sided die
        pair = new Die[]{ new Die(), new Die() };
    }

    DiceGame(int size){
        pair = new Die[]{ new Die(size), new Die(size) };
    }

    // Play the next game - Will reroll and will then return the
    public void nextRound() {
        // Rolls both dice

        // Checks which of the

        // Updates the score



    }


    // Update the score

    // Getters:

    // Gets the current score for one of the players in the game.
    // Param:
    //  - int player: The player whose score we want to get.
    // Random:
    //  - int score: The score for the player requested.
    public int getPlayerScore(int player) {
        return score[player];
    }
}
