package snakesAndLadders;

import java.util.ArrayList;

public class Block {
    int index;
    String star;
    Boolean isSnake;
    Boolean isLadder;
    char ladderOrSnake;


    public Block(int index, String star, Boolean isSnake, Boolean isLadder, char ladderOrSnake) {
        this.index = index;
        this.star = star;
        this.isSnake = isSnake;
        this.isLadder = isLadder;
        this.ladderOrSnake = ladderOrSnake;
    }


    @Override
    public String toString() {
        return "Block{" +
                "index=" + index +
                ", star='" + star + '\'' +
                ", isSnake=" + isSnake +
                ", isLadder=" + isLadder +
                ", ladderOrSnake=" + ladderOrSnake +
                '}';
    }

    public String toString2() {
        return
                index +
                "" + star + "" + ladderOrSnake;
    }


}
