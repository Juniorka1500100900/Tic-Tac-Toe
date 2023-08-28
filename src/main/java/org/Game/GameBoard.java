package org.Game;

import java.util.Random;
import java.util.Scanner;


public class GameBoard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String gameType;
        int consecutiveToWin;

        char[][] board = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        System.out.println("Welcome to Tic-Tac-Toe Game!");

        while(true) {
            System.out.println("Please insert S for a standard 3x3 game or E for enhanced game 5x5.");
            gameType = scanner.nextLine();

            if (gameType.equalsIgnoreCase("S")) {
                System.out.println("Perfect! You will be playing 3x3 game!");
                consecutiveToWin = 3;
                break;
            } else if (gameType.equalsIgnoreCase("E")) {
                System.out.println("Perfect! You will be playing 5x5 game!");
               consecutiveToWin = 5;
                break;
            } else {
                System.out.println("Invalid input. Please enter 'S' or 'E'.");
            }
        }

        System.out.println("During the game you will be choosing a number between 1-100 to indicate where you want to put your X.");
        System.out.println("If you chose 3x3 game, you need to put 3 Xs next to each other in a row, column or diagonally.");
        System.out.println("If you chose 5x5 game, you need to put 5 Xs next to each other accordingly.");
        System.out.println("|" + "1" + "|" + "2" + "|" + "3" + "|" + "4" + "|" + "5" + "|" + "6" + "|" + "7" + "|" + "8" + "|" + "9" + "|" + "10" + "|");
        System.out.println("|" + "11" + "|" + "12" + "|" + "23" + "|" + "14" + "|" + "15" + "|" + "16" + "|" + "17" + "|" + "18" + "|" + "19" + "|" + "20" + "|");
        System.out.println("|" + "21" + "|" + "22" + "|" + "23" + "|" + "24" + "|" + "25" + "|" + "26" + "|" + "27" + "|" + "28" + "|" + "29" + "|" + "30" + "|");
        System.out.println("|" + "31" + "|" + "32" + "|" + "33" + "|" + "34" + "|" + "35" + "|" + "36" + "|" + "37" + "|" + "38" + "|" + "39" + "|" + "40" + "|");
        System.out.println("|" + "41" + "|" + "42" + "|" + "43" + "|" + "44" + "|" + "45" + "|" + "46" + "|" + "47" + "|" + "48" + "|" + "49" + "|" + "50" + "|");
        System.out.println("|" + "51" + "|" + "52" + "|" + "53" + "|" + "54" + "|" + "55" + "|" + "56" + "|" + "57" + "|" + "58" + "|" + "59" + "|" + "60" + "|");
        System.out.println("|" + "61" + "|" + "62" + "|" + "63" + "|" + "64" + "|" + "65" + "|" + "66" + "|" + "67" + "|" + "68" + "|" + "69" + "|" + "70" + "|");
        System.out.println("|" + "71" + "|" + "72" + "|" + "73" + "|" + "74" + "|" + "75" + "|" + "76" + "|" + "77" + "|" + "78" + "|" + "79" + "|" + "80" + "|");
        System.out.println("|" + "81" + "|" + "82" + "|" + "83" + "|" + "84" + "|" + "85" + "|" + "86" + "|" + "87" + "|" + "88" + "|" + "89" + "|" + "90" + "|");
        System.out.println("|" + "91" + "|" + "92" + "|" + "93" + "|" + "94" + "|" + "95" + "|" + "96" + "|" + "97" + "|" + "98" + "|" + "99" + "|" + "100" + "|");
        while (true) {
            playerTurn(board, scanner);
            printBoard(board);
            if (GameLogic.isGameFinished(board,consecutiveToWin)){
                break;
            }

            computerTurn(board);
            printBoard(board);
            if (GameLogic.isGameFinished(board, consecutiveToWin)){
                break;
            }
        }
        scanner.close();
    }


    private static void computerTurn(char[][] board) {
        Random rand = new Random();
        int computerMove;
        while (true) {
            computerMove = rand.nextInt(99) + 1;
            if (isValidMove(board, Integer.toString(computerMove))) {
                break;
            }
        }
        System.out.println("Computer chose " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }


    public static boolean isValidMove(char[][] board, String position) {
        int num = Integer.parseInt(position) - 1;
        int row = num / board.length;
        int col = num % board.length;

        if (num >= 0 && num < board.length * board[0].length && board[row][col] == ' ') {
            return true;
        }

        return false;
    }


    public static void playerTurn(char[][] board, Scanner scanner) {
        String userInput;
        while (true) {
            System.out.println("Where would you like to play? (1-100)");
            userInput = scanner.nextLine();
            if (isValidMove(board, userInput)){
                break;
            } else {
                System.out.println(userInput + " is not a valid move.");
            }
        }
        placeMove(board, userInput, 'X');
    }


    private static void placeMove(char[][] board, String position, char symbol) {
        int num = Integer.parseInt(position) - 1;
        int row = num / board.length;
        int col = num % board.length;

        if (num >= 0 && num < board.length * board[0].length && board[row][col] == ' ') {
            board[row][col] = symbol;
        } else {
            System.out.println(":(");
        }
    }



    private static void printBoard(char[][] board) {
        System.out.println("|" + board[0][0] + "|" +  board[0][1] + "|" +  board[0][2] + "|" + board[0][3] + "|"+ board[0][4] + "|" +  board[0][5] + "|" +  board[0][6] + "|" + board[0][7] + "|"+ board[0][8] + "|" +  board[0][9] + "|");
        System.out.println("|" + board[1][0] + "|" +  board[1][1] + "|" +  board[1][2] + "|" + board[1][3] + "|"+ board[1][4] + "|" +  board[1][5] + "|" +  board[1][6] + "|" + board[1][7] + "|"+ board[1][8] + "|" +  board[1][9] + "|");
        System.out.println("|" + board[2][0] + "|" +  board[2][1] + "|" +  board[2][2] + "|" + board[2][3] + "|"+ board[2][4] + "|" +  board[2][5] + "|" +  board[2][6] + "|" + board[2][7] + "|"+ board[2][8] + "|" +  board[2][9] + "|");
        System.out.println("|" + board[3][0] + "|" +  board[3][1] + "|" +  board[3][2] + "|" + board[3][3] + "|"+ board[3][4] + "|" +  board[3][5] + "|" +  board[3][6] + "|" + board[3][7] + "|"+ board[3][8] + "|" +  board[3][9] + "|");
        System.out.println("|" + board[4][0] + "|" +  board[4][1] + "|" +  board[4][2] + "|" + board[4][3] + "|"+ board[4][4] + "|" +  board[4][5] + "|" +  board[4][6] + "|" + board[4][7] + "|"+ board[4][8] + "|" +  board[4][9] + "|");
        System.out.println("|" + board[5][0] + "|" +  board[5][1] + "|" +  board[5][2] + "|" + board[5][3] + "|"+ board[5][4] + "|" +  board[5][5] + "|" +  board[5][6] + "|" + board[5][7] + "|"+ board[5][8] + "|" +  board[5][9] + "|");
        System.out.println("|" + board[6][0] + "|" +  board[6][1] + "|" +  board[6][2] + "|" + board[6][3] + "|"+ board[6][4] + "|" +  board[6][5] + "|" +  board[6][6] + "|" + board[6][7] + "|"+ board[6][8] + "|" +  board[6][9] + "|");
        System.out.println("|" + board[7][0] + "|" +  board[7][1] + "|" +  board[7][2] + "|" + board[7][3] + "|"+ board[7][4] + "|" +  board[7][5] + "|" +  board[7][6] + "|" + board[7][7] + "|"+ board[7][8] + "|" +  board[7][9] + "|");
        System.out.println("|" + board[8][0] + "|" +  board[8][1] + "|" +  board[8][2] + "|" + board[8][3] + "|"+ board[8][4] + "|" +  board[8][5] + "|" +  board[8][6] + "|" + board[8][7] + "|"+ board[8][8] + "|" +  board[8][9] + "|");
        System.out.println("|" + board[9][0] + "|" +  board[9][1] + "|" +  board[9][2] + "|" + board[9][3] + "|"+ board[9][4] + "|" +  board[9][5] + "|" +  board[9][6] + "|" + board[9][7] + "|"+ board[9][8] + "|" +  board[9][9] + "|");
    }
}

