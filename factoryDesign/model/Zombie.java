package factoryDesign.model;

public class Zombie extends Mob{

    String type;
    int health;
    boolean isPacific;

    public Zombie(String type, int health, boolean isPacific) {
        this.health = health;
        this.isPacific = isPacific;
        this.type = type;
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
