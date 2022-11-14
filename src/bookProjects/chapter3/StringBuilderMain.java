package bookProjects.chapter3;

public class StringBuilderMain {

    public static void main(String[] args) {

        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);
        System.out.println(alpha.length());

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true

        StringBuilder sb2 = new StringBuilder("animals");
        sb2.insert(7, "-"); // sb = animals-
        sb2.insert(0, "-"); // sb = -animals-
        sb2.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("abcdef");
        sb3.delete(1, 3); // sb = adef
        System.out.println(sb3);
        sb3.deleteCharAt(2); // sb = adf
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("ABC");
        sb4.reverse();
        System.out.println(sb4);

        String s = sb4.toString();
        System.out.println(sb4.getClass() + "||||" + s.getClass());

    }

}
