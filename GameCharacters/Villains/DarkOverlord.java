package GameCharacters.Villains;
import GameCharacters.Characters;
import GameCharacters.Heroes.Hero;

public class DarkOverlord extends Characters{
    public DarkOverlord(){
        super("Dark Overlord", 200, 150);
    }

    public void attack(Characters target){
        if (getPower()>=17){
            setPower(getPower()-17);
            target.setHealth(target.getHealth()-25);
            System.out.println(getName() + " used Attack on " + target.getName() + ".");
            System.out.println(getName() + " caused 25 damage.");
        }
        else{
            System.out.println("Can't use Attack.");
        }
    }

    public void specialMove(Characters target){
        if (getPower()>=40){
            setPower(getPower()-40);
            target.setHealth(target.getHealth()-50);

            if (target instanceof Hero){
                ((Hero) target).isWeaken(3);
            }
            System.out.println(getName() + " used Special Move on " + target.getName() + ".");
            System.out.println(getName() + " caused 50 damage to opponent and weakened the affect of the next attack by half.");
        }
        else{
            System.out.println("Can't use Special Move.");
        }
    }
}
