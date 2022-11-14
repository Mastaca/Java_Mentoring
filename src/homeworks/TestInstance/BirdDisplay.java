package homeworks.TestInstance;

public class BirdDisplay {

    protected void finalize() {
        System.out.println("Roar!");
    }

    public static void main(String[] name) {
//        System.out.println(name[1]);
        test("a","b");
    }

    public static void test(String... name) {
        for (String s : name) {
            System.out.println(s);
        }
    }
}
