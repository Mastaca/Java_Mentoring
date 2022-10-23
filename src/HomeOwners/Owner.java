package HomeOwners;

public class Owner {

    public static int numberOfOwners;
    public String name;
    public int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addNumberOfOwners(Owner[] owners) {
        for (int i = 0; i < owners.length; i++) {
            if (this.equals(owners[i])) {
                System.out.println("The owner named " + this.name + ", aged " + this.age + " already exists in the database.");
                break;
            } else if (owners[i] == null) {
                owners[i] = this;
                numberOfOwners++;
                break;
            }
        }

        // TODO Check if the current owner(this) already exists in owners list. If it does not exist, add it in the array and increase
        // the number of owners. If it exists do nothing
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Owner) {
            Owner otherOwner = (Owner) obj;
            return this.name.equals(otherOwner.name) && this.age == otherOwner.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

/*
public class Owner {

    public String name;
    public int age;

    public static int numberOfOwners;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addNumberOfOwners(Owner[] owners) {
        // TODO Check if the current owner(this) already exists in owners list. If it does not exist, add it in the array and increase
        // the number of owners. If it exists do nothing]
        for(int i= 0; i<numberOfOwners;i++) {
            //  if (this.equals(owners[i])) {
            //     return;
            //  }
            if(this==owners[i]){
                return;
            }
        }
        owners[numberOfOwners] = new Owner(this.name, this.age);
        numberOfOwners++;
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
}*/
