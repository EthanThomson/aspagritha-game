import src.*;

import javax.sound.sampled.Clip;

public class Main
{
    public static void main(String[] arg)
        {
            Unit character = new Unit();
            manipulator leftArm = new manipulator("Marine standard arm", 20);
            manipulator rightArm = new manipulator("Marine standard arm", 20);
            character.equip(rightArm);
            character.equip(leftArm);
            storeage marinestore = new storeage("Standard Marine store 400m³", 400);
            character.equip(marinestore);
            ammo casaRifamt1 = new ammo("50 kg Tungsten Rifled round", 0);
            ammo casaRifamt2 = new ammo("100 kg Tungsten Rifled round", 0);
            ammo casaRifamt3 = new ammo("25 kg Tungsten Shred round", 0);
            ammo casaRifamt4 = new ammo("50 kg Tungsten Explosive round", 0);
            ammo casaRifRon1 = new ammo("50 kg Tungsten Rifled round", 600);
            ammo casaRifRon2 = new ammo("100 kg Tungsten Rifled round", 150);
            ammo casaRifRon3 = new ammo("25 kg Tungsten Shred round", 50);

            ammo[] casabaRifleAmmoTable = {casaRifamt1, casaRifamt2, casaRifamt3, casaRifamt4};
            weapon casabarifle = new weapon("Marine issue Casaba Rifle", 10, 1, 300, 1, 2, casabaRifleAmmoTable);
            character.equip(casabarifle);
            character.refill(casaRifRon1);
            character.refill(casaRifRon2);
            character.refill(casaRifRon3);
            int k = 1;


        }
}
