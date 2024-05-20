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
            weapon casabarifle = new weapon("Marine issue Casaba Rifle", 10, 1, 300, 1, 2);
            character.equipped
            int k = 1;


        }
}
