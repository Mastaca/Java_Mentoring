package JocClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sa citim de la tastatura numele unei clase (ex. clasa 11.C, Liceul)
        //citim numarul de elevi din clasa respectiva
        //pana cand nu am citit toti elevii, citim numele, prenumele si media generala a elevilor
        //sa afisam media clasei
        Scanner scanner = new Scanner(System.in);
        Clasa clasa = new Clasa();

        System.out.println("Introduceti numele clasei: ");
        clasa.nume = scanner.next();
        System.out.println("Introduceti numele liceului");
        clasa.numeLiceu = scanner.next();
        System.out.println("Introduceti numarul de elevi din clasa");
        int numarElevi = scanner.nextInt();

        Elev[] listaElevi = new Elev[numarElevi];
        int i = 0;
        while (i < numarElevi) {
            Elev elev = new Elev();
            System.out.println("Introduceti numele elevului: ");
            elev.nume = scanner.next();
            System.out.println("Introduceti prenumele elevului: ");
            elev.prenume = scanner.next();
            System.out.println("Introduceti media elevului: ");
            elev.medie = scanner.nextFloat();
            System.out.println("Urmatorul elev:");
            listaElevi[i] = elev;
            i++;
        }
        clasa.elevi = listaElevi;

        System.out.println("Media generala a clasei este de: " + clasa.mediaClasei());
    }
}
