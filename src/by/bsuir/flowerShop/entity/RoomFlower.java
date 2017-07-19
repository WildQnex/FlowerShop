package by.bsuir.flowerShop.entity;


public class RoomFlower extends AbstractFlower {
    public RoomFlower(String name, String color, int height, int freshness, double cost) {
        super(name, color, height, freshness, cost);
    }
    @Override
    public String toString(){
        return "Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight()
                + ", Freshness: " + getFreshness();
    }
}
