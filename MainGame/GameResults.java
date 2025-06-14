package MainGame;
import GameCharacters.Characters;

public class GameResults {
    public static void displayResults(Characters player, Characters villain){
        System.out.println("---------- Results ----------");
        if (player.isAlive()){
            System.out.println(player.getName() + " wins the battle!");
            System.out.println(villain.getName() + " has been defeated!");
        }
        else{
            System.out.println(villain.getName() + " wins the battle!");
            System.out.println(player.getName() + " has been defeated!");
        }
    }
}
