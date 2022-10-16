package Homeworks.hW221001.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int daysOff;
    private double salary;

    public Employee(String firstName, String lastName, int age, int daysOff, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.daysOff = daysOff;
        this.salary = salary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFine(int percent1To100) {
        if (percent1To100 < 25 && percent1To100 > 0) {
            throw new IllegalArgumentException("the fine can be between 0% and 25%.");
        }
        this.salary = this.salary - (this.salary * (percent1To100/100f));
    }

    public boolean setFineVerify(int percent1To100) {
        if (percent1To100 < 25 && percent1To100 > 0) {
            return false;
        }
        this.salary = this.salary - (this.salary * (percent1To100/100f));
        return true;
    }

    public void setDaysOffUsed(int daysToBeUsedUp) {
        if (daysToBeUsedUp > this.daysOff) {
            throw new IllegalArgumentException("you don't have enough days offs.");
        }
        this.daysOff -= daysToBeUsedUp;
    }

    public void printEmployeeInformation() {
        System.out.printf("Numele angajat: %1s" + "%n", this.getFullName());
        System.out.printf("Salariu: %14.2f" + "%n", this.salary);
        System.out.printf("Zile ramase: %5s" + "%n %n", this.daysOff);
    }
}
