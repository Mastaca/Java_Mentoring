package orderOfInitialization;

public class A {

    static final String ceva;

    static {
        System.out.println("AAAA");
        ceva = "altceva";
    }

    public A() {

    }

}
