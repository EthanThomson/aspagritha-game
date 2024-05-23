package src;

public class weapon extends item
{
    int damage;
    int damageType;
    int range;
    int type;
    int manipulatorsNeeded;
    int currentAmmo;
    ammo[] acceptedAmmo;

    public weapon(String namein, int damagein, int damageTypein, int rangein, int typein, int manipulatorsin, ammo[] acceptedAmmoin)
    {
        this.name = namein;
        this.damage = damagein;
        this.damageType = damageTypein;
        this.range = rangein;
        this.type = typein;
        this.manipulatorsNeeded = manipulatorsin;
        this.acceptedAmmo = acceptedAmmoin;

    }

    public void reload()
    {

    }

    public void Use()
    {

    }
    public void Fire()
    {

    }


}
