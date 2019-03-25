package ro.elemental;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Appconfig {

    private static Properties properties = new Properties();

    static {

        InputStream inputStream = Appconfig.class.getClassLoader().getResourceAsStream("production.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String chromeDriverPath=properties.getProperty("chrome.driver.path");
    private static String geckoDriverPath=properties.getProperty("gecko.driver.path");
    private static String ieDriverPath=properties.getProperty("ie.driver.path");
    private static String macChromeDriverPath=properties.getProperty("mac.chrome.driver.path");
    private static String macGeckoDriverPath=properties.getProperty("mac.gecko.driver.path");



    private static String siteUrl = properties.getProperty("site.url");

    public static String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public static String getGeckoDriverPath() {
        return geckoDriverPath;
    }

    public static String getIeDriverPath() {
        return ieDriverPath;
    }



    public static String getMacChromeDriverPath() {
        return macChromeDriverPath;
    }

    public static String getMacGeckoDriverPath() {
        return macGeckoDriverPath;
    }

    public static String getSiteUrl() {
        return siteUrl;
    }
}
