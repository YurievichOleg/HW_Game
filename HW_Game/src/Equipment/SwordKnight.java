package Equipment;

import java.security.spec.DSAParameterSpec;

public abstract class SwordKnight extends Weapon{

    protected SwordKnight(int lvl, int maxDPS, int minDPS){
        super(lvl, maxDPS, minDPS);
    }
}
