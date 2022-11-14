package ticTacToe;

public class Main {
    private String name = "Fluffy";
    {
        System.out.println("just testing");
    }

    public static void main(String[] args) {
        Main test = new Main();
        System.out.println(test.name);
        Player player1 = new Player('X');
        Player player2 = new Player('O');

        player1.setName();
//        player1.setSymbol('&');
        player2.setName();
//        player2.setSymbol('*');

        Board board = new Board();
        board.createBoard();
        board.showBoard();

        while(true) {
           board.setPosition(player1);
           board.showBoard();
           if (board.checkWinner(player1)) break;
           board.setPosition(player2);
           board.showBoard();
           if (board.checkWinner(player2)) break;
       }
    }
}