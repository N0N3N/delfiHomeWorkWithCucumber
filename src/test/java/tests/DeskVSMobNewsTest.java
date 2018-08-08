package tests;

import com.google.common.collect.ImmutableList;
import coreFunctions.CoreFunсtions;
import org.junit.Test;
import pageObjects.desktop.HomePageDesktop;
import pageObjects.desktop.TabBusinessDesktop;
import pageObjects.desktop.TabReporterDesktop;
import pageObjects.desktop.TabWomanDesktop;
import pageObjects.mobile.HomePageMobile;
import pageObjects.mobile.TabBusinessMobile;
import pageObjects.mobile.TabReporterMobile;
import pageObjects.mobile.TabWomanMobile;


public class DeskVSMobNewsTest {
    private CoreFunсtions core = new CoreFunсtions();

    private HomePageDesktop homeDesk = new HomePageDesktop(core);
    private TabBusinessDesktop businessDesk = new TabBusinessDesktop(core);
    private TabReporterDesktop reporterDesk = new TabReporterDesktop(core);
    private TabWomanDesktop womanDesk = new TabWomanDesktop(core);

    private HomePageMobile homeMob = new HomePageMobile(core);
    private TabBusinessMobile businessMob = new TabBusinessMobile(core);
    private TabReporterMobile reporterMob = new TabReporterMobile(core);
    private TabWomanMobile womanMob = new TabWomanMobile(core);

    public static final ImmutableList<String> TAB_NAMES = ImmutableList.of("Бизнес", "Репортер", "Woman");
    public static final ImmutableList<String> TAB_NAMES_LV = ImmutableList.of("Bizness", "Aculiecinieks", "Viņa");

    private String[][] deskList = {{"", "", ""}, {"", "", ""}};
    private String[][] mobList = {{"", "", ""}, {"", "", ""}};
    //private String[] deskList = {"", "", ""};
    //private String[] mobList = {"", "", ""};

    @Test
    public void print3BusinessNewsDesk(){

        //homeDesk.clickTabName(TAB_NAMES_LV.get(0));
        //deskList[0][0]="Gada laikā cenas augušas par 2,6%(4)"; // For check!
        //mobList[0][0]="Gada laikā cenas augušas par 2,6%(4)";
        deskList = businessDesk.getNewsList();
        mobList = businessMob.getNewsList();
        core.checkNews(deskList, mobList);

        deskList = reporterDesk.getNewsList();
        mobList = reporterMob.getNewsList();
        core.checkNews(deskList, mobList);

        // No Women version since there is NO Mob version at all!

/*
        deskList = businessDesk.getNewsListSimple();
        mobList = businessMob.getNewsListSimple();
        core.checkNewsSimle(deskList, mobList);
*/

        core.closeDriver();
    }
}
