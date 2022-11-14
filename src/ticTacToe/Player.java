package ticTacToe;

import java.util.Scanner;


public class Player {

    private String name;
    private char symbol;
    private final Scanner scanner = new Scanner(System.in);

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public void setName() {
        System.out.println("Please enter " + this.symbol + " player name:");
        this.name = scanner.next();
    }

    public void setSymbol(char symbol) {
        System.out.println(this.name + " please enter your new character:");
        this.symbol = scanner.next().charAt(0);
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
