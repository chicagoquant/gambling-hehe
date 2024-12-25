import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        String[][] board = {{"O", //top left square
                "-", // top middle square
                "-"}, //top right square
                {"-",
                        "O",
                        "-"},
                {"-h",
                        "h-",
                        "O"}
        };
        Scanner can = new Scanner(System.in);
        while(true) {
            System.out.println("Starting new game...");
            System.out.println("Calibrating the board...");
            System.out.println("Ending the world...");
            System.out.println("Eliminating the wrinkles...");
            System.out.println("Game starting...");
System.out.println("Who goes first, O or X? 0 for O, 1 for X");
int turn = can.nextInt();
            for(int i = 0; i<3; i++) {
                for(int d = 0; d<3; d++) {
                    board[i][d] = "-";
                }
           }
            int won = 0;

        while (won == 0) {

            board = playTurn(board, turn);
            turn++;
            turn = turn%2;

        won = checkWin(board);

        }
        }
    }
    public static void printBoard(String[][] board) {
        System.out.println("---------------");
        System.out.println(" | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("---------------");
        System.out.println(" | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("---------------");
        System.out.println(" | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("---------------");
    }
    public static int checkWin(String[][] board) {
        int won = 0;
        if(
            //Checks for a horizontal win
                (board[0][0].equals(board[0][1])&&board[0][0].equals(board[0][2])&&board[0][0].equals("X"))||(board[1][0].equals(board[1][1])&&board[1][0].equals(board[1][2])&&board[1][0].equals("X"))||(board[2][0].equals(board[2][1])&&board[2][0].equals(board[2][2])&&board[2][0].equals("X"))
        //Checks for a vertical win
        ||(board[0][0].equals(board[1][0])&&board[0][0].equals(board[2][0])&&board[0][0].equals("X"))||(board[0][1].equals(board[1][1])&&board[0][1].equals(board[2][1])&&board[0][1].equals("X"))||(board[0][2].equals(board[1][2])&&board[0][2].equals(board[2][2])&&board[0][2].equals("X"))
        //Checks for a diagonal win
                        ||(board[1][1].equals("X")&&board[0][0].equals("X")&&board[2][2].equals("X"))||(board[0][2].equals("X")&&board[1][1].equals("X")&&board[2][0].equals("X"))
        ) {
            System.out.println("X wins!");
            won = 1;
        } else if (
            //Checks for a horizontal win
                (board[0][0].equals(board[0][1])&&board[0][0].equals(board[0][2])&&board[0][0].equals("O"))||(board[1][0].equals(board[1][1])&&board[1][0].equals(board[1][2])&&board[1][0].equals("O"))||(board[2][0].equals(board[2][1])&&board[2][0].equals(board[2][2])&&board[2][0].equals("O"))
                        //Checks for a vertical win
                        ||(board[0][0].equals(board[1][0])&&board[0][0].equals(board[2][0])&&board[0][0].equals("O"))||(board[0][1].equals(board[1][1])&&board[0][1].equals(board[2][1])&&board[0][1].equals("O"))||(board[0][2].equals(board[1][2])&&board[0][2].equals(board[2][2])&&board[0][2].equals("O"))
//Checks for a diagonal win
                ||(board[1][1].equals("O")&&board[0][0].equals("O")&&board[2][2].equals("O"))||(board[0][2].equals("O")&&board[1][1].equals("O")&&board[2][0].equals("O"))
        ) {
            System.out.println("O wins!");
            won = 2;
        } else if (!board[0][0].equals("-")&&!board[0][1].equals("-")&&!board[0][2].equals("-")&&!board[1][0].equals("-")&&!board[1][1].equals("-")&&!board[1][2].equals("-")&&!board[2][0].equals("-")&&!board[2][1].equals("-")&&!board[2][2].equals("-")){
            System.out.println("Draw!");
            won = 3;
        } else {
            won = 0;
        }
        System.out.println("The board was...");
        System.out.println("---------------");
        System.out.println(" | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("---------------");
        System.out.println(" | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("---------------");
        System.out.println(" | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("---------------");
return won;
    }
    public static String[][] playTurn(String[][] board, int turn) {
        Scanner can = new Scanner(System.in);
        int row = 0;
        int column = 0;
        int doesItWork = 0;
        switch(turn) {
            case 0:
                while(doesItWork == 0) {
                System.out.println("O's turn");
                System.out.println("This is the board:");
                printBoard(board);
                System.out.println("Enter 1-3 for your row, eg if you wanted to put something on row 2, you would enter 2");
                 row = can.nextInt()-1;
                System.out.println("Enter 1-3 for your number in that row, eg if you wanted to put something in the middle square you would have entered 2 earlier and 2 now");
                 column = can.nextInt()-1;
                board[row][column] = "O";

            if (board[row][column].equals("-")) {
                board[row][column] = "O";
                doesItWork = 1;
            } else {
                System.out.println("That space is filled, try again");
                doesItWork = 0;
            }
        }
                break;
            case 1:
                while(doesItWork == 0) {
                System.out.println("X's turn");
                System.out.println("This is the board:");
                printBoard(board);
                System.out.println("Enter 1-3 for your row, eg if you wanted to put something on row 2, you would enter 2");
                 row = can.nextInt()-1;
                System.out.println("Enter 1-3 for your number in that row, eg if you wanted to put something in the middle square you would have entered 2 earlier and 2 now");
                 column = can.nextInt()-1;
                 if (board[row][column].equals("-")) {
                     board[row][column] = "X";
                     doesItWork = 1;
                 } else {
                     System.out.println("That space is filled, try again");
                     doesItWork = 0;
                 }
                }
                break;
        }
        return board;
    }
}
