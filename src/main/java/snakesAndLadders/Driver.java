package snakesAndLadders;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Driver {
    static ArrayList<Block> board = new ArrayList<>();

    // index on which there is snake, how many indexes to go down
    static Snakes snake1 = new Snakes(32, 10);
    static Snakes snake2 = new Snakes(36, 6);
    static Snakes snake3 = new Snakes(62, 18);
    static Snakes snake4 = new Snakes(88, 24);
    static Snakes snake5 = new Snakes(95, 56);
    static Snakes snake6 = new Snakes(97, 78);

    // index on which there is ladder, index after climbing ladder
    static Ladders ladder1 = new Ladders(1, 38);
    static Ladders ladder2 = new Ladders(4, 15);
    static Ladders ladder3 = new Ladders(8, 30);
    static Ladders ladder4 = new Ladders(21, 42);
    static Ladders ladder5 = new Ladders(28, 78);
    static Ladders ladder6 = new Ladders(50, 67);
    static Ladders ladder7 = new Ladders(71, 92);
    static Ladders ladder8 = new Ladders(88, 99);


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        fillBoard(); // fills the boards with no snakes and ladders
        upgradingIndexesForLadders(); // fills the ladders
        upgradingIndexesForSnakes(); // fills the snakes
        displayBoard2();


        int player1 = 0;
        int enter = 0;

        while(player1 != 100){
            System.out.println("Press 1 to take next turn");
            enter = sc.nextInt();
            play();
        }


    }

    public static void fillBoard(){
        for(int i = 1; i < 101; i++){
            board.add(i-1, new Block(i, " ", false, false, ' '));
        }
    }
    public static void displayBoard(){
        for(int i = 0; i < 100; i++){
            if(i % 10 == 0) {
                System.out.println();
            }

            else if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10){
                System.out.printf("    " + board.get(i).toString());
                continue;
            }

            System.out.printf("   " + board.get(i).toString());
        }
        System.out.println();
        System.out.println("*******************************************************");
    }
    public static void displayBoard2(){
        for(int i = 0; i < 100; i++){
            if(i % 10 == 0) {
                System.out.println();
            }

            else if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10){
                System.out.printf("         " + board.get(i).toString2());
                continue;
            }

            System.out.printf("        " + board.get(i).toString2());
        }
        System.out.println();
        System.out.println("*******************************************************");
    }

    public static void upgradingIndexesForLadders(){
        for (int i = 0; i < board.size(); i++) {
            if(ladder1.ladderIndex == i || ladder2.ladderIndex == i || ladder3.ladderIndex == i ||
                    ladder4.ladderIndex == i || ladder5.ladderIndex == i || ladder6.ladderIndex == i
                    || ladder7.ladderIndex == i || ladder8.ladderIndex == i){
                board.get(i).isLadder = true;
                board.get(i).ladderOrSnake = '#';
            }
        }
    }

    public static void upgradingIndexesForSnakes(){
        for (int i = 0; i < board.size(); i++) {
            if(snake1.snakeIndex == i || snake2.snakeIndex  == i || snake3.snakeIndex  == i ||
                    snake4.snakeIndex  == i || snake5.snakeIndex  == i || snake6.snakeIndex  == i){
                board.get(i).isSnake = true;
                board.get(i).ladderOrSnake = 'S';
            }
        }
    }

    public static int rollDice(){
        Random random = new Random();
        int number;
        number = random.nextInt(1,6);
        return number;
    }
    static int player1;
    static int count = 0;
    static  int count2 = 0;

    public static void play() {
        int dice = 0;
        dice = rollDice();

        System.out.println();
        System.out.printf("\t" + "Your number is: " + dice);
        System.out.println();

        while (dice + player1 > 100) {
            dice = 0;
            dice = rollDice();
        }

        if (count == 0)
            player1 = player1 + dice - 1;
        else
            player1 = player1 + dice;

        try {

            if (board.get(player1).isSnake) {
                count2++;
                if (snake1.snakeIndex == player1) {
                    player1 = player1 - (snake1.snakeIndex - snake1.afterBitingIndex);
                    System.out.println();
                    System.out.println("Oh no! You got bit by a snake! You are going down to: " + ++snake1.afterBitingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (snake2.snakeIndex == player1) {
                    player1 = player1 - (snake2.snakeIndex - snake2.afterBitingIndex);
                    System.out.println();
                    System.out.println("Oh no! You got bit by a snake! You are going down to: " + ++snake2.afterBitingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (snake3.snakeIndex == player1) {
                    player1 = player1 - (snake3.snakeIndex - snake3.afterBitingIndex);
                    System.out.println();
                    System.out.println("Oh no! You got bit by a snake! You are going down to: " + ++snake3.afterBitingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (snake4.snakeIndex == player1) {
                    player1 = player1 - (snake4.snakeIndex - snake4.afterBitingIndex);
                    System.out.println();
                    System.out.println("Oh no! You got bit by a snake! You are going down to: " + ++snake4.afterBitingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (snake5.snakeIndex == player1) {
                    player1 = player1 - (snake5.snakeIndex - snake5.afterBitingIndex);
                    System.out.println();
                    System.out.println("Oh no! You got bit by a snake! You are going down to: " + ++snake5.afterBitingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (snake6.snakeIndex == player1) {
                    player1 = player1 - (snake6.snakeIndex - snake6.afterBitingIndex);
                    System.out.println();
                    System.out.println("Oh no! You got bit by a snake! You are going down to: " + ++snake6.afterBitingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                }
            } else if (board.get(player1).isLadder) {
                count2++;
                if (ladder1.ladderIndex == player1) {
                    player1 = player1 + ladder1.afterClimbingIndex - ladder1.ladderIndex;
                    System.out.println();
                    System.out.println("Yay! You got a ladder! You are going up to: " + ++ladder1.afterClimbingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (ladder2.ladderIndex == player1) {
                    player1 = player1 + ladder2.afterClimbingIndex - ladder2.ladderIndex;
                    System.out.println();
                    System.out.println("Yay! You got a ladder! You are going up to: " + ++ladder2.afterClimbingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (ladder3.ladderIndex == player1) {
                    player1 = player1 + ladder3.afterClimbingIndex - ladder3.ladderIndex;
                    System.out.println();
                    System.out.println("Yay! You got a ladder! You are going up to: " + ++ladder3.afterClimbingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (ladder4.ladderIndex == player1) {
                    player1 = player1 + ladder4.afterClimbingIndex - ladder4.ladderIndex;
                    System.out.println();
                    System.out.println("Yay! You got a ladder! You are going up to: " + ++ladder4.afterClimbingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (ladder5.ladderIndex == player1) {
                    player1 = player1 + ladder5.afterClimbingIndex - ladder5.ladderIndex;
                    System.out.println();
                    System.out.println("Yay! You got a ladder! You are going up to: " + ++ladder5.afterClimbingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (ladder6.ladderIndex == player1) {
                    player1 = player1 + ladder6.afterClimbingIndex - ladder6.ladderIndex;
                    System.out.println();
                    System.out.println("Yay! You got a ladder! You are going up to: " + ++ladder6.afterClimbingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (ladder7.ladderIndex == player1) {
                    player1 = player1 + ladder7.afterClimbingIndex - ladder7.ladderIndex;
                    System.out.println();
                    System.out.println("Yay! You got a ladder! You are going up to: " + ++ladder7.afterClimbingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                } else if (ladder8.ladderIndex == player1) {
                    player1 = player1 + ladder8.afterClimbingIndex - ladder8.ladderIndex;
                    System.out.println();
                    System.out.println("Yay! You got a ladder! You are going up to: " + ++ladder8.afterClimbingIndex);
                    board.get(player1).star = "*";
                    displayBoard2();
                    board.get(player1).star = "";
                }
            }

            else {
                System.out.println();
                System.out.println("Your number is: " + dice);
                board.get(player1).star = "*";
                displayBoard2();
                board.get(player1).star = "";
            }
            count++; // for the first rolling

        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("YOU WON");
        }


    }

}