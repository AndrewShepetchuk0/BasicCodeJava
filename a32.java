package a3;
import java.util.*;

//Andrew Shepetchuk

public class a32 {
	public static void main(String[] args) {
        int BOARD_SIZE = 10; 
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        int[] queenPositions = new int[BOARD_SIZE];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the columns (0-indexed) for the queens in " + BOARD_SIZE + " rows:");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            int column = input.nextInt();

            // Validate input
            if (column < 0 || column >= BOARD_SIZE) {
                System.out.println("Invalid column. Please enter a number between 0 and " + (BOARD_SIZE - 1));
                i--; // Retry for this row
            }

            queenPositions[i] = column;
            board[i][column] = 1; // Place the queen
        }

        System.out.println("The board with the queens placed:");
        printBoard(board, BOARD_SIZE);

        input.close();
    }

    private static void printBoard(int[][] board, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q "); // Queen
                } else {
                    System.out.print(". "); // Empty cell
                }
            }
            System.out.println();
        }
    }

}
