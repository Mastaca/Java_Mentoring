package chess_game_underConstruction.chess_game_Edi;

import chess_game_underConstruction.chess_game_Edi.Items.*;

import java.util.HashMap;
import java.util.Map;

public class Table {
    public final Map<Position, Item> items = new HashMap<>();
    private final Item[][] tableMatrix = new Item[8][8];

    public Table(Player whitePlayer, Player blackPlayer) {
        for (int r = 1; r <= 8; r++) {
            for (char c = 'A'; c <= 'H'; c++) {
                Position p = new Position(c, r);
                items.put(p, null);
            }
        }
        arrangeItems(whitePlayer);
        arrangeItems(blackPlayer);
        whitePlayer.setItems(items);
        blackPlayer.setItems(items);
    }

    public void arrangeItems(Player player) {
        arrangePawn(player);
        arrangeRook(player);
        arrangeKnight(player);
        arrangeBishop(player);
        arrangeQueen(player);
        arrangeKing(player);
    }

    public void showTable() {
        System.out.println("Explanation: \n" +
                "P - Pawn, C - knight, B - Bishop, R - Rook, Q - Queen, K - king, \n" +
                "w - White player, b - Black player\n");
        for (Map.Entry<Position, Item> entry : items.entrySet()) {
            Position position = entry.getKey();
            Item item = entry.getValue();
            int x = position.getRow() - 1;
            int y = position.getColumn() - 65;
            tableMatrix[x][y] = item;
        }
        System.out.println("   A      B      C      D      E      F      G      H");
        for (int x = 0; x < 8; x++) {
            System.out.print(x+1 + "  ");
            for (int y = 0; y < 8; y++) {

                if (tableMatrix[x][y] != null) {

                    System.out.print(tableMatrix[x][y].getRepresentation() + "    ");
                } else {
                    System.out.print("X" + "      ");
                }
            }
            System.out.println();
        }
        System.out.println("   A      B      C      D      E      F      G      H");
    }

    private void arrangePawn(Player player) {
        if (player.getColor().equals("w")) {
            for (char c = 'A'; c <= 'H'; c++) {
                Pawn pawn = new Pawn(null, null);
                placeItem(player, pawn, c, 7);
            }
        } else {
            for (char c = 'A'; c <= 'H'; c++) {
                Pawn pawn = new Pawn(null, null);
                placeItem(player, pawn, c, 2);
            }
        }
    }

    private void arrangeRook(Player player) {
//        player.getColor().equals("w") ? placeRook(player,'A', 8) : placeRook(player,'A', 1)
        Rook rook1 = new Rook(null, null);
        Rook rook2 = new Rook(null, null);
        if (player.getColor().equals("w")) {
            placeItem(player, rook1,'A', 8);
            placeItem(player, rook2,'H', 8);
        } else {
            placeItem(player, rook1,'A', 1);
            placeItem(player, rook2,'H', 1);
        }
    }

    private void arrangeKnight(Player player) {
        Knight knight1 = new Knight(null, null);
        Knight knight2 = new Knight(null, null);
        if (player.getColor().equals("w")) {
            placeItem(player, knight1, 'B', 8);
            placeItem(player, knight2, 'G', 8);
        } else {
            placeItem(player, knight1, 'B', 1);
            placeItem(player, knight2, 'G', 1);
        }
    }

    private void arrangeBishop(Player player) {
        Bishop bishop1 = new Bishop(null, null);
        Bishop bishop2 = new Bishop(null, null);
        if (player.getColor().equals("w")) {
            placeItem(player, bishop1, 'C', 8);
            placeItem(player, bishop2, 'F', 8);
        } else {
            placeItem(player, bishop1, 'C', 1);
            placeItem(player, bishop2, 'F', 1);
        }
    }

    private void arrangeQueen(Player player) {
        Queen queen = new Queen(null, null);
        if (player.getColor().equals("w")) {
            placeItem(player, queen,'D', 8);
        } else {
            placeItem(player, queen,'E', 1);
        }
    }

    private void arrangeKing(Player player) {
        King king = new King(null, null);
        if (player.getColor().equals("w")) {
            placeItem(player, king, 'A', 4);
        } else {
            placeItem(player, king, 'D', 1);
        }
    }

    private void placeItem(Player player, Item item, char column, int row) {
        Position position = new Position(column, row);
        item.setPosition(position);
        item.setPlayer(player);
        player.addItem(item);
        items.put(position, item);
    }


    public Item getItem(Position position) {
        return items.get(position);
    }

}
