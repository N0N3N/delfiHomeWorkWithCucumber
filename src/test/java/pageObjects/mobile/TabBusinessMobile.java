package pageObjects.mobile;

import coreFunctions.CoreFunсtions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TabBusinessMobile {
    private CoreFunсtions core;
    private static final By TITLES = By.xpath("//div[@class = 'md-mosaic']/div/div/a[1]");
    private static final By COMMENTS = By.xpath("//div[@class = 'md-mosaic']/div/div/a[2]");
    private static final By NEWS = By.xpath("//div[@class = 'md-mosaic']/div/div/a");
    //private static final String PAGE = "http://m.delfi.lv/bizness/";
    private static final String PAGE = "http://m.rus.delfi.lv/biznes/";


    public TabBusinessMobile(CoreFunсtions cf) {
        this.core = cf;
    }

    //public List<String> getNewsList(){
    public String[][] getNewsList() {
        core.openWebPage(PAGE);
        String[][] sum = core.getNewsList(TITLES, COMMENTS);
        return sum;
    }

    public String[] getNewsListSimple() {
        String[] sum = core.getNewsListSimple(NEWS);
        return sum;

    }
}
