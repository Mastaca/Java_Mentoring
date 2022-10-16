package HomeOwners;

public class Owner {

    public String name;
    public int age;

    public static int numberOfOwners;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addNumberOfOwners(Owner[] owners) {
        for (Owner i: owners) {
            if (this.equals(i)) {
                System.out.println("The owner named " + this.name + ", aged " + this.age + " already exists in the database.");
                return;
            }
        }
        for (int i = 0; i < owners.length; i++) {
            if (owners[i] == null) {
                owners[i] = this;
            }
        }
        // TODO Check if the current owner(this) already exists in owners list. If it does not exist, add it in the array and increase
        // the number of owners. If it exists do nothing
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Owner) {
            Owner otherOwner = (Owner) obj;
            if(this.name.equals(otherOwner.name) && this.age == otherOwner.age) {
                return true;
            }
        }
        return false;
    }
}
