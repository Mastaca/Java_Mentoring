package chess_game_underConstruction.chess_game_Diana;

import java.util.List;

public class Player {
    private String name;

    private String color;
    private List<Item> chessItems;

    public Player(String name, List<Item> chessItems, String color) {
        this.name = name;
        this.chessItems = chessItems;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public List<Item> getChessItems() {
        return chessItems;
    }

    public void setChessItems(List<Item> chessItems) {
        this.chessItems = chessItems;
    }
}
