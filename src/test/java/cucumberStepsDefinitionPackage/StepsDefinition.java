package cucumberStepsDefinitionPackage;

import coreFunctions.CoreFunсtions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepsDefinition {
    CoreFunсtions core = new CoreFunсtions();

    @Given("Opening webpage (.*)")
    public void cucumberOpenWebPage(String webPage){
        core.openWebPage(webPage);
    }

    @When("We are searching for (.*) and clicking it")
    public void search(String tabName) {
        System.out.println(tabName);
    }

    @Then("We get the name of first Article")
    public void getArticle(){
        System.out.println("HellO!");
    }

}