package innerClasses;

@FunctionalInterface
interface some {void s();}

@FunctionalInterface
interface som{void s();}

public class NewClass extends Greetings {

    public void s() {
        System.out.println("sss");
    }
}
