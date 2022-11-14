package constructorChainingExample;

public class Main {

    /*public Main (String args) {
        System.out.println("do something");
    }

    public Main() {
        this(25);
        System.out.println("\nSimple constructor");
    }

    public Main(int a) {
        this(25,85);
        System.out.println("\nValue of a: " + a);
    }

    public Main(int a, int b) {
        System.out.println("\nValue of a: " + a);
        System.out.println("Value of b: " + b);
    }*/

    public static void main(String[] args) {

        /*System.out.println("main1:");
        Main main1 = new Main();
        System.out.println("\nmain2:");
        Main main2 = new Main(4);
        System.out.println("\nmain3:");
        Main main3 = new Main(99, 69);*/

//        System.out.println("-creating genderSimple:");
//        Gender genderSimple = new Gender();

        Gender gender1 = new Gender("helicopter");

//        HomoSapiens human1 = new HomoSapiens("hominina", 4, true, false);

        /*
        System.out.println("-creating primates1:");
        Primates primate1 = new Primates("Hominina", 4);
//        System.out.println("\n-creating primates2:");
//        Primates primates2 = new Gender("hominina", 4, true, false, "blue", "white", "male");
//        System.out.println("\n-creating homo1:");
//        HomoSapiens homo1 = new HomoSapiens("hominina", 4, true, false);
        System.out.println("\n-creating gender1:");
        Gender gender1 = new Gender("hominina", 4, true, false, "blue", "white", "male");
        System.out.println("\n-creating gender2:");
        Gender gender2 = new Gender("female");

        System.out.println();

        System.out.println(gender1.subOrder);
        System.out.println(gender2.subOrder);

        gender2.setSubOrder("something");
        System.out.println(gender2.subOrder);

        Gender gender3 = new Gender();
        */

        /*primate1.printClassPrimates();
        homo1.printClassPrimates();
        homo1.printClassHomoSapiens();
        gender1.printClassEthnicity();
        gender1.printClassGender();

        System.out.println();

        System.out.println(primate1.subOrder+ ", " + primate1.limbNumber);

        System.out.println(""+ homo1.bipedal + ", " + gender1.subOrder);

        System.out.println(gender1.gender + ", " + gender1.subOrder);*/

    }

}
