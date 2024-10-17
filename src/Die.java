// This class is a die. It contains information for the die including the
// number of sides the die has.

import java.util.Random;

public class Die {
    private int sides; // The number of sides the die has.
    protected  int faceUp; // The current side that's face up.

    private static Random roll;

    // Constructors:

    Die() { // default constructor creates a die with six sides.
        sides = 6;
        roll = new Random();
        faceUp = reRoll();
    }

    Die(int sides) {
        this.sides = sides;
        roll = new Random();
        faceUp = reRoll();
    }

    // Getter:
    public int getFaceUp() {
        return faceUp;
    }

    // Rolls the die and identifies the number it lands on.
    // Returns:
    //  - int faceUp: Represents the face up side of the die.
    public int reRoll() {
        return roll.nextInt(sides) + 1;
    }
}
