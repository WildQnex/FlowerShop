package by.bsuir.flowerShop.entity;


public class FieldFlower extends AbstractFlower {

    private String fieldType;

    public FieldFlower(String name, String color, String fieldType, int height, int freshness, double cost) {
        super(name, color, height, freshness, cost);
        this.fieldType = fieldType;
    }

    public String getFieldType() {
        return fieldType;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight()
                + ", Freshness: " + getFreshness() + ", Grew at " + fieldType;
    }

}
