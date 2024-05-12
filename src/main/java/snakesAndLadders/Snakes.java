package snakesAndLadders;

public class Snakes {
    int snakeIndex;
    int afterBitingIndex;

    public Snakes(int snakeIndex, int afterBitingIndex) {
        this.snakeIndex = snakeIndex-1;
        this.afterBitingIndex = afterBitingIndex-1;
    }
}
