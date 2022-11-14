package homeworks.hW221001.triunghi;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle("Triangle 1", 5.4f, 6.8f, 3.1f);
        Triangle triangle2 = new Triangle("Triangle 2", 7.6f, 2.9f, 9.0f);
        Triangle triangle3 = new Triangle("Triangle 3", 0.9f, 3.2f, 7.5f);

        triangle1.printOutPerimeterAndAreaSides();
        triangle2.printOutPerimeterAndAreaSides();
        triangle3.printOutPerimeterAndAreaSides();
    }
}
