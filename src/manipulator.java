package src;

public class manipulator extends container
{
    private item current;


    public manipulator(String namein, int maxWeightin)
    {
        this.current = null;
        this.name = namein;
        this.maxWeight = maxWeightin;
    }


    public item getCurrent() {
        return this.current;
    }

    public void setCurrent(item current) {
        this.current = current;
    }
}
