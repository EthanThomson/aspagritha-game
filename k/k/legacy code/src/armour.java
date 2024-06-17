package src;

import java.util.ArrayList;
import java.util.Arrays;

public class armour extends item
{
    armour[] compatibleArmours;


    public armour(String namein, armour[] compatibleArmoursin, ArrayList onEquipEffectsin)
    {
        this.name = namein;
        this.compatibleArmours = compatibleArmoursin;
        this.onEquipEffects = onEquipEffectsin;
    }

    public void onEquip(Unit target)
    {
        if (onEquipEffects.isEmpty())
        {
            return;
        }
        switch ((int)onEquipEffects.getFirst())
        {
            //standard stat increase
            case -101:
                onEquipEffects.removeFirst();
                target.stats = onEquipEffects;
                break;

            //standard stat decrease
            case -102:
                onEquipEffects.removeFirst();
                target.stats = onEquipEffects;
                break;

            //standard stat multipler
            case -103:
                onEquipEffects.removeFirst();
                target.stats = onEquipEffects;
                break;
        }
    }




}
