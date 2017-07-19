package by.bsuir.flowerShop.reports;


import by.bsuir.flowerShop.entity.AbstractFlower;
import by.bsuir.flowerShop.entity.Bucket;
import by.bsuir.flowerShop.logic.Creator;
import by.bsuir.flowerShop.logic.Finder;

import java.util.ArrayList;

public class Reporter {
    public static void getFirstReport(){
        ArrayList<AbstractFlower> result = Finder.find(Creator.createBucket1(),200, 300);
        for (AbstractFlower res: result){
            System.out.println(res.toString());
        }
    }
}
