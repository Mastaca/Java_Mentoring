package game;

import java.util.*;

public class Player {
    public String name;
    public CharacterType type;
    public int health = 100;


    public Player(Collection<Player> values) {

    }

    public Player(String name, CharacterType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void attack(Player attackedPlayer) {
        Random random = new Random();
        int randomNumber = random.nextInt(20);
        boolean hit = randomNumber <= type.chance;
        if (hit) {
            attackedPlayer.health -= type.damage;
            System.out.println(this.name + " attacked " + attackedPlayer.name);
            System.out.println(attackedPlayer.name + " has " + attackedPlayer.health + " health remaining");
        } else {
            System.out.println(this.name + " missed");
        }
    }

    public List<String> targetedPlayer(Map<String, Player> players) {
        List<String> playersEligibleForAttack = new ArrayList<>();
        for (String i : players.keySet()) {
            if (!i.equals(this.name)) {
                playersEligibleForAttack.add(i);
            }
        }
        return playersEligibleForAttack;
    }
}
