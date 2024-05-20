package src;

import java.util.ArrayList;

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
    int[] stats;
    int power;

    public Unit()
    {
        equipped = new ArrayList<>();
    }
    public void move()
    {

    }
    public void equip(item equipment)
    {
        if(equipment.getClass() == weapon.class)
        {
            int x = 0;
            for(item cnt : equipped)
            {
                if(cnt.getClass() == manipulator.class)
                {
                    x++;
                }
            }
            if(((weapon) equipment).manipulatorsNeeded >= x)
            {
                equipped.add(equipment);
                equipped.


            }

        }
        equipped.add(equipment);
    }

}
