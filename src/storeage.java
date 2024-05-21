package src;

import java.util.ArrayList;

public class storeage extends container
{
    ArrayList<item> inventory;

    public storeage(String namein, int maxVolumein)
    {
        this.maxVolume = maxVolumein;
        this.name = namein;
        this.inventory = new ArrayList<>();
    }
    public void addInventory(item input)
    {
        inventory.add(input);
    }

    public item getItem(int x)
    {
        try
        {
            return (inventory.get(x));
        }
        catch (Exception k)
        {
            return (null);
        }
    }

    public int sizeInventory()
    {
        return inventory.size();
    }


}
