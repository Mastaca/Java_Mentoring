package chess_game_underConstruction.chess_game_Edi.Items;

import chess_game_underConstruction.chess_game_Edi.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pawn extends Item {
    public Pawn(Position position, Player player) {
        super(position, player);
    }

    @Override
    public Set<Position> possibleMoves() {
        Set<Position> possiblePositions = new HashSet<>();
        Map<Position, Item> items = this.player.getItems();
        int playerMove = this.player.getColor().equals("w") ? -1 : 1;
        Position movePosition = new Position(this.position.getColumn(),
                                        this.position.getRow() + playerMove);
        if (items.get(movePosition) ==  null){
            possiblePositions.add(movePosition);
        }
        return possiblePositions;
    }

    @Override
    public String getCharacter() {
        return "P";
    }
}
