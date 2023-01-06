interface Tone {
    void up();
}

interface Test {
    void up();
}

public class Clasa {
    /*int a = 10;
    {
        System.out.println();
        if (a == 10) {
            throw new Exception("a");
        }
    }

    public Clasa() throws Exception{
        a= 10;
    }*/

    public static void main(String[] args) {
        Clasa s = new GoodSpeak();
        ((Tone)s).up();
//        ((Test)s).up();

    }
}

class GoodSpeak extends Clasa implements Tone {
    public void up() {
        System.out.println("UP UP UP");
    }
}

//        try {
//            File myObj = new File("filename.txt");
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }


//    public void a() {
//        int n = 1;
//        String local;
//        if (n > 1) local = "a";
//        System.out.println(local);
//    }

