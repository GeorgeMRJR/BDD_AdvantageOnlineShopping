package br.com.rsinet.HUB_BDD.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.HUB_BDD.pageObjects.BasePage;
import br.com.rsinet.HUB_BDD.pageObjects.ProdutoPage;
import br.com.rsinet.HUB_BDD.suporte.Web;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class BuscarUmProdutoPelaBuscaSteps {
	private WebDriver driver;
	private BasePage page;
	private ProdutoPage produtoPage;

	@Before
	public void setUp() {
		driver = Web.inicializarDriver();
		page = PageFactory.initElements(driver, BasePage.class);
		produtoPage = PageFactory.initElements(driver, ProdutoPage.class);
	}

	@Dado("^o usuario clicou no icone da lupa$")
	public void queOUsuarioClicouNoIconeDaLupa() {
		page.clicarLupa();
	}

	@Dado("^digitou no campo de busca \"([^\"]*)\"$")
	public void digitouNoCampoDeBusca(String arg1) {
		page.digitarBusca(arg1);
	}

	@Entao("^devera aparecer o resultado$")
	public void deveraAparecerOResultado() {
		String oResultado = page.encontrouOResultado();
		System.out.println(">>>>>>>>>>>>>>>>>>"+oResultado);
	}

	@Entao("^o usuario clicou no resultado$")
	public void oUsuarioClicouNoResultado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^a tela do produto \"([^\"]*)\" devera abrir$")
	public void aTelaDoProdutoDeveraAbrir(String arg1) {
		String nomeDoProduto = produtoPage.nomeDoProduto();
		System.out.println("<>>>>>>" + nomeDoProduto);
		System.out.println("<>>>>>>" + arg1);
	}
}
