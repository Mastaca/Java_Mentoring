package abstractClasses;

public abstract interface AbstractInterface {
    public static final int s = 0;
    public int g = 0;
    public abstract int getSomething();
    public default int getNumber() {
        return 10;
    }

    public static int ize() {
        return 0;
    }
}
