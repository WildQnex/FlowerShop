package by.bsuir.flowerShop.logic;


import by.bsuir.flowerShop.entity.AbstractFlower;
import by.bsuir.flowerShop.entity.Bouquet;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter {
    public static Bouquet sortByFreshness(Bouquet bouquet){
        ArrayList<AbstractFlower> flowers = bouquet.getFlowers();
        flowers.sort(Comparator.comparingInt(AbstractFlower::getFreshness));
        bouquet.setFlowers(flowers);
        return bouquet;
    }
}
