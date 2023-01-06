package chess_game_underConstruction.chess_game_Edi;


import java.util.Set;

public class ChessGame {

    private final UserInput userInput;
    private Table table;

    public ChessGame(UserInput userInput) {
        this.userInput = userInput;
    }

    public void startGame() {
        userInput.showMessage("Enter white player name:");
        String whiteName = userInput.readMessage();
        Player whitePlayer = new Player(whiteName, "white");
        userInput.showMessage("Enter black player name:");
        String blackName = userInput.readMessage();
        Player blackPlayer = new Player(blackName, "black");

        table = new Table(whitePlayer, blackPlayer);
        table.showTable();
        while (true) {
            boolean validChoice = false;
            Position selectedPosition = null;
            Position newposition = null;
            while (!validChoice) {
                userInput.showMessage("Please select next item to move (column+row):");
                String selectedItem = userInput.readMessage();
                selectedPosition = new Position(selectedItem.charAt(0), selectedItem.charAt(1) - 48);
                if (isValidChoice(selectedPosition, whitePlayer)) {
                    Set<Position> availablePositions = whitePlayer.availablePositions(selectedPosition);
                    userInput.showMessage("Possible move positions:");
                    userInput.showMessage(formatPositions(availablePositions));
                    String moveToPosition = userInput.readMessage();
                    newposition = new Position(moveToPosition.charAt(0), moveToPosition.charAt(1) - 48);
                    validChoice = true;
                }
            }
            Item selectedItem = table.getItem(selectedPosition);
            whitePlayer.moveItem(newposition, selectedItem);
            table.showTable();
            break;
        }
    }

    private boolean isValidChoice(Position position, Player player) {
        Item selectedItem = this.table.getItem(position);
        return player.verifyItem(selectedItem);
    }

    private String formatPositions(Set<Position> positions) {
        StringBuilder returnText = new StringBuilder();
        for (Position p : positions) {
            returnText.append(p.toString() + " ");
        }
        return returnText.toString();
    }

}
