package src;

import java.util.ArrayList;
import java.util.Arrays;

public class armour extends item
{
    armour[] compatibleArmours;
    ArrayList onEquipEffects;

    public armour(String namein, armour[] compatibleArmoursin, ArrayList onEquipEffectsin)
    {
        this.name = namein;
        this.compatibleArmours = compatibleArmoursin;
        this.onEquipEffects = onEquipEffectsin;
    }

    public void onEquip(Unit target)
    {
        //standard stat increase
        if((int)onEquipEffects.getFirst() == -101)
        {
            onEquipEffects.removeFirst();
            target.stats = onEquipEffects;

        }

    }




}
