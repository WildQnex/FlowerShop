package by.bsuir.flowerShop.entity;


public class Accessory {
    private String name;
    private double cost;

    public Accessory(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
