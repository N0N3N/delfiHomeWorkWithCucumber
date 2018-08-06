package pageObjects.desktop;


import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePageDesktop {
    private CoreFunсtions core;

    private static final String HOME_PAGE_DESKTOP = "rus.delfi.lv";
    private static final String HOME_PAGE_DESKTOP_LV = "delfi.lv";

    private static final Logger LOGGER = LogManager.getLogger(HomePageDesktop.class);
    public HomePageDesktop(CoreFunсtions bs){
        this.core = bs;
    }

    private void openHomePageDesk(){
        LOGGER.info("Open HomePage for Desktop");
        core.openWebPage(HOME_PAGE_DESKTOP_LV);
    }

    public void clickTabName(String tabName){
        openHomePageDesk();
        core.waitPageLoad();
        core.clickElement(By.xpath("//a[contains (span, '"+tabName+"')]"));
        // Бизнес  Репортер  Woman
    }

}
