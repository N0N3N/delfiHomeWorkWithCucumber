package pageObjects.mobile;


import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageMobile {
    private CoreFunсtions core;

    private static final By MENU_OPEN = By.xpath("//a[@class = 'menu-open']");
    private static final String HOME_PAGE_MOBILE = "m.rus.delfi.lv";
    private static final String HOME_PAGE_MOBILE_LV = "m.delfi.lv";

    private static final Logger LOGGER = LogManager.getLogger(HomePageMobile.class);
    public HomePageMobile(CoreFunсtions bs){
        this.core = bs;}

    private void openHomePageMob(){
        LOGGER.info("Open HomePage for Desktop");
        core.openWebPage(HOME_PAGE_MOBILE_LV);
    }

    private void openMenu(){
        System.out.println("Click Menu");
        core.clickElement(MENU_OPEN);
    }
    public void clickTabName(String tabName){
        openHomePageMob();
        openMenu();
        core.waitPageLoad();
        System.out.println("Click Tab");
        core.clickElement(By.xpath("//a[contains (span, '"+tabName+"')]"));
    }





}
