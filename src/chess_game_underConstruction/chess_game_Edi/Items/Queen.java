package chess_game_underConstruction.chess_game_Edi.Items;

import chess_game_underConstruction.chess_game_Edi.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Queen extends Item {
    public Queen(Position position, Player player) {
        super(position, player);
    }

    @Override
    public Set<Position> possibleMoves() {
        Set<Position> possiblePositions = new HashSet<>();
        Map<Position, Item> items = this.player.getItems();
        char initialColumn = this.position.getColumn();
        int initialRow = this.position.getRow();

        // horizontal moves
        for (int i = 'A'; i <= 'H'; ++i) {
                Position movePosition = new Position((char)i, initialRow);
                if (i == initialColumn) continue;
                if (items.get(movePosition) == null) possiblePositions.add(movePosition);
        }

        // vertical moves
        for (int i = 1; i <= 8; ++i) {
            Position movePosition = new Position(initialColumn, i);
            if (i == initialRow) continue;
            if (items.get(movePosition) == null) possiblePositions.add(movePosition);
        }

        // diagonal moves



        for (int i = initialColumn - 1; i <= initialColumn + 1; ++i) {
            if (i < 'A' || i > 'H') continue;
            for (int j = initialRow-1; j <= initialRow + 1; ++j) {
                if (j < 0 || j > 8) continue;
                Position movePosition = new Position((char)i, j);
                if (i == initialColumn && j == initialRow) continue;
                if (items.get(movePosition) == null) possiblePositions.add(movePosition);
            }
        }

        return possiblePositions;
    }

    @Override
    public String getCharacter() {
        return "Q";
    }
}
