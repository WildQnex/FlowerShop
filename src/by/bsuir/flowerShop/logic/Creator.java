package by.bsuir.flowerShop.logic;


import by.bsuir.flowerShop.entity.*;
import by.bsuir.flowerShop.exception.IncorrectInputException;

public class Creator {
    public static Bouquet createBucket() throws IncorrectInputException{
        Bouquet bouquet = new Bouquet();
        bouquet.addAccessory(new Accessory("Wrapper", 1.2));
        bouquet.addAccessory(new Accessory("Tape", 0.7));
        bouquet.addFlower( new FieldFlower("Chamomile", "White", "Field", 200, 2, 5));
        bouquet.addFlower(new GardenFlower("Rose", "Red", "Botanical Garden", 300, 1, 8.5));
        return bouquet;
    }

}
