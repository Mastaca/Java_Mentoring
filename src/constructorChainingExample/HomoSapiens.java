package constructorChainingExample;

public class HomoSapiens extends Primates{

    boolean bipedal;
    boolean fur;

    static {
        System.out.println("HomoSapiens static block");
    }

    {
        System.out.println("HomoSapiens instance block");
    }

    public HomoSapiens() {
        super();
        System.out.println("pare");
    }

    public HomoSapiens(String subOrder, int limbNumber, boolean bipedal, boolean fur) {
        this(true, true);
        this.bipedal = bipedal;
        this.fur = fur;
        System.out.println("homoSapiens constructor");
    }

    public HomoSapiens(boolean bipedal, boolean fur) {
//        super(null, 0);
        this.bipedal = bipedal;
        this.fur = fur;
        System.out.println("simple HomoSapiens constructor");
    }

    public void printClassHomoSapiens() {
        System.out.println(this.getClass() + " h");
    }

}
