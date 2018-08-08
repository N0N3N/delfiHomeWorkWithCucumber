package pageObjects.desktop;

import coreFunctions.CoreFunсtions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class TabBusinessDesktop {
    private CoreFunсtions core;
    private static final By TITLES = By.xpath("//h3[@class = 'top2012-title']/a[1]");
    private int i = 0;
    private static final By COMMENTS = By.xpath("//h3[@class = 'top2012-title']/a[2]");

    //private static final String PAGE = "http://delfi.lv/bizness/";
    private static final String PAGE = "http://www.delfi.lv/biznes/";
    private static final By NEWS = By.xpath("//h3[@class = 'top2012-title']");
    //private List<WebElement> newsNames;
    //private List<WebElement> newsComments;
    //private String[] comms = {"","",""};

    public TabBusinessDesktop(CoreFunсtions cf){
        this.core = cf;
    }

/*    public By getNews(){
        for (i=0; i<3; i++){
            String name = core.getListOfElements(TITLES).get(i).getText();
        }
        String name = core.getWebElement(TITLES).getText();
        By Comments = By.xpath("//h3[@class = 'top2012-title'][contains(a[1], '"+name+"')]/a[2]");
        return Comments;
    }*/

    public String[][] getNewsList(){
        core.openWebPage(PAGE);
        String[][] sum = core.getNewsList(TITLES, COMMENTS);
        return sum;
    }

    public String[] getNewsListSimple(){
        String[] sum = core.getNewsListSimple(NEWS);
        return sum;
    }



}
