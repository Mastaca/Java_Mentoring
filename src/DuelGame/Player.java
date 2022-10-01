package DuelGame;

import java.util.Random;

public class Player {
    public String playerName;
    public String playerWeapon;
    public int health = 100;
    public Weapon[] weapons;
    public Player otherPlayer;

    public void displayHealth() {
        System.out.println(this.playerName + " has " + this.health + " remaining");
        System.out.println();
    }
    public void displayAttackingPlayer() {
        System.out.println("Selected player to attack is: " + this.playerName);
    }
    public void displayAttack() {
        System.out.println(this.playerName + " attacked " + otherPlayer.playerName + " with " + this.playerWeapon);
    }

    public int attackWithWeapon() {
        for (int i = 0; i < weapons.length; i++) {
            if (this.playerWeapon.equals(weapons[i].weaponName)) {
                int success = new Random().nextInt(weapons[i].weaponChance);
                if (success == 0) {
                    this.displayAttack();
                    otherPlayer.health -= weapons[i].weaponDamage;
                }
            }
        }
        return otherPlayer.health;
    }

    public int displayAndAttack() {
        this.displayAttackingPlayer();
        otherPlayer.health = attackWithWeapon();
        return otherPlayer.health;
    }
}