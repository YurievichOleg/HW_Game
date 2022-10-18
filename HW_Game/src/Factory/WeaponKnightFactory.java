package Factory;

import Equipment.*;

public class WeaponKnightFactory extends WeaponFactory{

    public static Weapon create( String weapon){
        switch (weapon){
            case "GoodSwordKnight":
                return new GoodSwordKnight();
            case "BadSwordKnife":
                return new BadSwordKnife();
            default:
                return new BadSwordKnife(3,6,3);
        }
    }
}
