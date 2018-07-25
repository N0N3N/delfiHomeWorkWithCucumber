package pageObjects.desktop;

import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class TabBusinessDesktop {
    private CoreFunсtions core;
    private static final Logger LOGGER = LogManager.getLogger(TabBusinessDesktop.class);
    private static final By TITLES = By.xpath("//h3/a[@class=\"top2012-title\"]");

    public TabBusinessDesktop(CoreFunсtions cf){
        this.core = cf;
    }

    public List<WebElement> getNewsList(){
        LOGGER.info("Getting List of Elements");
        List<WebElement> news = core.getListOfElements(TITLES);
        return news;
    }

}
