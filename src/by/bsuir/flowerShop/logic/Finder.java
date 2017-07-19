package by.bsuir.flowerShop.logic;


import by.bsuir.flowerShop.entity.AbstractFlower;
import by.bsuir.flowerShop.entity.Bucket;

import java.util.ArrayList;

public class Finder {
    public static ArrayList<AbstractFlower> find(Bucket bucket, int min, int max){
        ArrayList<AbstractFlower> result = new ArrayList<>();
        for (AbstractFlower flower : bucket.getFlowers()) {
            if(flower.getHeight() >= min && flower.getHeight() <= max){
                result.add(flower);
            }
        }
        return result;
    }
}
