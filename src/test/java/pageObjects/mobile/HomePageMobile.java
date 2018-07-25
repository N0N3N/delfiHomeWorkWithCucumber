package pageObjects.mobile;


import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageMobile {
    private CoreFunсtions core;
    private List<WebElement> tabs;

    private static final By TABLIST = By.xpath("//span[@itemprop=\"name\"]");
    private static final String HOME_PAGE_MOBILE = "m.rus.delfi.lv";

    private static final Logger LOGGER = LogManager.getLogger(HomePageMobile.class);
    public HomePageMobile(CoreFunсtions bs){
        this.core = bs;}

    public void openHomePageMob(){
        LOGGER.info("Open HomePage for Desktop");
        core.openWebPage(HOME_PAGE_MOBILE);
    }

    public void clickTab(int tabNumber){
        LOGGER.info("Clicking Tab "+core.getWebElements(TABLIST, tabNumber).getText());
        tabs = core.getListOfElements(TABLIST);
        tabs.get(tabNumber).click();
    }

}
