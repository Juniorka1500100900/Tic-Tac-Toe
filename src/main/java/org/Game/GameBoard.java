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


    public static boolean isValidMove (char[][] board, String position) {
        switch(position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
               return (board[0][3] == ' ');
            case "5":
                return (board[0][4] == ' ');
            case "6":
                return (board[0][5] == ' ');
            case "7":
                return (board[0][6] == ' ');
            case "8":
                return (board[0][7] == ' ');
            case "9":
                return (board[0][8] == ' ');
            case "10":
                return (board[0][9] == ' ');
            case "11":
                return (board[1][0] == ' ');
            case "12":
                return (board[1][1] == ' ');
            case "13":
                return (board[1][2] == ' ');
            case "14":
                return (board[1][3] == ' ');
            case "15":
                return (board[1][4] == ' ');
            case "16":
                return (board[1][5] == ' ');
            case "17":
                return (board[1][6] == ' ');
            case "18":
                return (board[1][7] == ' ');
            case "19":
                return (board[1][8] == ' ');
            case "20":
                return (board[1][9] == ' ');
            case "21":
                return (board[2][0] == ' ');
            case "22":
                return (board[2][1] == ' ');
            case "23":
                return (board[2][2] == ' ');
            case "24":
                return (board[2][3] == ' ');
            case "25":
                return (board[2][4] == ' ');
            case "26":
                return (board[2][5] == ' ');
            case "27":
                return (board[2][6] == ' ');
            case "28":
                return (board[2][7] == ' ');
            case "29":
                return (board[2][8] == ' ');
            case "30":
                return (board[2][9] == ' ');
            case "31":
                return (board[3][0] == ' ');
            case "32":
                return (board[3][1] == ' ');
            case "33":
                return (board[3][2] == ' ');
            case "34":
                return (board[3][3] == ' ');
            case "35":
                return (board[3][4] == ' ');
            case "36":
                return (board[3][5] == ' ');
            case "37":
                return (board[3][6] == ' ');
            case "38":
                return (board[3][7] == ' ');
            case "39":
                return (board[3][8] == ' ');
            case "40":
                return (board[3][9] == ' ');
            case "41":
                return (board[4][0] == ' ');
            case "42":
                return (board[4][1] == ' ');
            case "43":
                return (board[4][2] == ' ');
            case "44":
                return (board[4][3] == ' ');
            case "45":
                return (board[4][4] == ' ');
            case "46":
                return (board[4][5] == ' ');
            case "47":
                return (board[4][6] == ' ');
            case "48":
                return (board[4][7] == ' ');
            case "49":
                return (board[4][8] == ' ');
            case "50":
                return (board[4][9] == ' ');
            case "51":
                return (board[5][0] == ' ');
            case "52":
                return (board[5][1] == ' ');
            case "53":
                return (board[5][2] == ' ');
            case "54":
                return (board[5][3] == ' ');
            case "55":
                return (board[5][4] == ' ');
            case "56":
                return (board[5][5] == ' ');
            case "57":
                return (board[5][6] == ' ');
            case "58":
                return (board[5][7] == ' ');
            case "59":
                return (board[5][8] == ' ');
            case "60":
                return (board[5][9] == ' ');
            case "61":
                return (board[6][0] == ' ');
            case "62":
                return (board[6][1] == ' ');
            case "63":
                return (board[6][2] == ' ');
            case "64":
                return (board[6][3] == ' ');
            case "65":
                return (board[6][4] == ' ');
            case "66":
                return (board[6][5] == ' ');
            case "67":
                return (board[6][6] == ' ');
            case "68":
                return (board[6][7] == ' ');
            case "69":
                return (board[6][8] == ' ');
            case "70":
                return (board[6][9] == ' ');
            case "71":
                return (board[7][0] == ' ');
            case "72":
                return (board[7][1] == ' ');
            case "73":
                return (board[7][2] == ' ');
            case "74":
                return (board[7][3] == ' ');
            case "75":
                return (board[7][4] == ' ');
            case "76":
                return (board[7][5] == ' ');
            case "77":
                return (board[7][6] == ' ');
            case "78":
                return (board[7][7] == ' ');
            case "79":
                return (board[7][8] == ' ');
            case "80":
                return (board[7][9] == ' ');
            case "81":
                return (board[8][0] == ' ');
            case "82":
                return (board[8][1] == ' ');
            case "83":
                return (board[8][2] == ' ');
            case "84":
                return (board[8][3] == ' ');
            case "85":
                return (board[8][4] == ' ');
            case "86":
                return (board[8][5] == ' ');
            case "87":
                return (board[8][6] == ' ');
            case "88":
                return (board[8][7] == ' ');
            case "89":
                return (board[8][8] == ' ');
            case "90":
                return (board[8][9] == ' ');
            case "91":
                return (board[9][0] == ' ');
            case "92":
                return (board[9][1] == ' ');
            case "93":
                return (board[9][2] == ' ');
            case "94":
                return (board[9][3] == ' ');
            case "95":
                return (board[9][4] == ' ');
            case "96":
                return (board[9][5] == ' ');
            case "97":
                return (board[9][6] == ' ');
            case "98":
                return (board[9][7] == ' ');
            case "99":
                return (board[9][8] == ' ');
            case "100":
                return (board[9][9] == ' ');

            default:
                return false;
        }
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
        switch(position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[0][3] = symbol;
                break;
            case "5":
                board[0][4] = symbol;
                break;
            case "6":
                board[0][5] = symbol;
                break;
            case "7":
                board[0][6] = symbol;
                break;
            case "8":
                board[0][7] = symbol;
                break;
            case "9":
                board[0][8] = symbol;
                break;
            case "10":
                board[0][9] = symbol;
                break;
            case "11":
                board[1][0] = symbol;
                break;
            case "12":
                board[1][1] = symbol;
                break;
            case "13":
                board[1][2] = symbol;
                break;
            case "14":
                board[1][3] = symbol;
                break;
            case "15":
                board[1][4] = symbol;
                break;
            case "16":
                board[1][5] = symbol;
                break;
            case "17":
                board[1][6] = symbol;
                break;
            case "18":
                board[1][7] = symbol;
                break;
            case "19":
                board[1][8] = symbol;
            case "20":
                board[1][9] = symbol;
                break;
            case "21":
                board[2][0] = symbol;
                break;
            case "22":
                board[2][1] = symbol;
                break;
            case "23":
                board[2][2] = symbol;
                break;
            case "24":
                board[2][3] = symbol;
                break;
            case "25":
                board[2][4] = symbol;
                break;
            case "26":
                board[2][5] = symbol;
                break;
            case "27":
                board[2][6] = symbol;
                break;
            case "28":
                board[2][7] = symbol;
                break;
            case "29":
                board[2][8] = symbol;
                break;
            case "30":
                board[2][9] = symbol;
                break;
            case "31":
                board[3][0] = symbol;
                break;
            case "32":
                board[3][1] = symbol;
                break;
            case "33":
                board[3][2] = symbol;
                break;
            case "34":
                board[3][3] = symbol;
                break;
            case "35":
                board[3][4] = symbol;
                break;
            case "36":
                board[3][5] = symbol;
                break;
            case "37":
                board[3][6] = symbol;
                break;
            case "38":
                board[3][7] = symbol;
                break;
            case "39":
                board[3][8] = symbol;
                break;
            case "40":
                board[3][9] = symbol;
                break;
            case "41":
                board[4][0] = symbol;
                break;
            case "42":
                board[4][1] = symbol;
                break;
            case "43":
                board[4][2] = symbol;
                break;
            case "44":
                board[4][3] = symbol;
                break;
            case "45":
                board[4][4] = symbol;
                break;
            case "46":
                board[4][5] = symbol;
                break;
            case "47":
                board[4][6] = symbol;
                break;
            case "48":
                board[4][7] = symbol;
                break;
            case "49":
                board[4][8] = symbol;
                break;
            case "50":
                board[4][9] = symbol;
                break;
            case "51":
                board[5][0] = symbol;
                break;
            case "52":
                board[5][1] = symbol;
                break;
            case "53":
                board[5][2] = symbol;
                break;
            case "54":
                board[5][3] = symbol;
                break;
            case "55":
                board[5][4] = symbol;
                break;
            case "56":
                board[5][5] = symbol;
                break;
            case "57":
                board[5][6] = symbol;
                break;
            case "58":
                board[5][7] = symbol;
                break;
            case "59":
                board[5][8] = symbol;
                break;
            case "60":
                board[5][9] = symbol;
                break;
            case "61":
                board[6][0] = symbol;
                break;
            case "62":
                board[6][1] = symbol;
                break;
            case "63":
                board[6][2] = symbol;
                break;
            case "64":
                board[6][3] = symbol;
                break;
            case "65":
                board[6][4] = symbol;
                break;
            case "66":
                board[6][5] = symbol;
                break;
            case "67":
                board[6][6] = symbol;
                break;
            case "68":
                board[6][7] = symbol;
                break;
            case "69":
                board[6][8] = symbol;
                break;
            case "70":
                board[6][9] = symbol;
                break;
            case "71":
                board[7][0] = symbol;
                break;
            case "72":
                board[7][1] = symbol;
                break;
            case "73":
                board[7][2] = symbol;
                break;
            case "74":
                board[7][3] = symbol;
                break;
            case "75":
                board[7][4] = symbol;
                break;
            case "76":
                board[7][5] = symbol;
                break;
            case "77":
                board[7][6] = symbol;
                break;
            case "78":
                board[7][7] = symbol;
                break;
            case "79":
                board[7][8] = symbol;
                break;
            case "80":
                board[7][9] = symbol;
                break;
            case "81":
                board[8][0] = symbol;
                break;
            case "82":
                board[8][1] = symbol;
                break;
            case "83":
                board[8][2] = symbol;
                break;
            case "84":
                board[8][3] = symbol;
                break;
            case "85":
                board[8][4] = symbol;
                break;
            case "86":
                board[8][5] = symbol;
                break;
            case "87":
                board[8][6] = symbol;
                break;
            case "88":
                board[8][7] = symbol;
                break;
            case "89":
                board[8][8] = symbol;
                break;
            case "90":
                board[8][9] = symbol;
                break;
            case "91":
                board[9][0] = symbol;
                break;
            case "92":
                board[9][1] = symbol;
                break;
            case "93":
                board[9][2] = symbol;
                break;
            case "94":
                board[9][3] = symbol;
                break;
            case "95":
                board[9][4] = symbol;
                break;
            case "96":
                board[9][5] = symbol;
                break;
            case "97":
                board[9][6] = symbol;
                break;
            case "98":
                board[9][7] = symbol;
                break;
            case "99":
                board[9][8] = symbol;
                break;
            case "100":
                board[9][9] = symbol;
                break;

            default:
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

