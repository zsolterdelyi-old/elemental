package ro.elemental;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

    private static WebDriver driver = null;


    public static WebDriver initDriver(String browser) {
        switch (browser.toLowerCase()) {

//            default:
//                System.out.printf("Default driver for Chrome...");
            case "chrome":
                System.setProperty("webdriver.chrome.driver", Appconfig.getChromeDriverPath());
                driver = new ChromeDriver();
                break;
            case "macchrome":
                System.setProperty("webdriver.chrome.driver", Appconfig.getMacChromeDriverPath());
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", Appconfig.getGeckoDriverPath());
                driver = new FirefoxDriver();
                break;
            case "macfirefox":
                System.setProperty("webdriver.gecko.driver", Appconfig.getMacGeckoDriverPath());
                driver = new FirefoxDriver();
                break;
            case "internet explorer":
                System.setProperty("webdriver.ie.driver", Appconfig.getIeDriverPath());
                driver = new InternetExplorerDriver();
                break;

        }


//        driver.manage().window().maximize();
        return driver;
    }


    public static WebDriver getDriver() {
        return driver;
    }
}
