package polymorphism;

public class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Capybara();
//        Capybara capybara = (Capybara)rodent; // Throws ClassCastException at runtime
        ceva(rodent);


    }

    public static void ceva(Object object) {
        //TODO vreau sa apelez metoda test pe obiectul pe care il primesc ca parametru
        if (object instanceof Rodent) {
            Capybara rodent = (Capybara) object;
            rodent.test2();
        }
    }

    @Override
    public void test() {
        System.out.println("capybara");
    }

    public void test2() {
        System.out.println("capybara2");
    }
}