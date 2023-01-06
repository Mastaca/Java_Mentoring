package innerClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        /*Greetings greeting = new Greetings () {
            public void Welcome() {
                System.out.println("Welcome");
                s();
            }

            public void s() {
                System.out.println("sss");
            }
        };

        Greetings greeting3 =  new NewClass();
//        greeting3.s();
        Greetings greeting2 = new Greetings ();
//        greeting.s();
        greeting.Welcome();
        greeting2.Welcome();*/

        /*Function<Integer, Float> function = (a) -> a * (a + 1) / 2.0f;
        System.out.println(function.apply(5));

        BiFunction<List<String>,String,Boolean> biFunction = (arrList, str) -> arrList.contains(str);

        List<String> l = new ArrayList<>();
        l.add("Ana");
        l.add("Petru");
        System.out.println(biFunction.apply(l, "Ana"));*/

//        System.out.printf(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.printf(reverseWords("     "));
    }

    public static String reverseWords(final String original)
    {
        // Have at it
        int allSpaces = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ' ') ++allSpaces;
        }
        if (allSpaces == original.length()) return original;

        String newString = "";
        String[] stringToList = original.split(" ");
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < stringToList.length; i++) {
            word.append(stringToList[i]);


            if (i == stringToList.length - 1) {
                newString += word.reverse();
            } else {
                newString += word.reverse() + " ";
            }
            word.delete(0, word.length());
        }

        return newString;
    }

    public static String rev(int n) {
        if (n == 0) return n + "";
        else if (n > 0) {
            StringBuilder a = new StringBuilder(n + "");
            return a.reverse().toString();
        } else {
            StringBuilder a = new StringBuilder(n + "");
            return (a.substring(0, 1).toString() + a.deleteCharAt(0).reverse().toString());
        }
    }

}
