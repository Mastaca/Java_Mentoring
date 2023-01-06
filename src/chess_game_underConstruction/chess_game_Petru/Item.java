package chess_game_underConstruction.chess_game_Petru;

import java.util.Set;

public abstract class Item {
    protected Position position;
    protected boolean isActive = true;
    protected Player player;

    public abstract void moveItem(Position newPosition);

    public abstract Set<Position> possibleMoves();

    public Item(Position position, Player player) {
        this.position = position;
        this.player = player;
    }

    public final Position getPosition() {
        return position;
    }

    public final void setPosition(Position position) {
        this.position = position;
    }

    public final boolean isActive() {
        return isActive;
    }

    public final void remove() {
        isActive = false;
    }
}
