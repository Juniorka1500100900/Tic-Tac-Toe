package org.Game;

import java.util.Scanner;

public class GameBoard {
    public static void main(String[] args) {

        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        System.out.println("Welcome to Tic-Tac-Toe Game!");
        System.out.println("Please insert a number between 1-9 to indicate where you want to put your X.");
        System.out.println("|" + "1" + "|" + "2" + "|" + "3" + "|");
        System.out.println("|" + "4" + "|" + "5" + "|" + "6" + "|");
        System.out.println("|" + "7" + "|" + "8" + "|" + "9" + "|");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        printBoard(board);
    }

    private static void printBoard(char[][] board) {
        System.out.println("|" + board[0][0] + "|" + (board[0][1] + "|" + (board[0][2] + "|")));
        System.out.println("|" + board[1][0] + "|" + (board[1][1] + "|" + (board[1][2] + "|")));
        System.out.println("|" + board[2][0] + "|" + (board[2][1] + "|" + (board[2][2] + "|")));
    }


}
