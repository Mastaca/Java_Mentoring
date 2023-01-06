package chess_game_underConstruction.chess_game_Edi;

import java.util.Set;

public abstract class Item {
    protected Position position;
    protected boolean isActive = true;

    protected Player player;

    public Item(Position position, Player player) {
        this.position = position;
        this.player = player;
    }

    protected boolean isOnThetable(char column, int row) {
        // returns if the item is on the table
        return ((column > 'A' && column < 'H') ||
                (row > 0 && row < 8));
    }

    public String getRepresentation() {
        return getCharacter() + "-" + player.getColor();
    }

    protected abstract String getCharacter();

    public final Position getPosition() {
        return position;
    }

    public final void setPosition(Position position) {
        this.position = position;
    }

    public final void setPlayer(Player player) {
        this.player = player;
    }

    public void moveItem(Position newPosition) {
        this.position = newPosition;
    }

    public abstract Set<Position> possibleMoves();

    public final boolean isActive() {
        return isActive;
    }

    public final void remove() {
        isActive = false;
    }
}
