package cucumberStepsDefinitionPackage;

import coreFunctions.CoreFunсtions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class StepsDefinition {
    CoreFunсtions core = new CoreFunсtions();
    private static final String HOME_PAGE_DESKTOP = "rus.delfi.lv";

    @Given("Delfi home page")
    public void open_home_webpage() {
        core.openWebPage(HOME_PAGE_DESKTOP);
    }

    @When("we are searching for (.*)")
    public void search() {
        System.out.println("Hello");
    }

}