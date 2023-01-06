package plusExercises.ProjectEuler;

import java.util.Scanner;

public class euler001 {
    //Multiples of 3 or 5 - 1000

    public static void main(String[] args) {
        System.out.println(multiplesOf3And5(1000) + "");

    }

    private static long multiplesOf3And5(int maxNumber) {
        long sum = 0;
        for (int j = 3; j < maxNumber; j++) {
            if (j % 3 == 0 || j % 5 == 0) sum += j;
        }
        return sum;
    }
}
