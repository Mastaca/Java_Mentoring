package chess_game_underConstruction.chess_game_Edi;

import java.util.Scanner;

public class ConsoleUserInput implements UserInput{
    private Scanner scan;

    public ConsoleUserInput(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String readMessage() {
        return scan.next();
    }
}
