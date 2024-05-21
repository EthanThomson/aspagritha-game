package src;

import java.util.ArrayList;

public class ammo extends item
{
    int count;

    public ammo(String namein, int countin)
    {
        this.name = namein;
        this.volume = 0;
        this.weight = 0;
        this.count = countin;
    }
    public int getCount() {
        return count;
    }
    public void addCount(int count) {
        this.count += count;
    }

    public void subCount(int count) {
        this.count -= count;
    }
}
