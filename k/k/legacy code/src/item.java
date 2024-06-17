package src;

import java.util.ArrayList;

public abstract class item
{
    String name;
    int category;
    int weight;
    int volume;
    ArrayList onEquipEffects;

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
