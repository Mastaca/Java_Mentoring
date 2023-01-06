package chess_game_underConstruction.chess_game_Diana;

import java.util.Objects;

public class Position {
    private int row;
    private char column;

    public Position( char column, int row) {
       setColumn(column);
       setRow(row);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        if(row>=1 && row<=8)
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        if(column>='A' && column<='H')
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return row == position.row && column == position.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRow(), getColumn());
    }
}
