package constructorChainingExample;

public class Ethnicity extends HomoSapiens {

    String eyeColour;
    String hairColour;

//    static {
//        System.out.println("Ethnicity block static");
//    }

    {
        System.out.println("Ethnicity instance block");
    }

    public Ethnicity() {
        super();
        System.out.println("interesant");
    }

    public Ethnicity(String eyeColour, String hairColour) {
        super(null, 0, false, false);
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
        System.out.println("simple Ethnicity constructor");
    }

    public Ethnicity(String subOrder, int limbNumber, boolean bipedal, boolean fur, String eyeColour, String hairColour) {
        super(subOrder, limbNumber, bipedal, fur);
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
        System.out.println("ethnicity constructor");
    }

    public void printClassEthnicity() {
        System.out.println(this.getClass() + " e");
    }

}
