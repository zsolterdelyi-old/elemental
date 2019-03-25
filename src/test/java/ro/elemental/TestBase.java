package ro.elemental;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestBase {

    protected WebDriver driver;

    @Before
    public void testSetup(){
        String browser= System.getProperty("browser", "chrome");
        driver = DriverManager.initDriver(browser);
       driver.get(Appconfig.getSiteUrl());
        System.out.printf("Your Homepage is opened. ");



    }

    @After
    public void testDown(){


    }
}
