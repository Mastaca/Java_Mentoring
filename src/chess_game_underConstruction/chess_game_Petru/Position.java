package chess_game_underConstruction.chess_game_Petru;

import java.util.Objects;

public class Position {
    private char column;
    private int row;

    public Position(char column, int row) {
        setColumn(column);
        setRow(row);
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        if (column >= 'A' && column <= 'H') {
            this.column = column;
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        if (row >= 1 && row <= 8) {
            this.row = row;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return column == position.column && row == position.row;
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, row);
    }
}
