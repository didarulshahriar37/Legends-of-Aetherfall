package GameCharacters.Heroes;
import GameCharacters.Characters;

public class Mage extends Hero{
    public Mage (String playerName){
        super(playerName + " the Mage", 80, 100);
    }

    public void attack(Characters target){
        if(!canAttack()){
            System.out.println(getName() + " can't attack at this moment.");
            skipped();
            return;
        }

        if (getPower() >= 10){
            setPower(getPower() - 10);
            int damage = this.weakenDamage(20);
            target.setHealth(target.getHealth()-damage);
            System.out.println(getName() + " used attack on " + target.getName() + ".");
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
        
        if (getPower() >= 30){
            setPower(getPower() - 30);
            int damage = this.weakenDamage(40);
            target.setHealth(target.getHealth()-damage);
            System.out.println(getName() + " used Special on " + target.getName() + ".");
            System.out.println(getName() + " caused " + damage + " damage.");
        }
        else{
            System.out.println("Can't use Special Attack.");
        }
    }
}
