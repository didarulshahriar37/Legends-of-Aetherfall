package MainGame;
import GameCharacters.Characters;

public class GameStats{
    public static void displayStats(Characters player, Characters villain){
        System.out.println("--------- Game Stats ---------");
        System.out.println(player.getName() + " - Health: " + player.getHealth() + ", Power: " + player.getPower());
        System.out.println(villain.getName() + " - Health: " + villain.getHealth() + ", Power: " + villain.getPower());
    }        
}
