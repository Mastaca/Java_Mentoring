package homeworks.hW220930;

public class SevenBoom {

    public static String sevenBoom(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            while (inputArray[i] != 0) {
                if (inputArray[i]%10 != 7) {
                    inputArray[i] = inputArray[i] /10;
                }
                else return "Boom";
            }
        }
        return "there is no 7 in the array";
    }

    public static void main(String[] args) {
        int[] justAnArray = new int[] {1, 100, 3, 4, 5, 79999999, 8};
        System.out.println(sevenBoom(justAnArray));

    }
}
