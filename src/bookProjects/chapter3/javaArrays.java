package bookProjects.chapter3;

import java.util.Arrays;

public class javaArrays {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        for (int i : numbers) {
            System.out.println(i);
        }
        int[] numbers2 = new int[]{42, 55, 99};
        int[] numbers2shorter = {42, 55, 99};

        int[] numAnimals;
        int[] numAnimals2;
        int[] numAnimals3;
        int[] numAnimals4;
        int[] numAnimals5;

        Object[] test = new String[5];

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        //objects[0] = new StringBuilder(); // careful!

        int[] numbers3 = new int[]{3, 2, 1};
        System.out.println(Arrays.binarySearch(numbers3, 2));
        System.out.println(Arrays.binarySearch(numbers3, 3));

        int [][] arguments = new int[4][];
        arguments[0] = new int[5];
        arguments[1] = new int[3];
        arguments[2] = new int[8];
        System.out.println(Arrays.deepToString(arguments));

        int [] arguments2[][] = new int[4][][];
        arguments2[0] = new int[2][2];
        System.out.println(Arrays.deepToString(arguments2));
        int [][][][][] arguments3 = new int[4][][][][];
        arguments3[0] = new int[2][2][4][7];
//        arguments3[0][0]= new int[1][][];
        arguments3[0][1][1][1][1] = 5;
        System.out.println(Arrays.deepToString(arguments3));

        /*
        [
            [
                [
                    [
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0]
                    ],
                    [
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0]
                    ]
                ],
                [
                    [
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0]
                    ],
                    [
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0],
                        [0, 0, 0, 0, 0, 0, 0]
                    ]
                ]
            ],
            null,
            null,
            null
        ]
        */



    }
}
