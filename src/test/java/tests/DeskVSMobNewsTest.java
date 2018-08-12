package tests;

import coreFunctions.CoreFunсtions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Test;
import pageObjects.desktop.TabBusinessDesktop;
import pageObjects.desktop.TabReporterDesktop;
import pageObjects.mobile.TabBusinessMobile;
import pageObjects.mobile.TabReporterMobile;


public class DeskVSMobNewsTest {
    private CoreFunсtions core = new CoreFunсtions();

    private TabBusinessDesktop businessDesktop = new TabBusinessDesktop(core);
    private TabReporterDesktop reporterDesktop = new TabReporterDesktop(core);

    private TabBusinessMobile businessMobile = new TabBusinessMobile(core);
    private TabReporterMobile reporterMobile = new TabReporterMobile(core);

    @Test
    public void print3BusinessNewsDesk(){
        core.checkNews(businessDesktop.getNewsList(), businessMobile.getNewsList());
        core.checkNews(reporterDesktop.getNewsList(), reporterMobile.getNewsList());
        core.closeDriver();
    }

}
