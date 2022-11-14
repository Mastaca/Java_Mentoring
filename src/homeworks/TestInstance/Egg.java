package homeworks.TestInstance;

public class Egg {
    public Egg(int number) {
        System.out.println("In constructor number = " + this.number);
        this.number = number;
    }

    public static void main(String[] args) {
        Egg egg = new Egg(15);
        System.out.println(egg.number);
    }

    private int number;

    {
        System.out.println("In bloc number = " + number);
        number = 4;
    }
}