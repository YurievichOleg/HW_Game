package Factory;

import Equipment.*;

public class ArmorArcherFactory extends ArmorFactory{


    public static Armor create(String armor){

        switch (armor){
            case "ArmorKnightHeavy":
                return new ArmorArcherHeavy() ;
            case "ArmorKnightLight":
                return new ArmorArcherLight();
            default:
                return new ArmorArcherLight(2, 4, 2);
        }
    }
}
