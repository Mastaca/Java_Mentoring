package homeworks.hW221001.employee;

/*2. Cream o clasa Employee care are ca si proprietati :
numele, prenumele, varsta, salariul si zilele de concediu ale angajatului.
In clasa Employee cream 3 metode :
    una care intoarece numele complet al angajatului( nume + prenume concatenate),
    una care sa se numeasca amenda si care primeste ca parametru un numar reprezentand
        procentul cu care scade salariul angajatului si
    una care sa se numeasca concediu si care primeste ca parametru nr de zile de concediu pe
        care angajatului vrea sa si le ia- va scadea numar de zile de concediu ale angajatului).
In metoda main cream 2 angajati.
Pe primul il trimitem in concediu 3 zile si apoi il amendam cu 5 la suta,
iar pe al doilea il amendam cu 15 la suta si il trimitem in concediu 10 zile.
La final vreau sa afisati numele angajatilor, salariul lor si cate zile de concediu mai au*/


public class Main {
    public static void main(String[] args) {
        Employee grigorescu = new Employee("Grigorescu", "Mihaicescu", 22, 20, 2_850);
        Employee jupen = new Employee("Jupen", "Marele", 42, 22, 3_450.60);

        grigorescu.setDaysOffUsed(3);
        grigorescu.setFine(5);

        jupen.setDaysOffUsed(40);
        jupen.setFine(15);

        grigorescu.printEmployeeInformation();
        jupen.printEmployeeInformation();
    }


}
