package Equipment;

public abstract class Armor extends Equipment{
    private int maxValue;
    private int value;
    protected Armor(int lvl, int maxValue, int value){
        super(lvl);
        this.maxValue =maxValue;
        this.value =value;
    }

    public int GetMaxValue(){
        return this.maxValue;
    }

    public  int GetValue(){
        return this.value;
    }
}
