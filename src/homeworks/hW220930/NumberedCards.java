package homeworks.hW220930;

public class NumberedCards {

    //Version 1
    public static boolean winRoundWithBiggestNumbers(int[] yourNumbers, int[] opponentsNumbers) {
        int yourBiggestNumber = findBiggestNumberWithException(yourNumbers, -1);
        int opponentsBiggestNumber = findBiggestNumberWithException(opponentsNumbers, -1);

        if (yourBiggestNumber == opponentsBiggestNumber) {
            return findBiggestNumberWithException(yourNumbers, yourBiggestNumber) >
                    findBiggestNumberWithException(opponentsNumbers, opponentsBiggestNumber);
        }else return yourBiggestNumber > opponentsBiggestNumber;
    }

    public static int findBiggestNumberWithException (int[] numberList, int jumpOver) {
        int biggestNumber = 0;
        for (int i = 0; i < numberList.length; i++) {
            if (i == jumpOver) i++;
            else {
                if (numberList[i] > biggestNumber) biggestNumber = numberList[i];
            }
        }
        return biggestNumber;
    }



    //Version 2
    public static boolean winRoundWithArrays(int[] yourNumbers, int[] opponentsNumbers) {
        int[] yourBiggestNumbers = findTwoBiggestNumberArray(yourNumbers);
        int[] opponentsBiggestNumbers = findTwoBiggestNumberArray(opponentsNumbers);
//        for (int i : yourBiggestNumbers) System.out.println("y" + i);
//        for (int i : opponentsBiggestNumbers) System.out.println("o" + i);
        if (yourBiggestNumbers[0] == opponentsBiggestNumbers[0])
            return yourBiggestNumbers[1] > opponentsBiggestNumbers[1];
        else return yourBiggestNumbers[0] > opponentsBiggestNumbers[0];
    }

    public static int[] findTwoBiggestNumberArray (int[] numberList) {
        int[] twoBiggestNumbers = new int[2];
        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] > twoBiggestNumbers[0]) {
                if (twoBiggestNumbers[0] > twoBiggestNumbers[1]) twoBiggestNumbers[1] = twoBiggestNumbers[0];
                twoBiggestNumbers[0] = numberList[i];
            }
        }
        return twoBiggestNumbers;
    }



    //original exercise
    public static boolean winRoundOriginal(int[] yourNumbers, int[] opponentsNumbers) {
        int yourBiggestNumber = findBiggestNumbers(yourNumbers)[0];
        int your2ndBiggestNumber = findBiggestNumbers(yourNumbers)[1];
        int opponentsBiggestNumber = findBiggestNumbers(opponentsNumbers)[0];
        int opponents2ndBiggestNumber = findBiggestNumbers(opponentsNumbers)[1];

        if (yourBiggestNumber == opponentsBiggestNumber) return your2ndBiggestNumber > opponents2ndBiggestNumber;
        else return yourBiggestNumber > opponentsBiggestNumber;
    }
    public static int[] findBiggestNumbers(int[] numberList) {
        int[] biggestNumbers = new int[2];
        for (int i : numberList) {
            if (i > biggestNumbers[0]) biggestNumbers[0] = i;
            else if (i > biggestNumbers[1]) biggestNumbers[1] = i;
        }
        return biggestNumbers;
    }

    public static void main(String[] args) {
        int[] yourNumbers = new int[] {2, 5, 2, 6, 9};
        int[] opponentsNumbers = new int[] {5, 9, 2, 1, 2};
//        System.out.println(winRoundWithBiggestNumbers(yourNumbers, opponentsNumbers));
        System.out.println(winRoundWithArrays(yourNumbers, opponentsNumbers));
//        System.out.println(winRoundOriginal(yourNumbers, opponentsNumbers));
    }
}
