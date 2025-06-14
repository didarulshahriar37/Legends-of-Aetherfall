package GameCharacters.Villains;
import GameCharacters.Characters;
import GameCharacters.Heroes.Hero;

public class CorruptedMortal extends Characters{
    public CorruptedMortal(){
        super ("Corrupted Mortal", 90, 90);
    }

    public void attack(Characters target){
        if (getPower()>=9){
            setPower(getPower()-9);
            target.setHealth(target.getHealth()-18);
            System.out.println(getName() + " used Attack on" + target.getName() + ".");
            System.out.println(getName() + " caused 18 damage.");
        }
        else{
            System.out.println("Can't use Attack.");
        }
    }

    public void specialMove(Characters target){
        if (getPower()>=20){
            setPower(getPower()-20);
            target.setHealth(target.getHealth()-25);
            System.out.println(getName() + " used Special Move on " + getName() + ".");
            System.out.println(getName() + " caused 25 damage.");
        }
        else{
            System.out.println("Can't use Special Move.");
        }
    }
}
