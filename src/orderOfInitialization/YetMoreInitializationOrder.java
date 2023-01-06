package orderOfInitialization;

public class YetMoreInitializationOrder {

    static {
        add(2);
    }

    static {
        add(4);
    }

    static {
        new YetMoreInitializationOrder();
    }

    {
        add(6);
    }

    {
        add(8);
    }

    YetMoreInitializationOrder() {
        add(5);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        System.out.println(A.ceva);
        A c;
        B b = new B();
        System.out.println("xx");
        A a = new A();
    }
}
