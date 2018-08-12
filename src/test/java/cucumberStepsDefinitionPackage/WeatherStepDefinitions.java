package cucumberStepsDefinitionPackage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WeatherStepDefinitions {
    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response;

    @When("we getting weather from server")
    public void getWeather(){
        response = weatherRequester.getWeather();
    }

    @Then("lon is (.*)")
    public void checkLon(BigDecimal lon){
        assertEquals("Wrong LON ", lon, response.getCoord().getLon());

    }

    @Then("lat is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }
}
