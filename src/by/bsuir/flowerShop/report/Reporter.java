package by.bsuir.flowerShop.report;


import by.bsuir.flowerShop.entity.AbstractFlower;
import by.bsuir.flowerShop.logic.Creator;
import by.bsuir.flowerShop.logic.Finder;
import by.bsuir.flowerShop.logic.Sorter;
import by.bsuir.flowerShop.main.Main;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.ArrayList;

public class Reporter {
    private final static Logger LOGGER = Logger.getLogger(Main.class);

    static{
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }

    public static void getFirstReport(){
        ArrayList<AbstractFlower> result = Finder.findInInterval(Creator.createBucket1(),200, 300);
        for (AbstractFlower res: result){
            LOGGER.debug(res);

        }
    }
    public static void getSecondReport(){
        ArrayList<AbstractFlower> result = Sorter.sortByFreshness(Creator.createBucket1()).getFlowers();
        for (AbstractFlower res: result){
            LOGGER.debug(res);
        }
    }
}
