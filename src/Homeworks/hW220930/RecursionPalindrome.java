package Homeworks.hW220930;

public class RecursionPalindrome {

    public static boolean checkPalindrome (String text, int start, int end) {
        if (start == end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        if (start < end + 1)
            return checkPalindrome(text, start + 1, end - 1);
        return true;
    }
    // ?????
    public static boolean isPalindrome(String inputWord) {
        if (inputWord.length() == 0) return true;
        return checkPalindrome(inputWord, 0, inputWord.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("addaa"));
    }
}
