package Homeworks.hW220930;

import java.util.Arrays;

public class LargestGap {

    public static int largestGap(int[] numbers) {
        int gapSize = 0;
        int[] sortedNumbers = sortList(numbers);
        for (int i = 1; i < sortedNumbers.length; i++) {
            if (sortedNumbers[i] - sortedNumbers[i-1] > gapSize) gapSize = sortedNumbers[i] - sortedNumbers[i-1];
        }
        return gapSize;
    }

    public static int[] sortList(int[] numberList) {
        int nothingChanged = 0;
        while (nothingChanged != numberList.length-1){
            for (int i = 1; i < numberList.length; i++) {
                if (numberList[i-1] > numberList[i]) {
                    int backUp = numberList[i-1];
                    numberList[i-1] = numberList[i];
                    numberList[i] = backUp;
                    nothingChanged--;
                } else nothingChanged++;
            }
        }
        return numberList;
    }

    public static int largestGapWithSort(int[] numbers) {
        int gapSize = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] - numbers[i-1] > gapSize) gapSize = numbers[i] - numbers[i-1];
        }
        return gapSize;
    }

    public static void main(String[] args) {
        int[] listForGap = new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
//        for (int i : sortList(listForGap)) System.out.print(i + " ");
//        System.out.println(largestGap(listForGap));
        System.out.println(largestGapWithSort(listForGap));
        System.out.println(largestGap(listForGap));
    }
}
