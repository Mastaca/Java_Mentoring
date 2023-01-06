package chess_game_underConstruction.chess_game_Edi.Items;

import chess_game_underConstruction.chess_game_Edi.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class King extends Item {
    public King(Position position, Player player) {
        super(position, player);
    }

    @Override
    public Set<Position> possibleMoves() {
        Set<Position> possiblePositions = new HashSet<>();
        Map<Position, Item> items = this.player.getItems();
        char initialColumn = this.position.getColumn();
        int initialRow = this.position.getRow();

        for (int i = initialColumn - 1; i <= initialColumn + 1; ++i) {
            for (int j = initialRow-1; j <= initialRow + 1; ++j) {
                if (this.isOnThetable((char)i, j) ||
                    (i != initialColumn || j != initialRow)) {
                    Position movePosition = new Position((char) i, j);
                    if (items.get(movePosition) == null) possiblePositions.add(movePosition);
                }
            }
        }

        return possiblePositions;
    }

    @Override
    public String getCharacter() {
        return "K";
    }
}
