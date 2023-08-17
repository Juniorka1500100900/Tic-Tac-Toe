package org.Game;


public class GameLogic {
    public static boolean isGameFinished(char[][] board, int consecutiveToWin) {

        if (hasContestantWon(board, 'X', consecutiveToWin)) {
            System.out.println("Player wins!");
            return true;
        }
        if (hasContestantWon(board, 'O', consecutiveToWin)) {
            System.out.println("Computer wins!");
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        System.out.println("The game ended in a tie!");
        return true;
    }

    public static boolean hasContestantWon(char[][] board, char symbol, int consecutiveToWin) {

        int boardSize = board.length;

        // Check rows
        for (int i = 0; i < boardSize; i++) {
            int count = 0;
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == symbol) {
                    count++;
                    if (count == consecutiveToWin) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // Check columns
        for (int j = 0; j < boardSize; j++) {
            int count = 0;
            for (int i = 0; i < boardSize; i++) {
                if (board[i][j] == symbol) {
                    count++;
                    if (count == consecutiveToWin) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // Check diagonals
        for (int i = 0; i <= boardSize - consecutiveToWin; i++) {
            for (int j = 0; j <= boardSize - consecutiveToWin; j++) {
                boolean diagonalWin = true;
                boolean antiDiagonalWin = true;
                for (int k = 0; k < consecutiveToWin; k++) {
                    if (board[i + k][j + k] != symbol) {
                        diagonalWin = false;
                    }
                    if (board[i + k][j + consecutiveToWin - k - 1] != symbol) {
                        antiDiagonalWin = false;
                    }
                }
                if (diagonalWin || antiDiagonalWin) {
                    return true;
                }
            }
        }
        return false;
    }
}