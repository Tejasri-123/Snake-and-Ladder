import java.util.*;
import java.util.Random;

class Dice {
    public static int getDice() {
        return new Random().nextInt(6) + 1;

    }
}