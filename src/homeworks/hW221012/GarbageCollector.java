package homeworks.hW221012;

public class GarbageCollector {

    public static void main(String[] args) {
        GarbageCollector gc1 = new GarbageCollector();  //object1
        GarbageCollector gc2 = new GarbageCollector();  //object2
        GarbageCollector gc3 = null;
        gc1 = gc3;                                      // object1 eligible gc()
        GarbageCollector gc4 = new GarbageCollector();  //object3
        gc3 = gc4;                                      //gc3 = object3
        gc4 = gc2;                                      //gc4 = object2
        gc2 = gc1;                                      //gc2 = null
        GarbageCollector gc5 = new GarbageCollector();  // object 4
        gc3 = gc4;
        GarbageCollector gc6 = gc2;
        gc2 = gc1;
        gc6 = gc4;
    }
}