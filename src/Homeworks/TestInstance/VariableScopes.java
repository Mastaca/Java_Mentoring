package Homeworks.TestInstance;

public class VariableScopes {

    public char instanceChar;               // variabila (proprietate) de instanta - scopul: obiectul din care face parte
    public static float classFloat;         // variabila (proprietate) de clasa - scop:global (accesibil din oriunde din cod)

    public void testVariable(int number) {  // number - variabila (proprietate) locala
        String text = "Un text simplu";     // text - variabila (proprietate) locala - scop in metoda declarata
        this.instanceChar = 'A';
    }

    public void anotherMethod() {
        instanceChar = 'B';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Asta e metoda finalize()");
    }

}
