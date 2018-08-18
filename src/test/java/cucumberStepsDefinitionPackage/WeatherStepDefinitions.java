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

    @Then("weather_id is (.*)")
    public void checkWeatherId(int id){
        assertEquals("Wrong id ", id, response.getWeather().getId());

    }

    @Then("main is (.*)")
    public void checkMain(String main){
        assertEquals("Wrong main ", main, response.getWeather().getMain());

    }

    @Then("description is (.*)")
    public void checkDescription(String description){
        assertEquals("Wrong description ", description, response.getWeather().getDescription());

    }

    @Then("icon is (.*)")
    public void checkIcon(String icon){
        assertEquals("Wrong icon ", icon, response.getWeather().getIcon());

    }

    @Then("base is (.*)")
    public void checkBase(String base){
        assertEquals("Wrong base ", base, response.getBase());

    }

    @Then("temp is (.*)")
    public void checkTemp(BigDecimal temp){
        assertEquals("Wrong temp ", temp, response.getMain().getTemp());

    }

    @Then("pressure is (.*)")
    public void checkPressure(int pressure){
        assertEquals("Wrong pressure ", pressure, response.getMain().getPressure());

    }

    @Then("humidity is (.*)")
    public void checkHumidity(int humidity){
        assertEquals("Wrong humidity ", humidity, response.getMain().getHumidity());

    }

    @Then("temp_min is (.*)")
    public void checkTemp_min(BigDecimal temp_min){
        assertEquals("Wrong temp_min ", temp_min, response.getMain().getTemp_min());

    }

    @Then("temp_max is (.*)")
    public void checkTemp_max(BigDecimal temp_max){
        assertEquals("Wrong temp_max ", temp_max, response.getMain().getTemp_max());

    }

    @Then("visibility is (.*)")
    public void checkVisibility(String visibility){
        assertEquals("Wrong visibility ", visibility, response.getVisibility());

    }

    @Then("speed is (.*)")
    public void checkSpeed(BigDecimal speed){
        assertEquals("Wrong speed ", speed, response.getWind().getSpeed());

    }

    @Then("deg is (.*)")
    public void checkDeg(int deg){
        assertEquals("Wrong deg ", deg, response.getWind().getDeg());

    }

    @Then("all is (.*)")
    public void checkAll(int all){
        assertEquals("Wrong all ", all, response.getClouds().getAll());

    }

    @Then("dt is (.*)")
    public void checkDt(int dt){
        assertEquals("Wrong dt ", dt, response.getDt());

    }

    @Then("type is (.*)")
    public void checkType(int type){
        assertEquals("Wrong type ", type, response.getSys().getType());

    }

    @Then("sys_id is (.*)")
    public void checkSysId(int id){
        assertEquals("Wrong id ", id, response.getSys().getId());

    }

    @Then("message is (.*)")
    public void checkMessage(BigDecimal message){
        assertEquals("Wrong message ", message, response.getSys().getMessage());

    }

    @Then("country is (.*)")
    public void checkCountry(String country){
        assertEquals("Wrong country ", country, response.getSys().getCountry());

    }

    @Then("sunrise is (.*)")
    public void checkSunrise(int sunrise){
        assertEquals("Wrong sunrise ", sunrise, response.getSys().getSunrise());

    }

    @Then("sunset is (.*)")
    public void checkSunset(int sunset){
        assertEquals("Wrong sunset ", sunset, response.getSys().getSunset());

    }

    @Then("id is (.*)")
    public void checkId(int id){
        assertEquals("Wrong id ", id, response.getId());

    }

    @Then("name is (.*)")
    public void checkName(String name){
        assertEquals("Wrong name ", name, response.getName());

    }

    @Then("cod is (.*)")
    public void checkCod(int cod){
        assertEquals("Wrong cod ", cod, response.getCod());

    }

}
