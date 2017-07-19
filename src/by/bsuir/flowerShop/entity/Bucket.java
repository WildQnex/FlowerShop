package by.bsuir.flowerShop.entity;


import java.util.ArrayList;

public class Bucket {
    double  cost;
    private ArrayList<AbstractFlower> flowers;
    private ArrayList<Acessory> acessories;

    public Bucket(){
        this.cost = 0;
        this.flowers = new ArrayList<AbstractFlower>();
        this.acessories = new ArrayList<Acessory>();
    }

    public void addFlower(AbstractFlower flower) {
        flowers.add(flower);
        this.cost += flower.getCost();
    }

    public void addAcessory(Acessory acessory) {
        acessories.add(acessory);
        this.cost += acessory.getCost();
    }

    public ArrayList<AbstractFlower> getFlowers(){
        return flowers;
    }


    public double getCost() {
        return cost;
    }
}
