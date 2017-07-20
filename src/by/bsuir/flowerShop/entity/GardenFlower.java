package by.bsuir.flowerShop.entity;

public class GardenFlower extends AbstractFlower {

    private String country;

    public GardenFlower(String name, String color, String country, int height, int freshness, double cost) {
        super(name, color, height, freshness, cost);
        this.country = country;
    }

    @Override
    public String toString(){
        return "Garden flower. Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight()
                + ", Freshness: " + getFreshness() + ", " + "Brought from " + country;
    }
}
