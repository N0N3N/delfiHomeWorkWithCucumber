package coreFunctions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


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

    public void closeDriver() {
        driver.close();
    }


    public List<WebElement> getListOfElements(By path) {
        Assert.assertFalse("Elements NOT found", driver.findElements(path).isEmpty());
        List<WebElement> elements = driver.findElements(path);
        return elements;
    }

    public boolean isElementPresent(By path) {
        return getListOfElements(path).isEmpty();
    }

    public void checkNews(String[][] deskSum, String[][] mobSum) {
        LOGGER.info("Checking news from Mob. and Desk. versions");
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nr." + i + "  " + deskSum[0][i] + " " + deskSum[1][i] + " VS " + mobSum[0][i] + " " + mobSum[1][i]);
            if (deskSum[0][i].contains(mobSum[0][i])) {
                System.out.print("Same Name      ");
            } else
                System.out.print("Different Name     ");

            if (deskSum[1][i].contains(mobSum[1][i])) {
                System.out.println("Same Comment count");
                System.out.println(" ");
            } else {
                System.out.println("Different Comment count");
                System.out.println(" ");
            }
        }
    }


    public List<WebElement> getNewsElements(By NEWS) {
        List<WebElement> newsElements = driver.findElements(NEWS);
        return newsElements;
    }

    public String[][] getNewsAttributes(By NEWS, By a1, By a2) {
        String[][] sum = {{"", "", ""}, {"", "", ""}};
        LOGGER.info("Getting list of news:");
        //System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            sum[0][i] = getNewsElements(NEWS).get(i).findElement(a1).getText();
            System.out.print(i + " " + sum[0][i]);
            sum[1][i] = getNewsElements(NEWS).get(i).findElement(a2).getText();
            System.out.println(" " + sum[1][i]);
        }

        return sum;

    }

    public String[][] getNewsAttributesForRepMobile(By NEWS, By a1, By a2) {
        String[][] sum = {{"", "", ""}, {"", "", ""}};
        LOGGER.info("Getting list of news:");
        //System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            sum[0][i] = getNewsElements(NEWS).get(i+1).findElement(a1).getText();
            System.out.print(i + " " + sum[0][i]);
            sum[1][i] = getNewsElements(NEWS).get(i+1).findElement(a2).getText();
            System.out.println(" " + sum[1][i]);
        }

        return sum;

    }
}
