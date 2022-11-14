package bookProjects.chapter3;

final public class Person {

    private String nume;
    private String prenume;

    private int varsta;

    public Person(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getPrenume() {
        return prenume;
    }

    //    public void setNume(String nume) {
//        this.nume = nume;

//    }

//    public void setPrenume(String prenume) {
//        this.prenume = prenume;
//    }
}
