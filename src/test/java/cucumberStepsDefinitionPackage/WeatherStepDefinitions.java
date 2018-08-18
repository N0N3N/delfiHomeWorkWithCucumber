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

    //////////////////////

    @Then("weather_id is (.*)")
    public void checkLat(int id){
        assertEquals("Wrong LAT ", id, response.getCoord().getLat());

    }

    @Then("main is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("description is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("icon is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("base is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("temp is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("pressure is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("humidity is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("temp_min is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("temp_max is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("visibility is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("speed is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("deg is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("all is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("dt is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("type is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("sys_id is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("message is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("country is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("sunrise is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("sunset is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("id is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("name is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

    @Then("cod is (.*)")
    public void checkLat(BigDecimal lat){
        assertEquals("Wrong LAT ", lat, response.getCoord().getLat());

    }

}
