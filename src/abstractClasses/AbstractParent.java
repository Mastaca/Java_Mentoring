package abstractClasses;

public abstract class AbstractParent {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();

    public static void main(String[] args) {
        System.out.println("aaa");
        ChildClass b = new ChildClass();
        b.age = 26;
        b.eat();
    }

}
