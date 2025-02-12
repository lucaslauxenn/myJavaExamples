package factoryDesign.model;

public class Skeleton extends Mob {

    String type;
    int health;
    boolean isPacific;

    public Skeleton(String type, int health, boolean isPacific) {
        this.type = type;
        this.health = health;
        this.isPacific = isPacific;
    }

    @Override
    public String getType() {
        return this.type;
    }
    @Override
    public int getHealth() {
        return this.health;
    }
    @Override
    public boolean isPacific() {
        return this.isPacific;
    }


}
