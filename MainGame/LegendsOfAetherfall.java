package MainGame;
import GameCharacters.*;
import GameCharacters.Heroes.*;
import GameCharacters.Villains.*;

import java.util.Scanner;

public class LegendsOfAetherfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Characters player = null;
        Characters villain = null;
        
        System.out.println("Choose a character: 1.Mage 2.Archer 3.Warrior");
        System.out.print("> ");
        int hero = sc.nextInt();
        sc.nextLine();
        String heroName;        
        if (hero == 1){
            heroName = "Mage";
        }
        else if (hero == 2){
            heroName = "Archer";
        }
        else{
            heroName = "Warrior";
        }
        System.out.println("You've chosen " + heroName);

        System.out.println("Enter your " + heroName + " name");
        System.out.print("> ");
        String playerName = sc.nextLine();
        if (hero==1){
            player = new Mage(playerName);
        }
        else if (hero==2){
            player = new Archer(playerName);
        }
        else{
            player = new Warrior(playerName);
        }


        System.out.println("Choose a villain to fight against:\n1. Dark Overlord\n2. Regional Warlord\n3. Corrupted Mortal");
        System.out.print("> ");
        int villainChoice = sc.nextInt();
        sc.nextLine();
        if (villainChoice == 1){
            villain = new DarkOverlord();
        }
        else if (villainChoice == 2){
            villain = new RegionalWarlord();
        }
        else{
            villain = new CorruptedMortal();
        }

        System.out.println(player.getName() + " the " + heroName + " enters the world of Aetherfall!");
        System.out.println(villain.getName() + " rises to spread chaos!");
        System.out.println("Battle Start!");

        while (player.isAlive() && villain.isAlive()){
            System.out.print("> ");
            String attackType = sc.nextLine().toLowerCase();

            if (attackType.equals("attack")){
                player.attack(villain);
            }
            else if(attackType.equals("special")){
                player.specialMove(villain);
            }
            else{
                System.out.println("Invalid Attack Type.");
                continue;
            }

            GameStats.displayStats(player, villain);
            if(!villain.isAlive()){
                break;
            }
            System.out.println("Enemy Attacks");
            if (Math.random()<0.5){
                villain.attack(player);
            }
            else{
                villain.specialMove(player);
            }

            GameStats.displayStats(player, villain);
        }

        GameResults.displayResults(player, villain);
    }
}