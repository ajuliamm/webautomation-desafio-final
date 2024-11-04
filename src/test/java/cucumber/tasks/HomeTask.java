package cucumber.tasks;

import cucumber.pages.HomePage;
import cucumber.utils.Waits;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomeTask extends HomePage {

    private WebDriver driver;
    private Waits wait;

    public HomeTask(WebDriver driver){
        this.driver = driver;
        this.wait = new Waits(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void clicarNoLinkMonitors(){monitorsLink.click();}

    public void clicarEmUmMonitor(){
        wait.waitVisibily(Monitor01);
        Monitor01.click();
    }

    public void adicionarProdutoAoCarrinho(){
        botaoAddNoCard.click();

        wait.waitAlertIsPresent();

        Alert alert = driver.switchTo().alert();
        String alertTexto = alert.getText();
        Assert.assertEquals("Product added", alertTexto);

        alert.accept();

    }
}
