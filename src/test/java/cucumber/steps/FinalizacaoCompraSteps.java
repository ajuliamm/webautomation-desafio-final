package cucumber.steps;

import cucumber.TestBase;
import cucumber.pages.GenericHeaderPage;
import cucumber.tasks.CartTask;
import cucumber.tasks.GenericHeaderTask;
import cucumber.tasks.HomeTask;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class FinalizacaoCompraSteps extends TestBase {

    HomeTask homeTask = new HomeTask(getDriver());
    GenericHeaderTask genericHeaderTask = new GenericHeaderTask(getDriver());
    CartTask cartTask = new CartTask(getDriver());



    public FinalizacaoCompraSteps(){}

    @Dado("que estou na pagina inicial")
    public void navegarParaPaginaInicial(){
        driver.get(URL);
    }

    @Dado("que clico no link de Monitores")
    public void clicarNoLinkMonitors(){homeTask.clicarNoLinkMonitors();}

    @E("clico em um monitor da lista")
    public void clicarEmUmMonitor(){homeTask.clicarEmUmMonitor();}

    @E("adiciono o item no carrinho")
    public void adicionarItemNoCarrinho(){homeTask.adicionarProdutoAoCarrinho();}

    @Quando("acesso o menu card")
    public void acessarMenuCard(){genericHeaderTask.acessarMenuCart();}

    @E("finalizo o pedido")
    public void finalizarPedido(){
        cartTask.fazerPedido();
    }

    @Entao("o pedido deve ser finalizado com sucesso")
    public  void validarPedidoFinalizado(){
        cartTask.validarPedidoFinalizado();
    }
}
