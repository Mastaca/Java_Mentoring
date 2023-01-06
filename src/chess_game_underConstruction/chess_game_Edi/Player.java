package chess_game_underConstruction.chess_game_Edi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Player {
    private final String color;
    private String name;
    private final List<Item> chessItems = new ArrayList<>();
    private Map<Position, Item> items;

    public Player(String name, String color) {
        this.name = name;
        this.color = color.charAt(0) + "";
    }

    public boolean verifyItem(Item item){
        for (Item playerItem : chessItems) {
            if (playerItem.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public void moveItem(Position newPosition, Item item) {
        items.put(item.getPosition(), null);
        item.moveItem(newPosition);
        items.put(newPosition, item);
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

    public Map<Position, Item> getItems() {
        return items;
    }

    public void setItems(Map<Position, Item> items) {
        this.items = items;
    }

    public List<Item> getChessItems() {
        return chessItems;
    }

    public void addItem(Item item) {
        this.chessItems.add(item);
    }

    public Set<Position> availablePositions(Position position) {
        Item item = items.get(position);
        return item.possibleMoves();
    }
}
