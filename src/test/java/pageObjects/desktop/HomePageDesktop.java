package pageObjects.desktop;


import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class HomePageDesktop {
    private CoreFunсtions core;

    private static final By TABLIST = By.xpath("//span[@itemprop=\"name\"]");

    private static final Logger LOGGER = LogManager.getLogger(HomePageDesktop.class);
    public HomePageDesktop(CoreFunсtions bs){
        this.core = bs;
    }


    public String getTabName(int titleNumber){
        LOGGER.info("Getting Tab List: " + core.getWebElements(TABLIST, titleNumber).getText());
        return core.getWebElements(TABLIST, titleNumber).getText();
    }

    public String getTitleLink(int titleNumber){
        LOGGER.info("Getting title link");
        return core.getWebElements(TABLIST, titleNumber).getAttribute("href");
    }

    public void clickTab(int tabNumber){
        LOGGER.info("Clicking Tab "+core.getWebElements(TABLIST, tabNumber).getText());
        core.getWebElements(TABLIST, tabNumber).click();
    }
}
