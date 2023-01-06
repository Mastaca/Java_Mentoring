package chess_game_underConstruction.chess_game_Diana;

import java.util.HashMap;
import java.util.Map;

public class Table {
    private Map<Position, Item> items=new HashMap<>();

    public Table(Player whitePlayer, Player blackPlayer) {
        for (int r = 1; r <= 8; r++) {
            for (char c = 'A'; c <= 'H'; c++) {
                Position p = new Position(c, r);
                items.put(p, null);
            }
        }
        arrangePioni(whitePlayer);
        arrangePioni(blackPlayer);
        arrangeTura(whitePlayer);
        arrangeTura(blackPlayer);
    }

    public void showTable(){
        Item[][] tableMatrix=new Item[8][8];
        for(Map.Entry<Position, Item> entry:items.entrySet()){
            Position position= entry.getKey();
            Item item=entry.getValue();
            int x=position.getRow()-1;
            int y=position.getColumn()-65;
            tableMatrix[x][y]=item;

        }
        for(int x=0;x<8;x++){
            for(int y=0;y<8;y++){
                if(tableMatrix[x][y]!=null) {
                    System.out.print(tableMatrix[x][y].getRepresentation() + "    ");
                }
                else{
                    System.out.print("X"+"              ");
                }
            }
            System.out.println();
        }
    }

    private void arrangeTura(Player player){
        if(player.getColor().equals("white")){
            Position position1=new Position('A', 8);
            Item tura1=new Tura(position1, player);
            items.put(position1, tura1);
            Position position2=new Position('H', 8);
            Item tura2=new Tura(position2, player);
            items.put(position2, tura2);
        }
        else{
            Position position1=new Position('A', 1);
            Item tura1=new Tura(position1, player);
            items.put(position1, tura1);
            Position position2=new Position('H', 1);
            Item tura2=new Tura(position2, player);
            items.put(position2, tura2);
        }
    }
    private void arrangePioni(Player player) {
        if (player.getColor().equals("white")) {
            for (char c = 'A'; c <= 'H'; c++) {
                Position position = new Position(c, 7);
                Item pion = new Pion(position, player);
                items.put(position, pion);
            }
        }
        else{
            for (char c = 'A'; c <= 'H'; c++) {
                Position position = new Position(c, 2);
                Item pion = new Pion(position, player);
                items.put(position, pion);
            }
        }

    }

    public Item getItem(Position position) {
        return items.get(position);
    }

}
