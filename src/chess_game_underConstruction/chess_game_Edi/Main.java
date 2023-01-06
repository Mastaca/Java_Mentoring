package chess_game_underConstruction.chess_game_Edi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInput userInput = new ConsoleUserInput(scan);
        ChessGame chess = new ChessGame(userInput);
        chess.startGame();
    }
}

//TO DO: 1. sa avansam cu cartea - READ AGAIN
//       2. daca putem, pana sambata viitoare sa incercam sa implementam la toate Item-urile metoda possibleMoves()