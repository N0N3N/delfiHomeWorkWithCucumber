package tests;

import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.desktop.HomePageDesktop;
import pageObjects.desktop.TabBusinessDesktop;
import pageObjects.desktop.TabReporterDesktop;
import pageObjects.desktop.TabWomanDesktop;
import pageObjects.mobile.HomePageMobile;
import pageObjects.mobile.TabBusinessMobile;
import pageObjects.mobile.TabReporterMobile;
import pageObjects.mobile.TabWomanMobile;

import java.util.List;

public class TestFirstThreeNews {
    private CoreFunсtions core = new CoreFunсtions();
    private static final Logger LOGGER = LogManager.getLogger(TestFirstThreeNews.class);

    private HomePageDesktop homeD = new HomePageDesktop(core);
    private TabBusinessDesktop biznesD = new TabBusinessDesktop(core);
    private TabReporterDesktop reportD = new TabReporterDesktop(core);
    private TabWomanDesktop womanD = new TabWomanDesktop(core);

    private HomePageMobile homeM = new HomePageMobile(core);
    private TabBusinessMobile biznesM = new TabBusinessMobile(core);
    private TabReporterMobile reportM = new TabReporterMobile(core);
    private TabWomanMobile womanM = new TabWomanMobile(core);

    private List<WebElement> bizD;
    private List<WebElement> repD;
    private List<WebElement> womD;
    private List<WebElement> bizM;
    private List<WebElement> repM;
    private List<WebElement> womM;


    private static final int BIZ = 2;
    private static final int REP = 3;
    private static final int WOM = 7;


    public List<WebElement> collectBusinessDesk() {

        LOGGER.info("Click Business TAB desk");
        homeD.clickTab(BIZ);

        LOGGER.info("Collecting News from Desktop");
        bizD = biznesD.getNewsList();
        return bizD;
    }

    public List<WebElement> collectReporterDesk(){

        LOGGER.info("Click Reporter TAB desk");
        homeD.clickTab(REP);

        LOGGER.info("Collecting News from Desktop");
        repD = reportD.getNewsList();
        return repD;
    }

    public List<WebElement> collectWomanDesk(){

        LOGGER.info("Click Woman TAB desk");
        homeD.clickTab(WOM);

        LOGGER.info("Collecting News from Desktop");
        womD = womanD.getNewsList();
        return womD;
    }

    public void afterTest(){
        LOGGER.info("Printing data");

        core.closeDriver();
    }

    @Test
    public void testNews(){

        homeD.openHomePageDesk();
        collectBusinessDesk();

        homeD.openHomePageDesk();
        collectReporterDesk();

        homeM.openHomePageMob();

        //openHomePageDesk();
        //collectWomanDesk();

        afterTest();
    }
}
