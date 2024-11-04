package cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


    @FindBy(xpath = "//a[@onclick=\"byCat('monitor')\"]")
    public static WebElement monitorsLink;

    @FindBy(xpath = "//div[@id='tbodyid']//a[contains(text(), 'monitor')]")
    public static WebElement Monitor01;

    @FindBy(xpath = "//a[contains(text(), 'Add to cart')]")
    public static WebElement botaoAddNoCard;

}
