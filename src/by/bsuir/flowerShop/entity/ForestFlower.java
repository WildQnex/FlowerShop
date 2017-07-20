package by.bsuir.flowerShop.entity;


public class ForestFlower extends AbstractFlower {

    private String forestType;

    public ForestFlower(String name, String color, String forestType, int height, int freshness, double cost) {
        super(name, color, height, freshness, cost);
        this.forestType = forestType;
    }

    public String getForestType() {
        return forestType;
    }

    @Override
    public String toString(){
        return "Forest flower. Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight() +
                ", Freshness: " + getFreshness() + ", Grew at " + forestType;
    }
}
