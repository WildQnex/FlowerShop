package by.bsuir.flowerShop.report;


import by.bsuir.flowerShop.entity.AbstractFlower;
import by.bsuir.flowerShop.entity.Accessory;
import by.bsuir.flowerShop.entity.Bouquet;
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

    public static void getBouquetReport() {
        Bouquet bouquet = Creator.createBucket();
        LOGGER.debug("****************************************** \n" +
                     "                  Bouquet\n" +
                     "                Cost: " + bouquet.getCost() + "\n" +
                     "****************************************** ");
        for (AbstractFlower res: bouquet.getFlowers()){
            LOGGER.debug(res);
        }
        for (Accessory res: bouquet.getAccessories()){
            LOGGER.debug(res);
        }
    }

    public static void getFindReport(int min, int max){
        ArrayList<AbstractFlower> result = Finder.findInInterval(Creator.createBucket(),min, max);
        LOGGER.debug("****************************************** \n" +
                     "          Searched Flowers: \n" +
                     "          Range: " + min + " - " + max +" \n" +
                     "******************************************");
        for (AbstractFlower res: result){
            LOGGER.debug(res);

        }
    }
    public static void getSortReport(){
        ArrayList<AbstractFlower> result = Sorter.sortByFreshness(Creator.createBucket()).getFlowers();
        LOGGER.debug("****************************************** \n" +
                    "        Sorted by length bouquet\n" +
                    "******************************************");
        for (AbstractFlower res: result){
            LOGGER.debug(res);
        }
    }
}
