package Homeworks.TestInstance;

public class VariableMain {

    public static void main(String[] args) {
        System.out.println(VariableScopes.classFloat);
        VariableScopes obiect1 = new VariableScopes();
        VariableScopes obiect2 = new VariableScopes();

        /*obiect1.classFloat = 0.8f;
        System.out.println("Obiect 1: " + obiect1.classFloat);
        obiect2.classFloat = 0.4f;
        System.out.println("Obiect 2: " + obiect2.classFloat);
        VariableScopes.classFloat = 4.5f;
        System.out.println();
        System.out.println("Obiect 1: " + obiect1.classFloat);
        System.out.println("Obiect 2: " + obiect2.classFloat);
        System.out.println("Global variable: " + VariableScopes.classFloat);
*/
        obiect1.classFloat = 0.1f;
        VariableScopes.classFloat = 0.5f;
//        obiect1 = null;
//        obiect2 = null;
        System.gc();
        System.out.println("1");
    }
}
