package by.bsuir.flowerShop.logic;


import by.bsuir.flowerShop.entity.AbstractFlower;
import by.bsuir.flowerShop.entity.Bouquet;
import by.bsuir.flowerShop.exception.IncorrectInputException;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter {
    public static Bouquet sortByFreshness(Bouquet bouquet) throws IncorrectInputException{
        ArrayList<AbstractFlower> flowers = bouquet.getFlowers();
        flowers.sort(new Compare());
        bouquet.setFlowers(flowers);
        return bouquet;
    }
    static class Compare implements Comparator<AbstractFlower>{
        @Override
        public int compare(AbstractFlower flower1, AbstractFlower flower2){
                return flower2.getFreshness() - flower1.getFreshness();
        }
    }
}
