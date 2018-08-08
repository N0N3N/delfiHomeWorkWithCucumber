package pageObjects.desktop;

import coreFunctions.CoreFunсtions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class TabReporterDesktop {
    private CoreFunсtions core;
    private static final By TITLES = By.xpath("//h3[@class = 'top2012-title']/a[1]");
    private static final By COMMENTS = By.xpath("//h3[@class = 'top2012-title']/a[2]");
    //private static final String PAGE = "http://delfi.lv/aculiecinieks/";
    private static final String PAGE = "http://www.delfi.lv/reporter/";
    private List<WebElement> newsNames;
    private List<WebElement> newsComments;
    //private List<String> sum = new ArrayList<String>();
    private String[] sum = {"","",""};

    public TabReporterDesktop(CoreFunсtions cf){
        this.core = cf;
    }

    public String[][] getNewsList(){
        core.openWebPage(PAGE);
        String[][] sum = core.getNewsList(TITLES, COMMENTS);
        return sum;
    }

}
