package by.bsuir.flowerShop.logic;


import by.bsuir.flowerShop.entity.*;

public class Creator {
    public static Bouquet createBucket1(){
        Bouquet bouquet = new Bouquet();
        bouquet.addAccessory(new Accessory("Tape", 0.7));
        bouquet.addFlower( new FieldFlower("Chamomile", "White", "Field", 200, 2, 5));
        bouquet.addFlower(new GardenFlower("Rose", "Red", "Botanical Garden", 300, 1, 8.5));
        return bouquet;
    }
    public static Bouquet createBucket2(){
        Bouquet bouquet = new Bouquet();
        Accessory accessory;
        accessory = new Accessory("Wrapper", 0.7);
        bouquet.addAccessory(accessory);
        return bouquet;
    }
}
