package GameCharacters.Heroes;
import GameCharacters.Characters;

public class Warrior extends Hero{
    public Warrior (String playerName){
        super (playerName + " the Warrior", 120, 100);
    }

    public void attack(Characters target){
        if(!canAttack()){
            System.out.println(getName() + " can't attack at this moment.");
            skipped();
            return;
        }

        if (getPower() >= 5){
            setPower(getPower() - 5);
            int damage = this.weakenDamage(12);
            target.setHealth(target.getHealth() - 12);
            System.out.println(getName() + " used Attack on " + target.getName() + ".");
            System.out.println(getName() + " caused " + damage + " damage.");
        }
        else{
            System.out.println("Can't use Attack.");
        }
    }

    public void specialMove(Characters target){
        if(!canAttack()){
            System.out.println(getName() + " can't attack at this moment.");
            skipped();
            return;
        }
        
        if (getPower() >= 35){
            setPower(getPower() - 35);
            int damage = this.weakenDamage(35);
            target.setHealth(target.getHealth() - 35);
            System.out.println(getName() + " used Special Move on " + target.getName() + ".");
            System.out.println(getName() + " caused " + damage + " damage.");
        }
        else{
            System.out.println("Can't use Special Move.");
        }
    }
}
