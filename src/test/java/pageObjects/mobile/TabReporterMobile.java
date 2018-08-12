package pageObjects.mobile;

import coreFunctions.CoreFunсtions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class TabReporterMobile {
    private CoreFunсtions core;

    private static final By NEWS = By.xpath("//div[@class = 'md-mosaic']/div/div");
    private static final By A1 = By.xpath("./a[1]");
    private static final By A2 = By.xpath("./a[2]");
    private static final String PAGE = "http://m.rus.delfi.lv/reporter/";

    public TabReporterMobile(CoreFunсtions cf){
        this.core = cf;
    }

    public String[][] getNewsList() {
        core.openWebPage(PAGE);
        String[][] sum = core.getNewsAttributes(NEWS, A1, A2);
        return sum;
    }
}
