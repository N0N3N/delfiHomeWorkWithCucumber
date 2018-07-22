package tests;

import coreFunctions.CoreFunсtions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjects.desktop.HomePageDesktop;
import pageObjects.desktop.TabBusinessDesktop;

public class TestFirstThreeNews {
    private CoreFunсtions core = new CoreFunсtions();
    private static final Logger LOGGER = LogManager.getLogger(TestFirstThreeNews.class);

    private HomePageDesktop homeD = new HomePageDesktop(core);
    private TabBusinessDesktop biznesD = new TabBusinessDesktop(core);

    private static final int Biznes = 2;
    private static final int Reporter = 3;
    private static final int Woman = 7;

    private static final String HOME_PAGE_DESKTOP = "rus.delfi.lv";

    @Test
    public void HomePage(){
        LOGGER.info("Open HomePage for Desktop");
        core.openWebPage(HOME_PAGE_DESKTOP);

        LOGGER.info("Click Business TAB desk");
        homeD.clickTab(Biznes);

        LOGGER.info("Collecting News Names");
        biznesD.hello();





    }


}
