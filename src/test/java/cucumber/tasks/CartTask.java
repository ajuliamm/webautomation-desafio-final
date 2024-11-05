package cucumber.tasks;

import cucumber.pages.CartPage;
import cucumber.utils.ClientFake;
import cucumber.utils.Waits;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class CartTask extends CartPage {

    private WebDriver driver;
    private Waits wait;

    private ClientFake clientFake = new ClientFake();


    public CartTask(WebDriver driver){
        this.driver = driver;
        this.wait = new Waits(driver);

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);

    }

    public void fazerPedido(){

        validarTotal();

        botaoPlaceOrder.click();

        preencherFormCompra();

        botaoPurchase.click();


    }

    public void validarTotal(){
        Integer somaTotal = 0;

        for (WebElement item : linhaDaTabelaDoCarrinho) {
            List<WebElement> colunas = item.findElements(By.tagName("td"));
            if (colunas.size() >= 3) {
                somaTotal += Integer.parseInt(colunas.get(2).getText());
            }
        }
        Integer totalCarrinhoValor = Integer.parseInt(totalCarrinho.getText());

        Assert.assertEquals(somaTotal, totalCarrinhoValor);

        clientFake.setTotalUltimaCompra(somaTotal);


    }

    public void preencherFormCompra(){
        wait.waitVisibily(inputName).sendKeys(clientFake.getName());
        inputCountry.sendKeys(clientFake.getCountry());
        inputCity.sendKeys(clientFake.getCity());
        inputCard.sendKeys(clientFake.getCreditCart());
        inputMonth.sendKeys(clientFake.getMonth());
        inputYear.sendKeys(clientFake.getYear());
    }


    public void validarPedidoFinalizado() {
        Assert.assertTrue(modalText.getText().contains("Thank you for your purchase!"));
        validarDadosDaCompra();
        botaoOK.click();
    }

    public void validarDadosDaCompra(){
        String[] dadosDaCompras = dadosDaCompra.getText().split("\n");

        String nomeCliente = dadosDaCompras[3].substring(6);
        String numeroCartaoClient = dadosDaCompras[2].substring(13);
        Integer totalCompra = Integer.parseInt(dadosDaCompras[1].substring(8, 11));


        Assert.assertEquals(nomeCliente,clientFake.getName());
        Assert.assertEquals(numeroCartaoClient,clientFake.getCreditCart());
        Assert.assertEquals(totalCompra,clientFake.getTotalUltimaCompra());
    }
}
