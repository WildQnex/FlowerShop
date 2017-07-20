package by.bsuir.flowerShop.entity;


import java.util.ArrayList;

public class Bouquet {
    private double  cost;
    private ArrayList<AbstractFlower> flowers;
    private ArrayList<Accessory> accessories;

    public Bouquet(){
        this.cost = 0;
        this.flowers = new ArrayList<>();
        this.accessories = new ArrayList<>();
    }

    public void addFlower(AbstractFlower flower) {
        flowers.add(flower);
        this.cost += flower.getCost();
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
        this.cost += accessory.getCost();
    }

    public ArrayList<Accessory> getAccessories(){
        return accessories;
    }

    public ArrayList<AbstractFlower> getFlowers(){
        return flowers;
    }

    public void setFlowers(ArrayList<AbstractFlower> flowers){
        this.flowers = flowers;
    }


    public double getCost() {
        return cost;
    }
}
