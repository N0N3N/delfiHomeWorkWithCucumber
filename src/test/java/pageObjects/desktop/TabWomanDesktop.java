package pageObjects.desktop;

import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TabWomanDesktop {
    private CoreFunсtions core;
    private static final By TITLES = By.xpath("//h1[@class=\"headline-title text-lg\"]");
    private static final String PAGE = "http://delfi.lv/vina/";

    public TabWomanDesktop(CoreFunсtions cf){
        this.core = cf;
    }

/*    public String[][] getNewsList(){
        String[][] sum = core.getNewsList(TITLES, COMMENTS);
        return sum;
    }*/
}
