package Factory;

import Equipment.BadOnionArcher;
import Equipment.GoodOnionArcher;
import Equipment.Weapon;

public class WeaponArcherFactory extends WeaponFactory{

    public static Weapon create (String weapon){
        switch (weapon){
            case "GoodOnionArcher":
                return new GoodOnionArcher();
            case "BadOnionArcher":
                return new BadOnionArcher();
            default:
                return new BadOnionArcher(2, 4, 2);
        }
    }
}
