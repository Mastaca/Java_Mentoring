package Homeworks.hW220930;

public class NCMain {

//    public static boolean winRoundWithArrays() {
//        int[] yourBiggestNumbers = findTwoBiggestNumber(yourNumbers);
//        int[] opponentsBiggestNumbers = findTwoBiggestNumber(opponentsNumbers);
//
//        if (yourBiggestNumbers[0] == opponentsBiggestNumbers[0])
//            return yourBiggestNumbers[1] > opponentsBiggestNumbers[1];
//        else return yourBiggestNumbers[0] > opponentsBiggestNumbers[0];
//    }

    public static void main(String[] args) {
        int[] yourNumbers = new int[] {2, 5, 2, 6, 9};
        int[] opponentsNumbers = new int[] {3, 7, 2, 1, 2};

        NCPlayer player1 = new NCPlayer();
        NCPlayer player2 = new NCPlayer();

        player1.numbers = yourNumbers;
        player2.numbers = opponentsNumbers;

        player1.findTwoBiggestNumber();
        player2.findTwoBiggestNumber();
        for (int i : player1.numbers) System.out.print(i + " ");
        System.out.println();
        System.out.println(player1.biggestNumber);
        System.out.println(player1.secondBiggestNumber);
    }
}
