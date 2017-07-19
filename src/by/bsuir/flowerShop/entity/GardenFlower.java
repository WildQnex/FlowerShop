package by.bsuir.flowerShop.entity;

public class GardenFlower extends AbstractFlower {

    private String gardenName;

    public GardenFlower(String name, String color, String gardenName, int height, int freshness, double cost) {
        super(name, color, height, freshness, cost);
        this.gardenName = gardenName;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight()
                + ", Freshness: " + getFreshness() + ", Grew in " + gardenName;
    }
}
