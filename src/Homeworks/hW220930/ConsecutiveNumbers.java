package Homeworks.hW220930;

import java.util.Arrays;

public class ConsecutiveNumbers {

    public static boolean checkValueWithJump (int[] numberList, int checkForValue, int jumpOver) {
        for (int j = 0; j < numberList.length; j++) {
            if (j == jumpOver) j++;
            else {
                if (numberList[j] == checkForValue) return false;
            }
        }
        return true;
    }
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    if (arr[j] == arr[i]) return false;
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] test1 = new int[] {5, 1, 4, 3, 2};
        int[] test2 = new int[] {5, 1, 4, 3, 2, 8};
        int[] test3 = new int[] {5, 6, 7, 8, 9, 9};

        System.out.println("1: " + cons(test1));
        System.out.println("2: " + cons(test2));
        System.out.println("3: " + cons(test3));
    }
}
