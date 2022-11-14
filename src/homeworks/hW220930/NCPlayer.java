package homeworks.hW220930;

public class NCPlayer {
    public String name;
    public int[] numbers;
    public int biggestNumber;
    public int secondBiggestNumber;

    public void findTwoBiggestNumber () {
        for (int number : this.numbers) {
            if (number > this.biggestNumber) {
                if (this.biggestNumber > this.secondBiggestNumber) {
                    this.secondBiggestNumber = this.biggestNumber;
                }
                this.biggestNumber = number;
            }
        }
    }

}
