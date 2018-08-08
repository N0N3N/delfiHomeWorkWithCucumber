package pageObjects.mobile;

import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import pageObjects.desktop.TabWomanDesktop;

public class TabWomanMobile {
    private CoreFunсtions core;
    public TabWomanMobile(CoreFunсtions cf){
        this.core = cf;
    }

    private static final By TITLES = By.xpath("//h1[@class=\"headline-title text-lg\"]");
    private static final String PAGE = "http://m.delfi.lv/vina/";

/*    public String[][] getNewsList() {
        core.openWebPage(PAGE);
        String[][] sum = core.getNewsList(TITLES, COMMENTS);
        return sum;
    }*/
}
