package game;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        //citim de la tastatura numarul de jucatori
        //pentru fiecare jucator citim numele si tipul caracterului
        //alegem random un jucator care va ataca
        //jucatorul selectat alege jucatorul pe care il va ataca
        //cand un jucator ataca alt jucator, acestuia ii va scadea viata in functie de arma pe care o
        //foloseste si sansa de a lovi
        //cand un jucator a ajuns cu viata la 0 sau mai putin de 0 atunci el moare si este scos din lista de jucatori
        //jocul se termina cand ramane un singur jucator
        //caracterele vor fi handgun(damage 10, chance 60), shotgun(demage 40, chance 20),
        // rifle(demage 20, chance 70)
        Scanner scan = new Scanner(System.in);

        Map<String, Player> players = new HashMap<>();
        createPlayers(scan, players);

//        Player[] playersListToArray = players.values().toArray(new Player(players.get()));

        while (players.size() > 1) {
            selectAttack(scan, players);
        }
        Player[] remainingPlayer = players.values().toArray(new Player[1]);
        System.out.println("\n" + remainingPlayer[0].name + " IS THE WINNER!");
    }

    private static void createPlayers(Scanner scan, Map<String, Player> players) {

        System.out.println("Enter number of players");
        int numberPlayers = scan.nextInt();

        for (int i = 0; i < numberPlayers; i++) {
            System.out.println("Enter player name:");
            String playerName = scan.next();

            System.out.println("Choose character type: 1.Handgunner; 2.Shotgunner; 3.Rifleman");
            Player player = new Player(playerName, setCharacterType(scan.nextInt()));

            players.put(playerName, player);
        }
    }

    private static CharacterType setCharacterType(int chosenCharacterType) {
        CharacterType characterType;
        switch (chosenCharacterType) {
            case 1:
                characterType = new Handgunner();
                break;
            case 2:
                characterType = new Shotgunner();
                break;
            case 3:
                characterType = new Rifleman();
                break;
            default:
                characterType = new Handgunner();
                break;
        }
        return characterType;
    }

    private static void selectAttack(Scanner scan, Map<String, Player> players) {
        Random random = new Random();
        Object[] playersListToArray = players.values().toArray();
        Player[] playersArray = new Player[playersListToArray.length];

        for (int i = 0; i < playersListToArray.length; i++) {
            playersArray[i] = (Player) playersListToArray[i];
        }

        Player attackingPlayer = playersArray[random.nextInt(playersArray.length)];

        System.out.println("Next player to attack " + attackingPlayer.name);
        System.out.println("Choose a player to attack: " + attackingPlayer.targetedPlayer(players));

        Player attackedPlayer = players.get(scan.next());
        attackingPlayer.attack(attackedPlayer);

        verifyHealth(players, attackedPlayer);
    }

    private static void verifyHealth(Map<String, Player> players, Player attackedPlayer) {
        if (attackedPlayer.health <= 0){
            System.out.println(attackedPlayer.name + " has died.");
            players.remove(attackedPlayer.name);
            System.out.println("Remaining players: " + getRemainingPlayers(players));
        }
    }

    private static List<String> getRemainingPlayers(Map<String, Player> players) {
        List<String> remainingPlayerList = new ArrayList<>(players.size());
        players.forEach((key, value) -> remainingPlayerList.add(players.get(key).toString()));
        return remainingPlayerList;
    }

    private static List<String> getRemainingPlayersB(Map<String, Player> players) {
        Object[] playersToObjectArray = players.values().toArray();
        String[] playersToPlayersArray = new String[players.size()];
        for (int i = 0; i < playersToObjectArray.length; i++) {
            playersToPlayersArray[i] = (String) playersToObjectArray[i];
        }
        List<String> remainingPlayerList = new ArrayList<>(players.size());
        for (String i : playersToPlayersArray) {
            remainingPlayerList.add(i);
        }
        return remainingPlayerList;
    }

    private static List<String> getRemainingPlayersC(Map<String, Player> players) {
        Object[] x = players.values().toArray();
        String[] y = new String[players.size()];
        for (int i = 0; i < x.length; i++) {
            y[i] = (String) x[i];
        }
        List<String> remainingPlayerList = new ArrayList<>(players.size());
        Collections.addAll(remainingPlayerList, y);
        return remainingPlayerList;
    }

}
