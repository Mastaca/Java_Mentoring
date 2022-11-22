package game;

public abstract class CharacterType {
    public int damage;
    public int chance;
    public CharacterType(int damage, int chance){
        this.damage=damage;
        this.chance=chance;
    }
}
