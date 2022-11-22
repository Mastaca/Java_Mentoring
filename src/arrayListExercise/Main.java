package arrayListExercise;

public class Main {

    /**
    /*
    sa cream mai multe masini
    un Owner sa aiba mai multe masini

    citim numarul ownerii si l-e creem
    afisam ownerii
    selectam un owner
    afisam trei posibilitati:   1.afiseaza lista de masin;
                                2. adaugam o masina;
                                3. stergem o masina
                                4. ne intoarcem la lista de owneri
     */

    //TODO sa terminam problema si s-o testam pana MARTI
    //hint: Owner este cheie in HashMap (ID este unic)

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainMenu();
    }

    /*private static void mainMenu(Menu menu,
                                 Scanner scan,
                                 Map<Owner, List<Car>> ownersCars) {
        menu.showMainMenu();

        System.out.print("Select an option: ");
        int selectedOption = scan.nextInt();
        switch (selectedOption) {
            case 1:
                menuCreateOwner(menu, scan, ownersCars);
                break;
            case 2:
                selectOwner(menu, scan, ownersCars);
                break;
            case 3:
                showOwners(ownersCars);
                System.out.println("Press any key to continue.");
                mainMenu(menu, scan, ownersCars);
                break;
            case 4:
                exitApplication();
                break;
        }
    }*/

    /*private static void selectOwner(Menu menu,
                                    Scanner scan,
                                    Map<Owner, List<Car>> ownersCars) {
        showOwners(ownersCars);
        int selectedOwnerId = scan.nextInt();
        for (Owner owner : ownersCars.keySet()) {
            if (owner.getId() == selectedOwnerId) {
                ownerMenu(menu, scan, ownersCars, owner);
            }
        }
    }

    private static void menuCreateOwner(Menu menu,
                                        Scanner scan,
                                        Map<Owner, List<Car>> ownersCars) {
        System.out.println("Please enter the Owners name: ");
        String name = scan.next();
        Owner owner = new Owner(name);
        ownersCars.put(owner, new ArrayList<>());
        System.out.println("New owner created.");
        mainMenu(menu, scan, ownersCars);
    }*/

    /*private static void ownerMenu(Menu menu,
                                  Scanner scan,
                                  Map<Owner, List<Car>> ownersCars,
                                  Owner selectedOwner) {
        System.out.println("Selected owner: " + selectedOwner.getId() + ". " + selectedOwner.getName());
        menu.showOwnerMenu();
        int selectedOption = scan.nextInt();
        switch (selectedOption) {
            case 1:
                showCarsList(menu, scan, ownersCars, selectedOwner);
                break;
            case 2:
                addCar(menu, scan, ownersCars, selectedOwner);
                break;
            case 3:
                deleteCar(menu, scan, ownersCars, selectedOwner);
                break;
            case 4:
                mainMenu(menu, scan, ownersCars);
                break;
        }
    }

    private static void showCarsList(Menu menu,
                                     Scanner scan,
                                     Map<Owner, List<Car>> ownersCars,
                                     Owner selectedOwner) {
        //TODO works
        List<Car> cars = ownersCars.get(selectedOwner);
        for (Car car : cars) {
            System.out.println((cars.indexOf(car) + 1) + ". Brand: " + car.getBrand() + ", Power: " + car.getPower());
        }
        ownerMenu(menu, scan, ownersCars, selectedOwner);
    }

    private static void addCar(Menu menu,
                               Scanner scan,
                               Map<Owner, List<Car>> ownersCars,
                               Owner selectedOwner) {
        //TODO works
        System.out.println("Enter car Brand: ");
        String brand = scan.next();
        System.out.println("Enter car power: ");
        int power = scan.nextInt();
        Car car = new Car(brand, power);
        List<Car> ownersCarsList = ownersCars.get(selectedOwner);
        ownersCarsList.add(car);
        ownerMenu(menu, scan, ownersCars, selectedOwner);
    }

    private static void deleteCar(Menu menu,
                                  Scanner scan,
                                  Map<Owner, List<Car>> ownersCars,
                                  Owner selectedOwner) {
        //TODO works
        System.out.println("Enter car Brand: ");
        String brand = scan.next();
        System.out.println("Enter car power: ");
        int power = scan.nextInt();
        Car car = new Car(brand, power);
        List<Car> ownersCarsList = ownersCars.get(selectedOwner);
        ownersCarsList.remove(car);
        ownerMenu(menu, scan, ownersCars, selectedOwner);
    }*/

    /*public static void showOwners(Map<Owner, List<Car>> ownerListCars) {
        for (Owner owner : ownerListCars.keySet()) {
            System.out.println(owner.getId() + ". " + owner.getName());
        }
    }*/

    /*private static void exitApplication() {
        System.out.println("Application is closed. Goodbye!");
    }*/
}
