
public class Main {

    public static void main(String[] args) {

        String numbers = "20 10 2 9 3";
        String[] numbersArray = numbers.split(" ");

        int totalSum = 1;
        for(String i : numbersArray) {
            int numSum = 0;
            int j = Integer.parseInt(i);
            while (j != 0) {
                numSum += j % 10;
                j /= 10;
            }
            totalSum *= numSum;
        }
        System.out.println(totalSum);
    }


}
