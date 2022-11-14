package bookProjects.chapter3;

public class Motor {

    private String nume;
    private int putere;

    public Motor(String nume, int putere) {
        this.nume = nume;
        this.putere = putere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }
}
