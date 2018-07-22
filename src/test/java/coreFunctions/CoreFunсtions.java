package coreFunctions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CoreFunсtions {
    private WebDriver driver;
    private static final String CHROME_DRIVER_LOCATION = "C://driver/chromedriver.exe";
    private static final Logger LOGGER = LogManager.getLogger(CoreFunсtions.class);

    public CoreFunсtions() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
        this.driver = new ChromeDriver();
    }

    public void openWebPage(String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        LOGGER.info("Opening web page: " + url);
        driver.get(url);
    }

    public void closeDriver(){
        driver.close();
    }

    public WebElement getWebElements(By element, int titleNumber) {
        return driver.findElements(element).get(titleNumber);
    }

    public WebElement getWebElement(By element) {
        return driver.findElement(element);
    }

    public List<WebElement> getArticleNames(By path){
        Assert.assertFalse("Element NOT found", driver.findElements(path).isEmpty());
        List<WebElement> articles = driver.findElements(path);
        return articles;
    }

}
