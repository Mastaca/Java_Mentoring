package chess_game_underConstruction.chess_game_Edi.Items;

import chess_game_underConstruction.chess_game_Edi.Item;
import chess_game_underConstruction.chess_game_Edi.Player;
import chess_game_underConstruction.chess_game_Edi.Position;

import java.util.Set;

public class Bishop extends Item {

    public Bishop(Position position, Player player) {
        super(position, player);
    }

    @Override
    public Set<Position> possibleMoves() {
        return null;
    }

    @Override
    public String getCharacter() {
        return "B";
    }
}
