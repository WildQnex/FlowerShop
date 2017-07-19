package by.bsuir.flowerShop.entity;


public abstract class AbstractFlower {
    private String name;
    private String color;
    private int height;
    private int freshness;
    private double cost;

    public AbstractFlower(String name, String color, int height, int freshness, double cost){
        this.name = name;
        this.color = color;
        this.height = height;
        this.freshness = freshness;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getFreshness() {
        return freshness;
    }

    public int getHeight() {
        return height;
    }

    public void incFreshness() {
        this.freshness++;
    }

    public double getCost() {
        return cost;
    }
}
