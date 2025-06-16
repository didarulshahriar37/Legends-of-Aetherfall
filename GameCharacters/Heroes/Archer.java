package GameCharacters.Heroes;
import GameCharacters.Characters;
import java.util.Scanner;

public class Archer extends Hero{
    public Archer(String playerName){
        super(playerName + " the Archer", 100, 100);
    }

    public void attack(Characters target){
        if(!canAttack()){
            System.out.println(getName() + " can't attack at this moment.");
            skipped();
            return;
        }

        if (getPower() >= 8){
            setPower(getPower() - 8);
            int damage = this.weakenDamage(15);
            target.setHealth(target.getHealth() - 15);
            System.out.println(getName() + " used Attack on " + target.getName() + ".");
            System.out.println(getName() + " caused " + damage + " damage.");
        }
        else{
            System.out.println("can't use Attack.");
        }
    }

    public void specialMove(Characters target){
        if(!canAttack()){
            System.out.println(getName() + " can't attack at this moment.");
            skipped();
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one Special Move:\n1. Quick Shot\n2. Multi Shot");
        System.out.print("> ");
        int type = sc.nextInt();
        if (type == 1 && getPower() >= 25){
            setPower(getPower() - 25);
            int damage = this.weakenDamage(30);
            target.setHealth(target.getHealth() - 30);
            System.out.println(getName() + " used Special Move (Quick Shot) on " + target.getName() + ".");
            System.out.println(getName() + " caused " + damage + " damage.");
        }
        else if (type == 2 && getPower() >= 50){
            setPower(getPower() - 50);
            int damage = this.weakenDamage(60);
            target.setHealth(target.getHealth() - 60);
            System.out.println(getName() + " used Special Move (Multi Shot) on " + target.getName() + ".");
            System.out.println(getName() + " caused " + damage + " damage.");
        }
        else{
            System.out.println("Can't use Special Move.");
        }
        sc.close();
    }
}
