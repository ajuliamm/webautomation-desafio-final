package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    protected static WebDriver driver;
    public static String URL = "https://www.demoblaze.com/index.html";

    public static WebDriver startDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximize");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        return driver;
    }

    public static WebDriver getDriver(){
        if(driver == null){
            startDriver();
        }
        return driver;

    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
