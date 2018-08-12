package cucumberStepsDefinitionPackage;

import coreFunctions.CoreFunсtions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class StepsDefinition {
    CoreFunсtions core = new CoreFunсtions();

    @Given("Opening webpage (.*)")
    public void cucumberOpenWebPage(String webPage){
        core.openWebPage(webPage);
    }

    @When("we are searching for (.*)")
    public void search() {
        System.out.println("Hello");
    }

}