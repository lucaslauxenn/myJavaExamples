package factoryDesign.model;
public abstract class Mob {


    public abstract String getType();
    public abstract int getHealth();
    public abstract boolean isPacific();


    @Override
    public String toString() {
        return "Type: "+getType()+" Health: "+getHealth()+" Is Pacific: "+isPacific();
    }


}


