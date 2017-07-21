package by.bsuir.flowerShop.entity;


public class FieldFlower extends AbstractFlower {

    private String country;

    public FieldFlower(String name, String color, String fieldType, int height, int freshness, double cost) {
        super(name, color, height, freshness, cost);
        this.country = fieldType;
    }

    public String getFieldType() {
        return country;
    }

    @Override
    public String toString(){
        return "Field flower. Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight()
                + ", Freshness: " + getFreshness() + ", Grew at " + country;
    }

}
