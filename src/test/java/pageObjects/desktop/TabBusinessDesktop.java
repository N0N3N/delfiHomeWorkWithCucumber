package pageObjects.desktop;

import coreFunctions.CoreFunсtions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class TabBusinessDesktop {
    private CoreFunсtions core;

    private static final String PAGE = "http://www.delfi.lv/biznes/";
    private static final By NEWS = By.xpath("//h3[@class = 'top2012-title']");
    private static final By A1 = By.xpath("./a[1]");
    private static final By A2 = By.xpath("./a[2]");

    public TabBusinessDesktop(CoreFunсtions cf){
        this.core = cf;
    }

    public String[][] getNewsList(){
        core.openWebPage(PAGE);
        String[][] sum = core.getNewsAttributes(NEWS, A1, A2);
        return sum;
    }

}
