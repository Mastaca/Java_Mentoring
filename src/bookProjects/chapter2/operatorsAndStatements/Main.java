package bookProjects.chapter2.operatorsAndStatements;

public class Main {

    public static void main(String[] args) {

        /*short a = 9;
        short b = a++; //a = 10
        System.out.println(b);
        System.out.println(b);
        System.out.println(a);
        short c = ++a;
        System.out.println(c);

        boolean enterFor = true;

        long t = 192301398193810323L;
        int z = (int) 9f;
        short u = (short)1921222; // u = 20678

        int g = 2147483647;
        System.out.println("Initial: " + g + ", Overflow: " + (g+1));
        g = -2147483648;
        System.out.println("Initial: " + g + ", Underflow: " + (g-1));

        double x = 39.21;
        float y = 2.1f;
        System.out.println(x+y);*/

        /*int x = 58;
        System.out.println(x++); //x = 59
        System.out.println(x); //x 59

        System.out.println(++x);
        System.out.println(x);*/

        /*SOMETHING_FISHY: {
            int x = 0;
            for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
                System.out.print(y + " ");
                break SOMETHING_FISHY;
            }
            System.out.print(x);
        }*/

        /*int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
                if(mySimpleArray[i] == 9) break OUTER_LOOP;
            }
            System.out.println();
        }*/


        /*int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                if(list[i][j]==searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if(positionX==-1 || positionY==-1) {
            System.out.println("Value "+searchValue+" not found");
        } else {
            System.out.println("Value "+searchValue+" found at: " +
                    "("+positionX+","+positionY+")");
        }*/



        double x = 15.486135789461D;
        System.out.println(x);

        long o = 15686515;
        long i = 15686515568435L;
        int p = 95667;

        byte b = 5;
        byte n = 10;
        int m = b*n;
        System.out.println(m);

        char a = 'a';
        a++;
        System.out.println(a);



    }

}
