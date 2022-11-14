package homeOwners;

public class Main {

    public static void main(String[] args) {
        //???abstractie la tot main-ul

        Owner[] owners = new Owner[10];
        Owner owner1 = new Owner("Edi", 30);
        owner1.addNumberOfOwners(owners);
        Door entranceDoor1 = new Door("white", 190);
        Door bedroomDoor1 = new Door("black", 180);
        Bedroom bedroom1 = new Bedroom(20, 2, 2, bedroomDoor1);
        Kitchen kitchen1 = new Kitchen(22, 2, 4);
        Home home1 = new Home("Home1", "Bucuresti,12", owner1, entranceDoor1, bedroom1, kitchen1);

        Owner owner2 = new Owner("Stefan", 31);
        owner2.addNumberOfOwners(owners);

        Owner owner3 = new Owner("Petru", 35);
        owner3.addNumberOfOwners(owners);

        Door entranceDoor3 = new Door("white", 190);
        Door bedroomDoor3 = new Door("yellow", 180);
        Bedroom bedroom3 = new Bedroom(40, 2, 4, bedroomDoor3);
        Kitchen kitchen3 = new Kitchen(23, 2, 4);
        Home home3 = new Home("Home3", "Bacau,12", owner3, entranceDoor3, bedroom3, kitchen3);

        Owner owner4 = new Owner("Petru", 35);
        owner4.addNumberOfOwners(owners); //exista deja, nu se adauga

        Owner owner5 = new Owner("Diana", 18);
        owner5.addNumberOfOwners(owners);

        Owner owner6 = new Owner("Diana", 18);
        owner6.addNumberOfOwners(owners);
        Door entranceDoor6 = new Door("white", 222);
        Door bedroomDoor6 = new Door("blue", 180);
        Bedroom bedroom6 = new Bedroom(40, 5, 4, bedroomDoor6);
        Kitchen kitchen6 = new Kitchen(23, 2, 4);
        Home home6 = new Home("Home3", "Constanta,12", owner5, entranceDoor6, bedroom6, kitchen6);

        for (Owner i :owners) {
            if (i != null) System.out.println(i.toString());
            else System.out.println(i);
        }
        System.out.println(Owner.numberOfOwners);
    }

    /*public static void main(String[] args) {

        Owner[] owners = new Owner[10];
        Owner owner1 = new Owner("Edi",30);

        Owner owner2 = new Owner("Stefan",31);
        owner2.addNumberOfOwners(owners);

        Owner owner3 = new Owner("Petru",35);
        owner3.addNumberOfOwners(owners);

        Owner owner4 = new Owner("Petru",35);
        owner4.addNumberOfOwners(owners);

        Owner owner5 = new Owner("Diana",18);
        owner5.addNumberOfOwners(owners);

        Owner owner6 =owner5;
        owner6.addNumberOfOwners(owners);

        System.out.println(Owner.numberOfOwners);
    }*/

}
