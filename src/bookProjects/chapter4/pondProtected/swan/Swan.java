package bookProjects.chapter4.pondProtected.swan;

import bookProjects.chapter4.pondProtected.shore.Bird;

public class Swan extends Bird { // but subclass of bird
    public void swim() {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text);// package access to superclass
    }

    /*public void helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater(); // DOES NOT COMPILE
        ystem.out.println(other.text); // DOES NOT COMPILE
    }*/
}
