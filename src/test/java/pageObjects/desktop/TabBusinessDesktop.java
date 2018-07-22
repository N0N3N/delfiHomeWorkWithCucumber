package pageObjects.desktop;

import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class TabBusinessDesktop {
    private CoreFunсtions core;
    private static final Logger LOGGER = LogManager.getLogger(TabBusinessDesktop.class);
    private static final By TITLES = By.xpath("//h3/a[@class=\"top2012-title\"]");
    private List<WebElement> articles;

    public TabBusinessDesktop(CoreFunсtions cf){
        this.core = cf;
    }

    public void hello(){
        System.out.println("Hello");

        articles = core.getArticleNames(TITLES);
        System.out.println(articles.get(0).getText());
        System.out.println(articles.get(1).getText());
        System.out.println(articles.get(2).getText());
    }


   // public String articleNames(int titleNumber) {
    //    LOGGER.info("Getting Article Names: ");
    //    System.out.println(articles);
     //}



}
