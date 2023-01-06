package testingInterfaces;

public class Main implements InterfaceExample {

    public void anotherThing() {};

    public static void main(String[] args) {
        InterfaceExample i1 = new B();
        InterfaceExample i2 = new A();
        C c = new C();
        c.metodaSimpla(i1);
        c.metodaSimpla(i2);

    }

    @Override
    public void someThing() {}
}
