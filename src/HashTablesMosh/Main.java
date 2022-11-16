package HashTablesMosh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String text = "a green apple";
        Map<Character, Integer> textMap = new HashMap<>();

        char[] chars = text.toCharArray();

        for (char ch : chars) {
            /*if (textMap.containsKey(ch)) {
                int count = textMap.get(ch);
                textMap.put(ch, count);
            } else
                textMap.put(ch, 1);*/

            int count = textMap.containsKey(ch) ? textMap.get(ch) : 0;
            textMap.put(ch, count + 1);
        }

        for (char ch : chars) {
            if (textMap.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
//        System.out.println(textMap);

    }

}
