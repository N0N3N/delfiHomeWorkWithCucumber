package pageObjects.desktop;

import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class TabBusinessDesktop {
    private CoreFunсtions core;
    private static final By TITLES = By.xpath("//h3[@class = 'top2012-title']/a[1]");
    private static final By COMMENTS = By.xpath("//h3[@class = 'top2012-title']/a[2]");
    private List<WebElement> newsNames;
    private List<WebElement> newsComments;
    //private List<String> sum = new ArrayList<String>();
    private String[] sum = {"","",""};

    public TabBusinessDesktop(CoreFunсtions cf){
        this.core = cf;
    }

    //public List<String> getNewsList(){
    public String[] getNewsList(){
        newsNames = core.getListOfElements(TITLES);
        newsComments = core.getListOfElements(COMMENTS);
        for (int i = 0; i<3; i++) {
            sum[i]=newsNames.get(i).getText()+newsComments.get(i).getText();
            System.out.println(sum[i]);
        }
        return sum;
    }


}
