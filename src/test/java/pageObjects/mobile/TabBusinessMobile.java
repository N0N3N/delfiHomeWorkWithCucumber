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
    private static final String BIZNESS_PAGE_MOBILE_LV = "http://m.delfi.lv/bizness/";
    private List<WebElement> newsNames;
    private List<WebElement> newsComments;
    //private List<String> sum = new ArrayList<String>();
    private String[] sum = {"","",""};


    public TabBusinessMobile(CoreFunсtions cf){
        this.core = cf;
    }

    //public List<String> getNewsList(){
    public String[] getNewsList(){
        core.openWebPage(BIZNESS_PAGE_MOBILE_LV);
        newsNames = core.getListOfElements(TITLES);
        newsComments = core.getListOfElements(COMMENTS);
        for (int i = 0; i<3; i++) {
            sum[i]=newsNames.get(i).getText()+newsComments.get(i).getText();
            System.out.println(sum[i]);
        }
        return sum;
    }

}
