package ro.elemental.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import ro.elemental.Appconfig;
import ro.elemental.DriverManager;

public class Hooks {

    @Before
    public void setup(Scenario scenario){

        String browser= System.getProperty("browser", "macchrome");
        DriverManager.initDriver(browser);



    }
   @After
    public void tearDown (Scenario scenario) throws InterruptedException {

        Thread.sleep(500);
//      DriverManager.getDriver().quit();


    }
}
