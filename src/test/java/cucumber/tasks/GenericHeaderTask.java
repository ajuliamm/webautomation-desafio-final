package cucumber.tasks;

import cucumber.pages.GenericHeaderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class GenericHeaderTask extends GenericHeaderPage {

    private WebDriver driver;

    public GenericHeaderTask(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void acessarMenuCart(){cartLinkMenu.click();}
}
