package by.bsuir.flowerShop.entity;


import by.bsuir.flowerShop.exception.IncorrectInputException;

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

    public void addFlower(AbstractFlower flower) throws IncorrectInputException{
        if(flower.getCost() < 0){
            throw new IncorrectInputException("Cost or Freshness of Flower cant't be negative!", flower.getCost(), flower.getFreshness());
        }
        flowers.add(flower);
        this.cost += flower.getCost();
    }

    public void addAccessory(Accessory accessory) throws IncorrectInputException{
        if(accessory.getCost() < 0){
            throw new IncorrectInputException("Cost of Accessory cant't be negative!", accessory.getCost());
        }
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
