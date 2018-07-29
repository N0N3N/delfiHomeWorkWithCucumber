package coreFunctions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import static java.lang.Boolean.TRUE;

public class CoreFunсtions {
    private WebDriver driver;
    private static final String CHROME_DRIVER_LOCATION = "C://driver/chromedriver.exe";
    private static final Logger LOGGER = LogManager.getLogger(CoreFunсtions.class);

    public CoreFunсtions() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
        this.driver = new ChromeDriver();
    }

    public void openWebPage(String url) {
        if (!url.contains("http://") && !url.contains("https://")) { url = "http://" + url; }
        LOGGER.info("Opening web page: " + url);
        driver.get(url);
    }

    public void closeDriver(){
        driver.close();
    }

    public WebElement getWebElementFromList(By element, int titleNumber) {
        return driver.findElements(element).get(titleNumber);
    }

    public WebElement getWebElement(By path) {
        return driver.findElement(path);
    }

    public List<WebElement> getArticleNames(By path){
        Assert.assertFalse("Element NOT found", driver.findElements(path).isEmpty());
        List<WebElement> articles = driver.findElements(path);
        return articles;
    }

    public void clickElement(By path){
        driver.findElement(path).click();
    }

    public List<WebElement> getListOfElements (By path){
        Assert.assertFalse("Elements NOT found", driver.findElements(path).isEmpty());
        List<WebElement> elements = driver.findElements(path);
        return elements;
    }


    public boolean isElementPresent(By path){
        return getListOfElements(path).isEmpty();
    }



}
