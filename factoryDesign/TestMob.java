package factoryDesign;

import factoryDesign.factory.CreateMob;
import factoryDesign.model.Mob;

public class TestMob {
    public static void main(String[] args) {


    // Using the addMob (factory) method from "CreateMob" class to instantiate a "Zombie" class object.
    Mob mob1 = CreateMob.addMob("Zombie",100, false);
    System.out.println(mob1);
    }
}
