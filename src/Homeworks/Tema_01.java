package Homeworks;

public class Tema_01 {
    //sa inversam lista data ( 1, 2, 3 --> 3, 2, 1 )
    public static int[] inversList(int[] lista) {
        for (int i = 0; i < lista.length / 2; i++) {
            int backUp = lista[i];
            lista[i] = lista[lista.length - (1 + i)];
            lista[lista.length - (1 + i)] = backUp;
        }
        return lista;
    }

    public static void main(String[] args) {

        int[] listaNumere = new int[] {5, 8, 2, 4, 7, 8, 6, 7};

        System.out.print("Lista initiala: ");
        for(int i : listaNumere ) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] listaNoua = inversList(listaNumere);

        System.out.print("Lista inversa: ");
        for (int i : listaNoua) {
            System.out.print(i + " ");
        }


    }
}

// metoda asta dar fara sa folosim alt vector