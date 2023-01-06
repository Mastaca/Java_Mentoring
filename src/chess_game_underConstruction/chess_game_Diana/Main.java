package chess_game_underConstruction.chess_game_Diana;

public class Main {
    public static void main(String[] args) {
        Player whitePlayer = new Player("Diana", null, "white");
        Player blackPlayer = new Player("Edi", null, "black");
        Table table = new Table(whitePlayer, blackPlayer);
        table.showTable();
    }
}
//TO DO: 1.de terminat de aranjat piesele
//       2.refactorizat