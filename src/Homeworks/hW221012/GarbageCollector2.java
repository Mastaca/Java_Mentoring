package Homeworks.hW221012;

public class GarbageCollector2 {

    public static void main(String[] args) {
        GarbageCollector2 gc1 = new GarbageCollector2();
        GarbageCollector2 gc2 = new GarbageCollector2();
        GarbageCollector2 gc3 = null;
        gc1 = gc3;
        GarbageCollector2 gc4 = new GarbageCollector2();
        gc3 = gc4;
        gc4 = gc2;
        gc2 = metod1(gc1, gc2);
        gc2 = gc1;
        gc1 = gc3;
        gc1 = metod2(gc1, gc4, gc3);
    }

    public static GarbageCollector2 metod1(GarbageCollector2 gc1, GarbageCollector2 gc2) {
        GarbageCollector2 gc3 = new GarbageCollector2();
        gc1 = gc2;
        gc3 = gc2;
        gc2 = new GarbageCollector2();
        gc1 = gc3;
        return new GarbageCollector2();
    }

    public static GarbageCollector2 metod2(GarbageCollector2 gc1, GarbageCollector2 gc2, GarbageCollector2 gc3) {
        gc3 = new GarbageCollector2();
        gc2 = new GarbageCollector2();
        gc1 = gc3;
        gc2 = gc1;
        gc1 = new GarbageCollector2();
        return gc1;
    }
}