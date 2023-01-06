package chess_game_underConstruction.chess_game_Edi.Items;

import chess_game_underConstruction.chess_game_Edi.*;

import java.util.Set;

public class Knight extends Item {
    public Knight(Position position, Player player) {
        super(position, player);
    }

    @Override
    public Set<Position> possibleMoves() {
        return null;
    }

    @Override
    public String getCharacter() {
        return "C";
    }
}
