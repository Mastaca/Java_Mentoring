package bookProjects.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class javaArrayList {

    public static void main(String[] args) {

        /*ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();
        List<String> list6 = new ArrayList<>();
//        ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

        ArrayList list = new ArrayList();
        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, true]
        System.out.println(list); // [hawk, true]

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
//        safer.add(Boolean.TRUE); // DOES NOT COMPILE

        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        birds.add("x");
        System.out.println(birds); // [blue jay, cardinal, hawk, robin, x]
        System.out.println(birds.size());
        birds.add(5,"ch");
        System.out.println(birds);
        birds.add(5,"th");
        System.out.println(birds);

        List<ArrayList> birds2 = new ArrayList<>();
        birds2.add("hawk"); // [hawk]
        birds2.add("hawk"); // [hawk, hawk]
        System.out.println(birds2.remove("cardinal")); // prints false
        System.out.println(birds2.remove("hawk")); // prints true
        System.out.println(birds2.remove(0)); // prints hawk
        System.out.println(birds2); // []
//        List<String> test = new Collection<>();
        Iterable<Object> test4 = new ArrayList();
        Collection<Object> test2 = new ArrayList<>();
        Double a = new Double(3);
        int ab = 5;
        double bc  = a;

        List<String> birds3 = new ArrayList<>();
        birds3.add("hawk"); // [hawk]
        System.out.println(birds3.size()); // 1
        birds3.set(0, "robin"); // [robin]
        System.out.println(birds3.size()); // 1
        //birds3.set(1, "robin"); // IndexOutOfBoundsException

        ArrayList<String> testing = new ArrayList<>(10);
        System.out.println(testing.size());
        testing.add("a");
        System.out.println(testing.size());

         */

        /*String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> listtest = Arrays.asList(array); // returns fixed size list
        System.out.println(listtest.size()); // 2
        listtest.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        System.out.println();
        array[1] = "wabadabadubbdubb";
        for (String b : array) System.out.print(b + " ");
        System.out.println();
        for (String b : listtest) System.out.print(b + " ");
        System.out.println();
        listtest.set(0, "wolololo"); // [hawk, test]
        for (String b : array) System.out.print(b + " ");
        System.out.println();
        for (String b : listtest) System.out.print(b + " ");
        System.out.println();
//        listtest.remove(1); // throws UnsupportedOperation Exception

        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.add(99);
        System.out.println(numbers);*/

        /*
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2

        ArrayList<Integer> v = new ArrayList<>();
        v.add(5);
        v.add(4);
        v.set(1, 6);
        v.remove(0);
        for (int i: v) System.out.println(v);
        */

        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
//        ages.add(null);
        for (Integer age : ages)
            System.out.print(age);

        List<String> xy = new ArrayList<>();
        xy.add("what");
        xy.add("2");
        xy.add("what");
        Collections.sort(xy);

    }

}
