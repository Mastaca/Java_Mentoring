package arrayListExercise;

public class Owner {

    private String name;
    private int id;
    private static int idCount = 0;

    public Owner(String name) {
        this.name = name;
        this.id = ++Owner.idCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
