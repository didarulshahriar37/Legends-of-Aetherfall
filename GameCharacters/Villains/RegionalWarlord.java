package GameCharacters.Villains;
import GameCharacters.Characters;
import GameCharacters.Heroes.Hero;

public class RegionalWarlord extends Characters{
    public RegionalWarlord(){
        super ("Regional Warlord", 130, 110);
    }

    public void attack(Characters target){
        if (getPower()>=10){
            setPower(getPower()-10);
            target.setHealth(target.getHealth()-20);
            System.out.println(getName() + " used Attack on " + getName() + ".");
            System.out.println(getName() + " caused 20 damage.");
        }
        else{
            System.out.println("Can't use Attack.");
        }
    }

    public void specialMove(Characters target){
        if (getPower()>=35){
            setPower(getPower()-35);
            target.setHealth(target.getHealth()-30);
            if (target instanceof Hero){
                ((Hero) target).setSkip(2);
            }
            System.out.println(getName() + " used Attack on " + target.getName() + ".");
            System.out.println(getName() + " caused 30 damage and next 20 seconds the user cannot attack.");
        }
        else{
            System.out.println("Can't use Special Move.");
        }
    }
}
