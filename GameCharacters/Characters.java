package GameCharacters;

public abstract class Characters{
    private String name;
    private int healthLevel;
    private int powerLevel;

    protected Characters(String name, int healthLevel, int powerLevel){
        this.name = name;
        this.healthLevel = healthLevel;
        this.powerLevel = powerLevel;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setHealth(int healtLevel){
        this.healthLevel = healtLevel;
    }
    public int getHealth(){
        return healthLevel;
    }

    public void setPower(int powerLevel){
        this.powerLevel = powerLevel;
    }
    public int getPower(){
        return powerLevel;
    }

    public boolean isAlive(){
        return healthLevel > 0;
    }

    public int weakenDamage (int originalDamage){
        return originalDamage;
    }

    public abstract void attack(Characters target);
    public abstract void specialMove(Characters target);
}