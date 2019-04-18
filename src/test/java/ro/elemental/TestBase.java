package ro.elemental;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestBase {

    String email = "erdelyizsoltcsaba@gmail.com";
    String password = "Joshua12";

    protected WebDriver driver=DriverManager.getDriver();

    public void waitForPageToLoad(long timeoutMillis) {
        do {
            long waitTime = 1000;
            try {
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                System.out.println("Wait interrupted. " + e.getMessage());
            }

            timeoutMillis -= waitTime;
            System.out.println("Waiting for page to load. Remaining millis: " +
                    timeoutMillis);
        } while (timeoutMillis > 0 && !((JavascriptExecutor) driver)
                .executeScript("return document.readyState")
                .equals("complete"));

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
