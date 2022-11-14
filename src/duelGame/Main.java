package duelGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    adaugam 2 jucatori si fiecare jucator va selecta o arma (cutit/pistol)
    viata fiecaruia este la inceput 100
    random se alege un jucator care l va ataca pe celalalt
    cutitul scade viata cu 10//pistolul scade cu 20
    sansa de lovire a cutitului este de 100%, iar sansa pistolului este de 50%
    jocul se termina cand un jucator a ajuns cu viata mai mica sau egala cu 0
    */

    /*public static int attackWithKnife(Player attackingPlayer, Player attackedPlayer) {
        attackingPlayer.displayAttack(attackedPlayer);
        attackedPlayer.health -= 10;
        return attackedPlayer.health;
    }
    public static int attackWithGun(Player attackingPlayer, Player attackedPlayer) {
        int success = new Random().nextInt(2);
        if (success == 0) {
            attackingPlayer.displayAttack(attackedPlayer);
            attackedPlayer.health -= 20;
        }
        return attackedPlayer.health;
    }
    public static int displayAndAttack(Player attackingPlayer, Player attackedPlayer) {
        attackingPlayer.displayAttackingPlayer();
        if (attackingPlayer.playerWeapon.equals("knife")) {
            attackedPlayer.health = attackWithWeapon(attackingPlayer, attackedPlayer);
        } else if (attackingPlayer.playerWeapon.equals("gun")) {
            attackedPlayer.health = attackWithGun(attackingPlayer, attackedPlayer);
        }
        return attackedPlayer.health;
    }*/

    public static void main(String[] args) {
        Player player1=new Player();
        Player player2= new Player();

        Weapon knife = new Weapon("knife", 10, (byte)1);
        Weapon gun = new Weapon("gun", 20, (byte)2);

        Weapon[] weapons = new Weapon[]{knife, gun};

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter Player 1 name:");
        player1.playerName = cin.next();
        System.out.println("Select Player 1 weapon (knife/handgun):");
        player1.playerWeapon = cin.next();
        System.out.println("Enter Player 2 name:");
        player2.playerName = cin.next();
        System.out.println("Select Player 2 weapon(knife/handgun):");
        player2.playerWeapon = cin.next();

        player1.weapons = weapons;
        player2.weapons = weapons;

        player1.otherPlayer = player2;
        player2.otherPlayer = player1;

        System.out.println("The duel between" + player1.playerName + " with " + player1.playerWeapon +
                            " and " + player2.playerName + " with " + player2.playerWeapon + " begins");

        while (player1.health > 0 && player2.health > 0) {
            player1.displayHealth();
            player2.displayHealth();
            int selectedPlayer = new Random().nextInt(2) + 1;
            if (selectedPlayer == 1) {
                player2.health = player1.displayAndAttack();
            } else {
                player1.health = player2.displayAndAttack();
            }
        }
        if (player1.health > 0)
            System.out.println("Winner is " + player1.playerName);
        else
            System.out.println("Winner is " + player2.playerName);
    }
}