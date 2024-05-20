package src;

public class weapon extends item
{
    int damage;
    int damageType;
    int range;
    int type;
    int manipulatorsNeeded;
    ammo[] acceptedAmmo;

    public weapon(String namein, int damagein, int damageTypein, int rangein, int typein, int manipulatorsin)
    {
        this.name = namein;
        this.damage = damagein;
        this.damageType = damageTypein;
        this.range = rangein;
        this.type = typein;
        this.manipulatorsNeeded = manipulatorsin;

    }
    public void Use()
    {

    }


}
