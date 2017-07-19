package by.bsuir.flowerShop.entity;


public class Acessory {
    private String name;
    private double cost;

    public Acessory(String name,double cost){
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
