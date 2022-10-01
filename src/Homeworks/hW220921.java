
package Homeworks;

import java.text.DecimalFormat;

public class hW220921 {

    //01 - Perfect square
    /*Create a function that takes an integer and outputs an "n x n" square solely consisting of the integer "n".
     https://edabit.com/challenge/7Tb7qMDQHtz3xpydd*/
    public static int[][] squarePatch(int n) {
        int[][] squareMatrix = new int[n][n];

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                squareMatrix[i][j] = n;
            }
        }
        return squareMatrix;
    }

    //02 - Spin Around, Touch the Ground
    /*Given a list of directions to spin, "left" or "right", return an integer of how many full
    360° rotations were made. Note that each word in the array counts as a 90° rotation in that direction.*/
    public static int spinAround(String[] turns) {
        int partialRotations = 0;
        int fullRotations = 0;

        for (String i : turns) {
            if (i == "right") {
                partialRotations++;
            } else partialRotations--;

            if (partialRotations == 4) {
                fullRotations++;
                partialRotations = 0;
            }
            else if (partialRotations == -4) {
                fullRotations--;
                partialRotations = 0;
            }
        }

//        if (fullRotations < 0) fullRotations = -fullRotations;

        return Math.abs(fullRotations);
    }


    //03 - Reverse the Number
    /*Create a function that takes an integer n and reverses it.*/
    public static String rev(int n) {
        String numberString = Integer.toString(Math.abs(n));
        String reversedNumber = "";

        for (int i = numberString.length()-1; i >= 0; i--) {
            reversedNumber += numberString.charAt(i);
        }

        return reversedNumber;
    }

    //04 - Calculate the Mean
    /*Create a function that takes an array of numbers and returns the mean (average) of all those numbers.
     https://edabit.com/challenge/9X8zLpBEcQsyerPgL
    mean([1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3]) ➞ 2.55
    mean([2, 3, 2, 3]) ➞ 2.50
    mean([3, 3, 3, 3, 3]) ➞ 3.00*/
    public static double mean(int[] nums) {
        long sumOfNumbers = 0l;

        for (int i : nums) {
            sumOfNumbers += i;
        }

        /*DecimalFormat doubleFraction = new DecimalFormat("###,###.00");

        double meanNumber = Double.parseDouble(
                                    doubleFraction.
                                            format((double) sumOfNumbers/ (double) nums.length));*/
        double meanNumber = (double) Math.round(((double) sumOfNumbers/ (double) nums.length)*100.00d)/100.00d;

        return meanNumber;
    }


    //05 - Highest Digit
    /*Create a function that takes a number as an argument and returns the highest digit in that number.*/
    public static int highestDigit(int n) {
        int highestNumber = 0;
        int remainderDigit = 0;
        while (n != 0) {
            remainderDigit = n % 10;
            if (remainderDigit > highestNumber) {
                highestNumber = remainderDigit;
            }
            n /= 10;
        }
        return highestNumber;
    }

    public static int highestDigitFor(int n) {
        int highestNumber = 0;
        int remainderDigit;

        for (; n!= 0 ;n = n/10) {
            remainderDigit = n % 10;
            if (remainderDigit > highestNumber) {
                highestNumber = remainderDigit;
            }
        }
        return highestNumber;
    }

    public static void main(String[] args) {
        //1 - Perfect square
        /*int[][] testArray = squarePatch(0);
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray[i].length; j++) {
                System.out.print(testArray[i][j] + " ");
            }
            System.out.println();
        }*/

        //02 - Spin Around, Touch the Ground
        /*String[] spinningDirections = new String[] {"right", "right", "right", "right", "right", "right", "right", "right"};
        System.out.println(spinAround(spinningDirections));*/

        //03 - Reverse the Number
//        System.out.println(rev(123456789));

        //04 - Calculate the Mean
        //nu inteleg cum sa apara double de exempu: 2.5 --> 2.50
        int[] testNumberList = new int[] {2, 3, 2, 3, 5, 7, 6, 9};
        System.out.printf("%.5f",mean(testNumberList));

        //05 - Highest Digit
        /*System.out.println(highestDigit(391401));
        System.out.println();
        System.out.println(highestDigitFor(391401));*/

    }


}




