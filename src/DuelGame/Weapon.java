package DuelGame;

public class Weapon {
    public String weaponName;
    public int weaponDamage;
    public byte weaponChance;

    public Weapon(String weaponName, int weaponDamage, byte weaponChance) {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.weaponChance = weaponChance;
    }
}
