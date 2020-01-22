package br.com.rsinet.HUB_BDD.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageObjects.BasePage;
import br.com.rsinet.HUB_BDD.pageObjects.CategoriaProdutoPage;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.pageObjects.ProdutoPage;
import br.com.rsinet.HUB_BDD.pageObjects.manager.PageObjectManager;
import br.com.rsinet.HUB_BDD.suporte.Web;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class AcessarUmProdutoPelaHomeSteps {

	private HomePage homePage;
	private BasePage basePage;
	private CategoriaProdutoPage categoriaProdutoPage;
	private ProdutoPage produtoPage;
	private WebDriver driver;
	private PageObjectManager objectManager;

	@Dado("^clico na categoria \"([^\"]*)\"$")
	public void clicoNaCategoria(String arg1) {
		driver = Web.inicializarDriver();
		objectManager = new PageObjectManager(driver);
		homePage = objectManager.getHomePage();

		homePage.clicarCategoria(arg1);
	}

	@Entao("^deve abrir a pagina da gategoria \"([^\"]*)\"$")
	public void deveAbrirAPaginaDaGategoria(String arg1) {
		basePage = objectManager.getBasePage();
		String url = basePage.urlAtual().toLowerCase();
		assertTrue(url.contains(arg1.toLowerCase()));

	}

	@Entao("^clico no produto \"([^\"]*)\"$")
	public void clicoNoProduto(String arg1) {

		categoriaProdutoPage = objectManager.getCategoriaProdutoPage();
		categoriaProdutoPage.ClicarEm(arg1);

	}

	@Entao("^aparecera a pagina do produto \"([^\"]*)\"$")
	public void apareceraAPaginaDoProduto(String arg1) {
		produtoPage = objectManager.getProdutoPage();
		assertEquals(arg1.toLowerCase(), produtoPage.nomeDoProduto().toLowerCase());
	}

	@Entao("^deve nao abrir a pagina da gategoria \"([^\"]*)\"$")
	public void deveNaoAbrirAPaginaDaGategoria(String arg1) {
		String url = basePage.urlAtual().toLowerCase();
		assertFalse(url.contains(arg1.toLowerCase()));
	}
}
