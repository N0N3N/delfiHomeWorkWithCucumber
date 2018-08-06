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

    private String[] deskList = {"","",""};
    private String[] mobList = {"","",""};

    @Test
    public void print3BusinessNewsDesk(){

        homeDesk.clickTabName(TAB_NAMES_LV.get(0));
        //businessDesk.getNewsList();
        deskList = businessDesk.getNewsList();
        //homeMob.clickTabName(TAB_NAMES_LV.get(0));
        mobList = businessMob.getNewsList();
        //System.out.println(mobList[2]);
        deskList[0]="000";
        mobList[0]="000";

        for (int i = 0; i<3; i++){
            System.out.println("Nr. "+i);
            if (deskList[i] == mobList[i])
                System.out.println("Same");
            else
                System.out.println("Not same");
        }
        core.closeDriver();
    }
}
