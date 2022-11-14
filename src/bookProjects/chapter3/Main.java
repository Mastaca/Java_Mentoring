package bookProjects.chapter3;

public class Main {

    public static String ize;

    public static void main(String[] args) {

//        final int x = 10;
//        final Person p = new Person("Petrusel", "Gheorghe", 23);
//        p.setNume("Diana");
//        System.out.println(p.getNume() + " " + p.getPrenume());
//        p = new Person("a", "b");
        Car car = new Car(new Motor("xyz", 2));
        Motor motor = car.getMotor();
        motor.setNume("abc");
        String brand = car.getBrand();
        brand = "lkj";
        System.out.println(car.getMotor().getNume());
        System.out.println(car.getBrand());

        /*String name1 = "Fluffy";
        String name2 = new String("Fluffy");

        System.out.println(name1);
        System.out.println(name2);
        name1.concat(name2);
        System.out.println(name1);

        System.out.println(1+3+4+"a" + (5+6) + 5 + 6);

        System.out.println();

        ize+=5;
        System.out.println(ize);
        System.out.println(ize.length());
        System.out.println(ize.charAt(2));
        System.out.println(ize.indexOf('5'));
        System.out.println(ize.indexOf('x'));
        System.out.println(ize.indexOf("l5"));
        System.out.println(ize.indexOf('5', 1));
        System.out.println(ize.substring(3));
        System.out.println(ize.substring(1, 5));
        System.out.println(ize.substring(ize.indexOf('l')));
        ize+='N';
        System.out.println(ize);
        System.out.println(ize.toLowerCase());
        System.out.println(ize.toUpperCase());

        String egyenlo1 = "ABC123";
        String egyenlo2 = "abc123";
        System.out.println(egyenlo1.equals(egyenlo2));
        System.out.println("ABC123".equals(egyenlo2));
        System.out.println("abc123".equals(egyenlo2));
        System.out.println("abc123".equals("abc123"));
        System.out.println(egyenlo1.equalsIgnoreCase(egyenlo2));

        System.out.println();
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        System.out.println();
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        System.out.println();
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc
        System.out.println("abcabc".replace("ab", "AB")); // ABcABc

        System.out.println();
        System.out.println("abc".trim()); // abc
        System.out.println("a b c".trim()); // a b c
        System.out.println("\t a b c\n");
        System.out.println("\t a b c\n".trim()); // a b c
        System.out.println("z");

        System.out.println("Method Chaining: ".toUpperCase());
        String start = "AniMaL ";
        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); // "animal"
        String result = lowercase.replace('a', 'A'); // "AnimAl" -
        System.out.println(result);

        System.out.println();
        String result2 = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result2);

        String result3Try = "AniMaL  ";
        String result3 = result3Try.substring(0,1)
                                    .trim()
                                    .toLowerCase()
                                    .replace('a', 'A') +
                        result3Try.substring(1)
                                    .trim()
                                    .toLowerCase();
        System.out.println("result3 chained: " + result3);
        System.out.println("resultTry: "+result3Try);

        String test = "AniMaL  ";
        test.trim().toLowerCase().replace('a', 'A');
        System.out.println(test);*/

    }

}
