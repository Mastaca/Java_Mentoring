package homeworks;

public class Main {

    public static int[] arrayOfMultiples(int num, int length) {
        int[] multiplesList = new int[length];
        int j = 1;
        for (int i = 0; i <= multiplesList.length-1; i++ ) {
            multiplesList[i] = num * j;
            j++;
        }
        return multiplesList;
    }

    public static int[] inversList(int[] lista) {
        int[] listaInversa = new int[lista.length];
        int j = 0;
        for(int i = lista.length-1; i >= 0; i-- ) {
            listaInversa[j] = lista[i];
            j++;
        }
        return listaInversa;
    }

    public static int countTrue(boolean[] arr) {
        int trueCount = 0;
        if (arr.length != 0) {
            for (boolean i : arr) {
                if (i == true) trueCount++;
            }
        } else trueCount = 0;
        return trueCount;
    }

    public static void main(String[] args) {

        char[][] letters = new char[][]{
                {'D', 'E', 'Y', 'H', 'A', 'D'},
                {'C', 'B', 'Z', 'Y', 'J', 'K'},
                {'D', 'B', 'C', 'A', 'M', 'N'},
                {'F', 'G', 'G', 'R', 'S', 'R'},
                {'V', 'X', 'H', 'A', 'S', 'S'}
                };

        double a = 100.3D;

//        int[] lista = new int[] {5,8,2,4,9};
//
//        int[] listaNoua = inversList(lista);
//
//        for(int i : listaNoua ) {
//            System.out.print(i + " ");
//        }
//        boolean[] boolList = new boolean[] {true, false, false, true, false};
//        System.out.println(countTrue(boolList));

        System.out.println(arrayOfMultiples(7, 5));
    }
}

// metoda asta dar fara sa folosim alt vector