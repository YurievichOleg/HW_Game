package Factory;

import Equipment.Armor;
import Equipment.ArmorKnightHeavy;
import Equipment.ArmorKnightLight;

public class ArmorKnightFactory extends ArmorFactory {


    public static Armor create(String armor){
        switch (armor){
            case "ArmorKnightHeavy":
                return new ArmorKnightHeavy();
            case "ArmorKnightLight":
                return new ArmorKnightLight();
            default:
                return new ArmorKnightLight(3, 6, 3);
        }
    }
}
