package bookProjects.chapter4.pondProtected.duck;

import bookProjects.chapter4.pondProtected.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater(); // DOES NOT COMPILE
    }
}
