package bookProjects.chapter3;

public class Exercise {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "a";
        String s2test = new String("a").intern();
        String s3 = s2test + "b"; //compile time: s2test + "b"      runtime: "a" + "b"
        String s4 = "ab";
        String s5 = "abc";
        String s6 = "abc";
        String s7 = "a" + "b";  // compile time: "ab"

        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //true
        System.out.println((s1+"c") == s1.concat("c")); //false
        System.out.println(s1.concat("c") == "abc");    //false
        System.out.println(s5 == s6);   //true
        System.out.println(s1.equals(s3));  //true
        System.out.println(s1 == "a" + "b");    //true
        System.out.println(s1 == "a".concat("b").intern()); //true

        System.out.println(s1 == s3);   //false
        System.out.println(s2 == s2test);   //true
        System.out.println(s1 == "a" + "b");    //true
        System.out.println("a".concat("b") == "a" + "b");   //false

    }
}
