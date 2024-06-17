package src;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Unit
{
    public ArrayList<item> equipped;
    gridpos position;
    /* [speed, strength, health, toughness, power generation, neural plasticity, power capacity, ]
    * neural plasticity = how many bionics use can mount
    * power generation = rate per tick that power is updated
    * power capacity = max power
    *
    */
    ArrayList stats;
    int power;
    char sprite;

    public Unit()
    {
        equipped = new ArrayList<>();

    }
    public void move()
    {

    }
    public void refill(ammo ammoin)
    {
        for(item storemaybe : equipped)
        {
            if(storemaybe.getClass() == storeage.class)
            {
                ((storeage) storemaybe).addInventory(ammoin);
            }
        }
    }

    public void equip(item equipment)
    {
        //equip weapon
        if(equipment.getClass() == weapon.class)
        {
            int x = 0;
            int t = ((weapon) equipment).manipulatorsNeeded;
            ArrayList<item> tempstore = new ArrayList<>();

            for(int k = 0; k <= equipped.size(); k++)
            {
                try
                {
                    equipped.get(k).getClass();
                }
                catch (Exception bu)
                {
                    if(t == x)
                    {
                        for(item target : tempstore)
                        {
                            ((manipulator) target).setCurrent(equipment);
                        }
                        break;
                    }
                    break;
                }
                if(t == x)
                {
                    break;
                }
                if(equipped.get(k).getClass() == manipulator.class)
                {
                    for(item target : tempstore)
                    {
                        ((manipulator) target).setCurrent(equipment);
                    }
                    tempstore.add(equipped.get(k));
                    x++;
                }
            }
        }
        equipped.add(equipment);
    }
}
