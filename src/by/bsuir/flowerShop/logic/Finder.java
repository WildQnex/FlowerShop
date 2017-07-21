package by.bsuir.flowerShop.logic;


import by.bsuir.flowerShop.entity.AbstractFlower;
import by.bsuir.flowerShop.entity.Bouquet;
import by.bsuir.flowerShop.exception.IncorrectInputException;

import java.util.ArrayList;

public class Finder{
    public static ArrayList<AbstractFlower> findInInterval(Bouquet bouquet, int min, int max) throws IncorrectInputException{
        if ((min < 0) || (max < 0)){
            throw new IncorrectInputException("Negative value is not valid!", min, max);
        }
        if (min > max){
            throw new IncorrectInputException("Max value cant be less then min!", min, max);
        }
        ArrayList<AbstractFlower> result = new ArrayList<>();
        for (AbstractFlower flower : bouquet.getFlowers()) {
            if((flower.getHeight() >= min) && (flower.getHeight() <= max)){
                result.add(flower);
            }
        }
        return result;
    }
}
