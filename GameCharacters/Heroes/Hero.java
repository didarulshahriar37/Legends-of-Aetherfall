package GameCharacters.Heroes;
import GameCharacters.Characters;

public abstract class Hero extends Characters{
    private int weaken = 0;
    private int skipTurns = 0;
    
    public Hero (String name, int healthLevel, int powerLevel){
        super (name, healthLevel, powerLevel);
    }

    public void isWeaken (int weaken){
        this.weaken = weaken;
    }
    
    public void setSkip(int skipTruns){
        this.skipTurns = skipTruns;
    }
    public boolean canAttack(){
        return skipTurns <= 0;
    }
    
    public void skipped(){
        if(skipTurns>0){
            skipTurns--;
        }
    }

    public int weakenDamage (int originalDamage){
        if(weaken>0){
            weaken--;
            return originalDamage/2;
        }
        return originalDamage;
    }
}
