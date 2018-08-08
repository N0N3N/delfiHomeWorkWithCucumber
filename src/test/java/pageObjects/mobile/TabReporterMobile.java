package pageObjects.mobile;

import coreFunctions.CoreFunсtions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class TabReporterMobile {
    private CoreFunсtions core;
    private static final By TITLES = By.xpath("//div[@class = 'md-mosaic']/div/div/a[1]");
    private static final By COMMENTS = By.xpath("//div[@class = 'md-mosaic']/div/div/a[2]");
    //private static final String PAGE = "http://m.delfi.lv/aculiecinieks/";
    private static final String PAGE = "http://m.rus.delfi.lv/reporter/";
    private List<WebElement> newsNames;
    private List<WebElement> newsComments;
    //private List<String> sum = new ArrayList<String>();
    private String[] sum = {"","",""};


    public TabReporterMobile(CoreFunсtions cf){
        this.core = cf;
    }

    public String[][] getNewsList() {
        core.openWebPage(PAGE);
        String[][] sum = core.getNewsList(TITLES, COMMENTS);
        return sum;
    }
}
