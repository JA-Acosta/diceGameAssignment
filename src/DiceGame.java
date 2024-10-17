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

    // Plays the next round by re-rolling each die then updates the
    // scoreboard. Also Identifies the winter of the round
    // Return:
    //  - int winner: denotes the player that won this round. If neither
    //  player won will return a -1
    public int nextRound() {
        int winner = -1; // Sentinel represents tie.
        // Rolls both dice
        if (pair[0].reRoll() <  pair[1].reRoll()) {
            score[1]++;
            winner = 1;
        } else if (pair[0].getFaceUp() >  pair[1].getFaceUp()) {
            score[0]++;
            winner = 0;
        } // ignores ties.
        return winner;
    }

    // Getters:

    // Checks what way the players die is facing.
    // Param:
    //  - int player: player whose die we want to check.
    // Return:
    //  - int faceOfDie: the face the die landed on.
    public int getFaceUp(int player) {
        return pair[player].faceUp;
    }

    // Gets the scoreboard for both players.
    // Return:
    //  - int[] score: The scoreboard with both players information.
    public int[] getPlayerScore() {
        return score;
    }

    // Gets the current score for one of the players in the game.
    // Param:
    //  - int player: The player whose score we want to get.
    // Random:
    //  - int score: The score for the player requested.
    public int getPlayerScore(int player) {
        return score[player];
    }
}
