import Equipment.Armor;
import Equipment.Weapon;
import Factory.*;

public class Knight extends Hero{

    public Knight(int lvl, int maxHP, int HP, int DPS, String weapon, String armor){
        super(lvl, maxHP, HP, DPS, WeaponKnightFactory.create(weapon), ArmorKnightFactory.create(armor));
    }

    @Override
    protected void getDPS(int damage) {
        this.HP =  this.HP - damage;
    }

    @Override
    public int attack(Hero hero) {
        return hero.weapon.GetMaxDPS() + this.DPS;
    }

    private void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    private void setArmor(Armor armor){
        this.armor = armor;
    }

}
