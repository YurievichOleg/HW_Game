import Equipment.Armor;
import Equipment.Weapon;

public abstract class Hero {
    int lvl;
    int maxHP;
    int HP;
    int DPS;
    Weapon weapon;
    Armor armor;
    protected Hero(int lvl, int maxHP, int HP, int DPS,
                   Weapon weapon, Armor armor){
        this.lvl = lvl;
        this.maxHP = maxHP;
        this.HP = HP;
        this.DPS = DPS;
        this.weapon = weapon;
        this.armor = armor;
    }

    protected abstract void getDPS(int damage);
    protected abstract int attack(Hero hero);

}
