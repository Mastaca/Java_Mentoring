package VariableChanges;

public class Main {

    /*public static void main(String[] args) {

        Person p = new Person("Edi", 25, "negru");
        Person p2 = new Person();
        int age = 25;
        boolean isMale = true;

        p.changeNameAndAge("Diana",30);
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.eyeColor);
        changeAge(age, 50);
        System.out.println(age);
        changeGender(isMale, false);
        System.out.println(isMale);

    }

    public static void changeAge(int age, int newAge) {
        age = newAge;
    }

    public static void changeGender(boolean isMale, boolean newGender) {
        isMale = newGender;
    }*/

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Diana", 25);
        Person p3 = new Person("Stefan", 30, "verde");
        p2.name = "Edi";
        p1.age = 50;
        p1.eyeColor = "albastru";
        p1.changeEyeColor("negru");
        p2.changeEyeColor("albastru");
        p2.switchNames(p3);
        p1.mergePersons(p2, p3);
        p2 = p1.mergePersons(p2, p3);
        p3 = p2.mergePersons(p1, p3); // acasa
    }

/*    public static void changeEyeColor(Person p, String eyeColor) {
        p.eyeColor = eyeColor;
    }

    public static void switchNames(Person p1, Person p2) {
        String nameAux = p1.name;
        p1.name = p2.name;
        p2.name = nameAux;
    }

    public static Person mergePersons(Person p1, Person p2, Person p3) {
        Person p = new Person();
        switchNames(p1, p2);
        p.age = p2.age;
        p.eyeColor = p3.eyeColor;
        return p;
    }*/

}
