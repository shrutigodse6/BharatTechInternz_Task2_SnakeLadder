//By Author Shruti Dilip Godse

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    private static final int WINNING_SCORE = 100;
    private static final int[] snakes = {16, 48, 64, 93};
    private static final int[] ladders = {3, 20, 36, 63};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int player1Score = 0;
        int player2Score = 0;

        System.out.println("Welcome to the Snake and Ladder game!");
        System.out.print("Enter player 1's name: ");
        String player1Name = scanner.nextLine();
        System.out.print("Enter player 2's name: ");
        String player2Name = scanner.nextLine();

        while (player1Score < WINNING_SCORE && player2Score < WINNING_SCORE) {
            System.out.println("\n" + player1Name + "'s turn");
            int diceRoll = random.nextInt(6) + 1;
            System.out.println(player1Name + " rolled a " + diceRoll);
            player1Score = movePlayer(player1Score, diceRoll);
            System.out.println(player1Name + "'s current score: " + player1Score);

            if (player1Score >= WINNING_SCORE) {
                System.out.println(player1Name + " wins!");
                break;
            }

            System.out.println("\n" + player2Name + "'s turn");
            diceRoll = random.nextInt(6) + 1;
            System.out.println(player2Name + " rolled a " + diceRoll);
            player2Score = movePlayer(player2Score, diceRoll);
            System.out.println(player2Name + "'s current score: " + player2Score);

            if (player2Score >= WINNING_SCORE) {
                System.out.println(player2Name + " wins!");
                break;
            }
        }

        scanner.close();
    }

    private static int movePlayer(int currentScore, int diceRoll) {
        int newScore = currentScore + diceRoll;

        if (newScore > WINNING_SCORE) {
            return currentScore;
        }

        for (int snake : snakes) {
            if (newScore == snake) {
                System.out.println("Oops, you got bitten by a snake!");
                newScore = getSnakeHead(snake);
                break;
            }
        }

        for (int ladder : ladders) {
            if (newScore == ladder) {
                System.out.println("Yay, you got a ladder!");
                newScore = getLadderTop(ladder);
                break;
            }
        }

        return newScore;
    }

    private static int getSnakeHead(int snake) {
        switch (snake) {
            case 16:
                return 6;
            case 48:
                return 26;
            case 64:
                return 60;
            case 93:
                return 73;
            default:
                return snake;
        }
    }

    private static int getLadderTop(int ladder) {
        switch (ladder) {
            case 3:
                return 22;
            case 20:
                return 42;
            case 36:
                return 57;
            case 63:
                return 81;
            default:
                return ladder;
        }
    }
}
