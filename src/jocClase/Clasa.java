package jocClase;

public class Clasa {
    public String nume;
    public String numeLiceu;
    public Elev[] elevi;

    public float mediaClasei() {
        float suma = 0f;
        for (int i = 0; i < this.elevi.length; i++) {
            suma += this.elevi[i].medie;
        }
        return suma / this.elevi.length;
    }
}
