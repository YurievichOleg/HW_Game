package Equipment;

public abstract class Weapon extends Equipment {
    private int maxDPS;
    private int minDPS;
    protected Weapon(int lvl, int maxDPS, int minDPS){
        super(lvl);
        this.maxDPS =maxDPS;
        this.minDPS = minDPS;
    }

    public int GetMaxDPS(){
        return this.maxDPS;
    }
    public int GetMinDPS(){
        return this.minDPS;
    }
}
