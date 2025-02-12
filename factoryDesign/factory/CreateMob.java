package factoryDesign.factory;

import factoryDesign.model.Mob;
import factoryDesign.model.Skeleton;
import factoryDesign.model.Zombie;

public class CreateMob {

    public static Mob addMob (String type, int health, boolean isPacific) {
        if (type.equals("Zombie")) {return new Zombie(type, health, isPacific);}
        else if (type.equals("Skeleton")) {return new Skeleton(type, health, isPacific);}
        else {return null;}
    }

}
