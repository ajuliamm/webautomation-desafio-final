package cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage {

    @FindBy(xpath = "//button[contains(text(), 'Place Order')]")
    public static WebElement botaoPlaceOrder;

    @FindBy(xpath = "//button[contains(text(), 'Purchase')]")
    public static WebElement botaoPurchase;

    @FindBy(id = "name")
    public static WebElement inputName;

    @FindBy(id = "country")
    public static WebElement inputCountry;

    @FindBy(id = "city")
    public static WebElement inputCity;

    @FindBy(id = "card")
    public static WebElement inputCard;

    @FindBy(id = "month")
    public static WebElement inputMonth;

    @FindBy(id = "year")
    public static WebElement inputYear;

    @FindBy(xpath = "/*//div[@class='sweet-alert showSweetAlert visible ']")
    public static WebElement modalPedidoFinalizado;

    @FindBy(xpath = "//h2[contains(text(), 'purchase')]")
    public static WebElement modalText;

    @FindBy(xpath = "//button[contains(text(), 'OK')]")
    public static WebElement botaoOK;

    @FindBy(xpath = "//button[contains(text(), 'Close')]")
    public static WebElement botaoClose;

    @FindBy(id= "tbodyid")
    public static WebElement tabelaDoCarrinho;

    @FindBy(xpath= "//tr[@class='success']")
    public static List<WebElement> linhaDaTabelaDoCarrinho;

    @FindBy(id= "totalp")
    public static WebElement totalCarrinho;

    @FindBy(xpath= "//p[@class = 'lead text-muted ']")
    public static WebElement dadosDaCompra;

}
