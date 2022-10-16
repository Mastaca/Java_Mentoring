package Homeworks;

public class Testing {

    private String name = "Fluffy";
    {
        System.out.println("just testing");
    }

    /*{
        name = "nothing";
    }*/

    public static void main(String[] args) {
        Testing test = new Testing();
        System.out.println(test.name);
    }
}
