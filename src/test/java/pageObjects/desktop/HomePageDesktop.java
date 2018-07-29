package pageObjects.desktop;


import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePageDesktop {
    private CoreFunсtions core;
    private List<WebElement> tabs;

    private static final boolean COND = true;

    private static final By TABLIST = By.xpath("//span[@itemprop=\"name\"]");
    private static final String HOME_PAGE_DESKTOP = "rus.delfi.lv";

    private static final Logger LOGGER = LogManager.getLogger(HomePageDesktop.class);
    public HomePageDesktop(CoreFunсtions bs){
        this.core = bs;

        //Assert.assertTrue("No Table list", core.isElementPresent(TABLIST));
    }

    public void openHomePageDesk(){
        LOGGER.info("Open HomePage for Desktop");
        core.openWebPage(HOME_PAGE_DESKTOP);
    }

    public void clickTab(int tabNumber){
        LOGGER.info("Clicking Tab "+core.getWebElementFromList(TABLIST, tabNumber).getText());
        tabs = core.getListOfElements(TABLIST);
        tabs.get(tabNumber).click();
    }

}
