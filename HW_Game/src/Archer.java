
import Equipment.Armor;
import Equipment.Weapon;
import Factory.ArmorArcherFactory;
import Factory.WeaponArcherFactory;

public class Archer extends Hero{

    public Archer(int lvl, int maxHP, int HP, int DPS, String weapon, String armor){
        super(lvl, maxHP, HP, DPS, WeaponArcherFactory.create(weapon), ArmorArcherFactory.create(armor));
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
