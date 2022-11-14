package bookProjects.chapter2.reviewQuestions;

public class Main {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        int a = 3;
        int b = 7;
        int[] nrs = new int[]{2, 5, 10, 12, 23, 5, 6, 9, 3, 5};

        int xx = (3%--b + a++/7 == 7%nrs[b++]) && !x ? (nrs[--a]*2+3/2 % (a--/++b%(7/3+8%3))) / nrs[2]  : (!y || x && (7/10%++a) % 2 == a/b) ? 10 : 5;

        System.out.println(xx);

        /*
        (3 % 6 + 3 / 7 == 7 % 6) && false ? (12 * 2 + 3 / 2 % (3 / 8 %(7 / 3 + 8 % 3))) / 10  : (true || true && (7 / 10 % 3) % 2 == 3 / 8) ? 10 : 5;
        (3 + 0 == 1) && false ? (24 + 1 % (3 / 8 % (2 + 2))) / 10  : (true || true && (0 % 3) % 2 == 0) ? 10 : 5;
        (3 == 1) && false ? (24 + 1 % (0 % 4)) / 10  : (true || true && 0 % 2 == 0) ? 10 : 5;
        false && false ? (24 + 1 % 0) / 10  : (true || true && true) ? 10 : 5;
        false && false ? (24 + 1 % 0) / 10  : (true || true && true) ? 10 : 5;      //error, will count 1 % 0 as 0
                               error
        false && false ? 24 / 10  : (true || true && true) ? 10 : 5;
        false && false ? 2  : ((true || true && true) ? 10 : 5);
        false ? 2  : ((true || true && true) ? 10 : 5);
        (true && true) ? 10 : 5
        true ? 10 : 5
        returns 10
         */

        /* varianta clasa
        int xx = false && !x ? (nrs[--a]*2+3/2 % (a--/++b%(7/3+8%3))) / nrs[2]  : (!y || x && (7/10%++a) % 2 == a/b) ? 10 : 5;

        3%--b + a++/7 == 7%nrs[b++] // a = 3, b = 7
        3 % 6 + 3 / 7 == 7 % 6     // a = 4, b = 7
        3 % 6 + 3 / 7 == 7 % 6     // a = 4, b = 7
        3 + 0 == 1
        3 == 1
        false

        nrs[--a]*2+3/2 % (a--/++b%(7/3+8%3))     // a = 4, b = 7
        nrs[3] * 2 + 3 / 2 % (3 / 8 % (7 / 3 + 8 % 3))     // a = 2, b = 8

         */

        /* // varianta test
        false && !x ? 21 / nrs[2]  : (!y || x && (7/10%++a) % 2 == a/b) ? 10 : 5

        */

        /*
        (3%--b + a++/7 == 7%nrs[b++]) && !x ? (nrs[--a]*2+3/2 % (a--/++b%(7/3+8%3))) / nrs[2]  : (!y || x && (7/10%++a) % 2 == a/b) ? 10 : 5
        (3%--b + a++/7 == 7%nrs[b++])  //b = 8
        3 % 7 + 4 / 7 == 7 % 9  //b = 7, a = 4
        3 + 0 == 7
        3 == 7
        false


        nrs[--a]*2+3/2 % (a--/++b%(7/3+8%3))
        nrs[--a]*2+3/2 % (a-- / ++b % (2 + 2))
        nrs[--a]*2+3/2 % (a-- / ++b % 4)
        nrs[--a]*2+3/2 % (4 / 9 % 4)   // a = 3, b = 9
        nrs[--a]*2+3/2 % (0 % 4)   // a = 3, b = 9
        nrs[--a]*2+3/2 % 0   // a = 3, b = 9
        nrs[2]*2+3/2 % 0   // a = 2, b = 9
        10 * 2 + 3 / 2 % 0   // a = 2, b = 9
        20 + 1 % 0   // a = 2, b = 9
        20 + 1   // a = 2, b = 9
        21    // a = 2, b = 9

        !y || x && (7/10%++a) % 2 == a/b  // a = 2, b = 9
        !y || x && ( 0 % ++a) % 2 == a/b  // a = 2, b = 9
        !y || x && ( 0 % 3) % 2 == a/b  // a = 3, b = 9
        !y || x && ( 0 % 3) % 2 == a/b  // a = 3, b = 9


        */


        /*char x = 'a';
        byte y = 5;
        char sum = (char) (x+y);*/

        /*List<Integer> values = Arrays.asList(Integer.valueOf(0), Integer.valueOf(1));
        values.add(Integer.valueOf(2));

        for(java.util.Iterator<Integer> i = values.iterator(); i.hasNext(); ) {
            int value = i.next();
            System.out.print(value + ", ");
        }*/

        /*long x = 10;
        int y = 2 * x;*/

        /*int x = 4;
        long y = x * 4 - x++;
        if(y<10) System.out.println("Too Low");
        else System.out.println("Just right");
        else System.out.println("Too High");*/

        /*//7
        int x = 5;
        System.out.println(x > 2 ? (x < 4 ? 10 : x++) : x--);
        System.out.println(x);*/

        /*//8
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);
        System.out.println(x + ", " + y + ", " + z);*/

        /*//9
        for (int i = 0; i < 10; ) {
            i = i++; //????????????? shouldn't "i" first be assigned original "i" but then incremented??????
            System.out.println(i);
        }*/

        /*//10
        byte a = 40, b = 50;
        byte sum = (byte) a + b;
        System.out.println(sum);*/

        /*//11
        System.out.println(5 * 4 % 3);
        */

        /*//15
        int x = 1, y = 15;
        while (x < 10)
            y--;
            x++;*/

    }

}
