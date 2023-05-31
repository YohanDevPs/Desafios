package desafios.kyu5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved, wouldn't we?
 * Our goal is to create a function that will check that for us!
 *
 * Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty, 1 if it is an "X",
 * or 2 if it is an "O", like so:
 *
 * [[0, 0, 1],
 *  [0, 1, 2],
 *  [2, 1, 0]]
 * We want our function to return:
 *
 * -1 if the board is not yet finished AND no one has won yet (there are empty spots),
 * 1 if "X" won,
 * 2 if "O" won,
 * 0 if it's a cat's game (i.e. a draw).
 * You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.
 */

public class Checker {

    public static int isSolved(int[][] board) {

        if (gainInLine(board) == 1 || gainInLine(board) == 2) {
            return gainInLine(board);
        }

        if (gainInColumn(board) == 1 || gainInColumn(board) == 2) {
            return gainInColumn(board);
        }

        if (gainInDiagonal(board) == 1 || gainInDiagonal(board) == 2) {
            return gainInDiagonal(board);
        }


        return gameIsNotFinish(board) == true ? 0 : -1;
    }

    public static int gainInLine(int[][] board) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                list.add(board[i][j]);
            }
            if (list.equals(Arrays.asList(1, 1, 1))) return 1;
            if (list.equals(Arrays.asList(2, 2, 2))) return 2;
            list.clear();
        }

        return list.contains(0) ? 0 : -1;
    }

    public static int gainInColumn(int[][] board) {
        for (int j = 0; j < board[0].length; j++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                list.add(board[i][j]);
            }
            if (list.equals(Arrays.asList(1, 1, 1))) {
                return 1;
            }
            if (list.equals(Arrays.asList(2, 2, 2))) {
                return 2;
            }
        }
        return 0;
    }

    public static int gainInDiagonal(int[][] board) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == j) {
                    list.add(board[i][j]);
                }
            }
        }

        if (list.equals(Arrays.asList(1, 1, 1))) return 1;
        if (list.equals(Arrays.asList(2, 2, 2))) return 2;

        list.clear();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j == board.length - 1) {
                    list.add(board[i][j]);
                }
            }

            if (list.equals(Arrays.asList(1, 1, 1))) return 1;
            if (list.equals(Arrays.asList(2, 2, 2))) return 2;

        }

        return 0;
    }
    public static boolean gameIsNotFinish(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}