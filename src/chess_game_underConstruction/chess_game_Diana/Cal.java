package chess_game_underConstruction.chess_game_Diana;

import java.util.Set;

public class Cal extends Item {
    public Cal(Position position, Player player) {
        super(position, player);
    }

    @Override
    public void moveItem() {

    }

    @Override
    public void moveItem(Position newPosition) {

    }

    @Override
    public Set<Position> possibleMoves() {
        return null;
    }

    @Override
    public String getCharacter() {
        return "cal";
    }
}
