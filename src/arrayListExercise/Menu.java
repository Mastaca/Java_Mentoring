package arrayListExercise;

import java.util.*;

public class Menu {

    private final Scanner scan = new Scanner(System.in);
    private final List<Owner> owners = new ArrayList<>();
    private Owner selectedOwner;

    void showMainMenu() {
        System.out.println("1. Create new owner \n" +
                            "2. Select owner \n" +
                            "3. Show owners list\n" +
                            "4. Exit\n");
    }

    void showOwnerMenu() {
        System.out.println("1. Show car list \n" +
                            "2. Add a new car \n" +
                            "3. Delete a car\n" +
                            "4. Go to main menu\n");
    }

    public void mainMenu() {
        this.showMainMenu();

        System.out.print("Select an option: ");
        int selectedOption = scan.nextInt();
        switch (selectedOption) {
            case 1:
                menuCreateOwner();
                break;
            case 2:
                selectOwner();
                break;
            case 3:
                showOwners();
                System.out.println("Press any key to continue.");
                mainMenu();
                break;
            case 4:
                exitApplication();
                break;
        }
    }

    private void selectOwner() {
        showOwners();
        int selectedOwnerId = scan.nextInt();
        for (Owner owner : owners) {
            if (owner.getId() == selectedOwnerId) {
                this.selectedOwner = owner;
                ownerMenu();
            }
        }
    }

    private void menuCreateOwner() {
        System.out.println("Please enter the Owners name: ");
        String name = scan.next();
        Owner owner = new Owner(scan, name);
        owners.add(owner);
        System.out.println("New owner created.");
        mainMenu();
    }

    private void showOwners() {
        for (Owner owner : owners) {
            System.out.println(owner.getId() + ". " + owner.getName());
        }
    }

    private void ownerMenu() {
        System.out.println("Selected owner: " + selectedOwner.getId() + ". " + selectedOwner.getName());
        showOwnerMenu();
        int selectedOption = scan.nextInt();
        switch (selectedOption) {
            case 1:
                showCarsList();
                break;
            case 2:
                selectedOwner.addCar();
                ownerMenu();
                break;
            case 3:
                selectedOwner.deleteCar();
                ownerMenu();
                break;
            case 4:
                mainMenu();
                break;
        }
    }

    private void showCarsList() {
        //TODO works
        List<Car> cars = selectedOwner.getOwnersCars();
        for (Car car : cars) {
            System.out.println((cars.indexOf(car) + 1) + ". Brand: " + car.getBrand() + ", Power: " + car.getPower());
        }
        ownerMenu();
    }

    private void exitApplication() {
        System.out.println("Application is closed. Goodbye!");
    }

}
