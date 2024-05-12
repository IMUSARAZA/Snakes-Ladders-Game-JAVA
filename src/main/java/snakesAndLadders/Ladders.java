package snakesAndLadders;

public class Ladders {
    int ladderIndex;
    int afterClimbingIndex;

    public Ladders(int ladderIndex, int afterClimbingIndex) {
        this.ladderIndex = ladderIndex-1;
        this.afterClimbingIndex = afterClimbingIndex-1;
    }
}
