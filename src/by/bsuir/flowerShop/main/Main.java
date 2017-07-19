package by.bsuir.flowerShop.main;

import by.bsuir.flowerShop.reports.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    static{
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }

    public static void main(String[] args) {
        Reporter.getFirstReport();
    }
}
