package School;

public class Main {


    public static void main(String[] args) {
        Student a = new Student(
                "Gheorghe",
                " Viorel",
                'A',
                5,
                6,
                7);
        Student b = new Student(
                "Gheorghe",
                " Viorel",
                'A',
                9,
                10,
                7);

        a.displayMedianMarks();
        b.displayMedianMarks();
    }
}
