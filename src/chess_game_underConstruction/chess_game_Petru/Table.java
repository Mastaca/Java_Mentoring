package chess_game_underConstruction.chess_game_Petru;

import java.util.Map;

public class Table {
    private Map<Position, Item> items;

    public Table(Player whitePlayer, Player blackPlayer) {
        for (int r = 1; r <= 8; ++r) {
            for (char c = 'A'; c <= 'H'; c++) {
                Position p = new Position(c, r);
                items.put(p, null);
            }
        }
    }

    private void arrangePioni(Player player) {
        if (player.getColor().equals("white")) {
            Position position1 = new Position('A', 7);
            Item pion1 = new Pion(position1, player);
            items.put(position1, pion1);
        }
    }

    public Item getItem(Position position) {
        return items.get(position);
    }
}
