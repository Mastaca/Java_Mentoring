package constructorChainingExample;

public class Primates {

    String subOrder;
    int limbNumber;

    static {
        System.out.println("Primates static block");
    }

    public Primates() {
        System.out.println("asta");
    }

    public void setSubOrder(String subOrder) {
        this.subOrder = subOrder;
    }

    public void setLimbNumber(int limbNumber) {
        this.limbNumber = limbNumber;
    }

    public Primates(String subOrder, int limbNumber) {
        this.subOrder = subOrder;
        this.limbNumber = limbNumber;
        System.out.println("primates constructor");
    }

    public void printClassPrimates() {
        System.out.println(this.getClass()+ " p");
    }

}
