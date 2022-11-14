package constructorChainingExample;

public class Gender extends Ethnicity {

    String gender;

    public Gender() {
        super();
        System.out.println("!");
    }

    public Gender(String gender) {
        super(null, 0, true, false, null, null);
        this.gender = gender;
        System.out.println("simple Gender constructor");
    }

    public Gender(String subOrder,
                  int limbNumber,
                  boolean bipedal,
                  boolean fur,
                  String eyeColour,
                  String hairColour,
                  String gender) {
        super(subOrder, limbNumber, bipedal, fur, eyeColour, hairColour);
        this.gender = gender;
        System.out.println("gender constructor");
        }



    public void printClassGender() {
        System.out.println(this.getClass() + " g");
    }

}
