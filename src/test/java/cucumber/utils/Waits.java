package cucumber.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Waits {
    WebDriver driver;

    private static final Duration MAX_DURATION = Duration.ofSeconds(30);

    private static final Duration POOL_DURATION = Duration.ofSeconds(2);

    public Waits (WebDriver driver){
        this.driver = driver;
    }

    public WebElement waitVisibily(WebElement element){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        return  wait.until(ExpectedConditions.visibilityOf(element));
    }

    public Alert waitAlertIsPresent(){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        return wait.until(ExpectedConditions.alertIsPresent());

    }
}
