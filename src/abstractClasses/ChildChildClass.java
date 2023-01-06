package abstractClasses;

public class ChildChildClass extends ChildClass{

    public static void main(String[] args) {

        AbstractParent x = new AbstractParent() {
            @Override
            public String getName() {
                return null;
            }
        };
        AbstractParent z = new ChildClass();
        ChildClass y = new ChildClass();
        y.someThing();
        z.eat();
        System.out.println(AbstractInterface.s);

    }
}
