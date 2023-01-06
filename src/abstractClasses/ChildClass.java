package abstractClasses;

public class ChildClass extends AbstractParent implements AbstractInterface, TestInterface {
    @Override
    public String getName() {
        return "kiddo";
    }

    public void eat() {
        System.out.println("Child is eating");
    }
    public void someThing() {}

    public static void main(String[] args) {
        ChildClass a = new ChildClass();
        a.eat();
    }

    @Override
    public int getSomething() {
        return 0;
    }

    @Override
    public int getNumber() {
        return 0;
    }
}
