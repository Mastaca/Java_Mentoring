package CourseExercises;


public class Main {
    public static boolean verificareStringWhile(String[] textUnu, String[] textDoi) {
        int i = 0;
        if (textUnu.length == textDoi.length) {
            while (i < textDoi.length) {
                if (textUnu[i] == textDoi[i]) {
                    i++;
                } else return false;
            }
            return true;
        } else return false;
    }

    public static boolean verificareStringFor(String[] textUnu, String[] textDoi) {
        if (textUnu.length == textDoi.length) {
            for (int i = 0; i < textUnu.length; i++) {
                if (textUnu[i] != textDoi[i]) return false;
            }
        return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        String[] a = new String[] {"a", "b", "c"};
        String[] b = new String[] {"a", "b", "c"};
        System.out.println(verificareStringWhile(a, b));
        System.out.println(verificareStringFor(a, b));
    }
}
