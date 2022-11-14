package variableChanges;

public class Person {
    public String name;
    public int age;
    public String eyeColor;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public void changeEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void switchNames(Person p) {
        String nameAux = this.name;
        this.name = p.name;
        p.name = nameAux;
    }

    public Person mergePersons(Person p1, Person p2) {
        Person p = new Person();
        p2.switchNames(p1);
        this.age = p1.age;
        this.eyeColor = p2.eyeColor;
        return p;
    }




   /* public void changeNameAndAge(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }*/

}
