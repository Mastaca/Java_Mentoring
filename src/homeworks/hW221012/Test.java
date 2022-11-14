package homeworks.hW221012;

public class Test {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Test test = new Test("Stephen");
        System.out.println(test.getName());
        changeName(test, "Thomas");
        System.out.println(test.getName());
        changeNameStupid(test);
        System.out.println(test.getName());
    }

    public static void changeName(Test objectIn, String newName) {
        objectIn.setName(newName);
    }

    public static void changeNameStupid(Test objectIn) {
        objectIn.getName();
        objectIn = new Test("Gregory");
    }
}
