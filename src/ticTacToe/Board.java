package ticTacToe;

import java.util.Scanner;

public class Board {
    private char[][] board;
    private char defaultChar = '.';
    private final Scanner scanner = new Scanner(System.in);

    public void changeDefaultBoardChar(char defaultChar) {
        this.defaultChar = defaultChar;
    }

    public void createBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter board size:");
        int size = scanner.nextInt();
        this.board = new char[size][size];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = defaultChar;
            }
        }
    }

    public void showBoard() {
        for (int i = 0; i < this.board.length; ++i) {
            for (int j = 0; j < this.board.length; ++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setPosition(Player player) {
        while(true){
            System.out.println(player.getName() + " please choose the row of your next position (1-"+ this.board.length + "):");
            int row = scanner.nextInt()-1;
            System.out.println(player.getName() + " please choose the column of your next position (1-"+ this.board.length + "):");
            int column = scanner.nextInt()-1;
            if (this.board[row][column] == defaultChar) {
                this.board[row][column] = player.getSymbol();
                System.out.println();
                return;
            } else System.out.println("OCCUPIED, CHOOSE AGAIN.\n");
        }
    }

    public boolean checkWinner(Player player) {
        if(checkRowsForWinner(player)) return true;
        if(checkColumnsForWinner(player)) return true;
        if(checkDiagonalsForWinner(player)) return true;
        return checkDraw();
    }

    private boolean checkRowsForWinner(Player player) {
        int sameCharInRow = 0;
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                if (this.board[i][j] == player.getSymbol()) {
                    sameCharInRow++;
                    if (sameCharInRow == this.board.length) {
                        printWinner(player);
                        return true;
                    }
                }
            }
            sameCharInRow = 0;
        }
        return false;
    }
    private boolean checkColumnsForWinner(Player player) {
        int sameCharInColumn = 0;
        int j = 0;
        while (j < this.board.length){
            for (int i = 0; i < this.board.length; i++) {
                if (this.board[i][j] == player.getSymbol()) {
                    sameCharInColumn++;
                    if (sameCharInColumn == this.board.length) {
                        printWinner(player);
                        return true;
                    }
                }
            }
            sameCharInColumn = 0;
            j++;
        }
        return false;
    }

    private boolean checkDiagonalsForWinner(Player player) {
        int checkUpLeftDownRight = 0;
        int checkUpRightDownLeft = 0;
        int j = this.board.length-1;
        for (int i = 0; i < this.board.length; i++) {
            if (this.board[i][i] == player.getSymbol()) {
                checkUpLeftDownRight++;
                if (checkUpLeftDownRight == this.board.length) {
                    printWinner(player);
                    return true;
                }
            }
            if (this.board[i][j] == player.getSymbol()) {
                checkUpRightDownLeft++;
                if (checkUpRightDownLeft == this.board.length) {
                    printWinner(player);
                    return true;
                }
            }
        j--;
        }
        return false;
    }

    private boolean checkDraw () {
        int totalDefaultCharacters = this.board.length * this.board.length;
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                if (this.board[i][j] == defaultChar) {
                    return false;
                } else totalDefaultCharacters--;

            }
        }
        if (totalDefaultCharacters == 0) {
            System.out.println("It's a draw!\n Game Over");
            return true;
        }
        return false;
    }

    public void printWinner(Player player) {
        System.out.println(player.getName() + " (" + player.getSymbol() + ")" + " is the winner!");
    }
}


