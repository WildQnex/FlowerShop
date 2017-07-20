package by.bsuir.flowerShop.logic;


import by.bsuir.flowerShop.entity.AbstractFlower;
import by.bsuir.flowerShop.entity.Bouquet;

import java.util.ArrayList;

public class Finder {
    public static ArrayList<AbstractFlower> findInInterval(Bouquet bouquet, int min, int max){
        ArrayList<AbstractFlower> result = new ArrayList<>();
        for (AbstractFlower flower : bouquet.getFlowers()) {
            if((flower.getHeight() >= min) && (flower.getHeight() <= max)){
                result.add(flower);
            }
        }
        return result;
    }
}
