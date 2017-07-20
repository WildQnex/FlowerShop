package by.bsuir.flowerShop.entity;


public class RoomFlower extends AbstractFlower {

    private String potColor;

    public RoomFlower(String name, String color,String potColor, int height, int freshness, double cost) {
        super(name, color, height, freshness, cost);
        this.potColor = potColor;
    }

    @Override
    public String toString(){
        return "Room flower. Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight()
                + ", Freshness: " + getFreshness() + ", Pot's color:  " + potColor;
    }
}
