package br.com.rsinet.HUB_BDD.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.manager.DriverFactory;
import br.com.rsinet.HUB_BDD.manager.PageObjectManager;
import br.com.rsinet.HUB_BDD.pageObjects.CategoriaProdutoPage;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.pageObjects.ProdutoPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class AcessarUmProdutoPelaHomeSteps {

	private HomePage homePage;
	private CategoriaProdutoPage categoriaProdutoPage;
	private ProdutoPage produtoPage;
	private WebDriver driver;
	private PageObjectManager objectManager;

	public AcessarUmProdutoPelaHomeSteps() {
		driver = DriverFactory.getDriver();
		objectManager = new PageObjectManager(driver);
		homePage = objectManager.getHomePage();
		categoriaProdutoPage = objectManager.getCategoriaProdutoPage();
		produtoPage = objectManager.getProdutoPage();

	}

	@Dado("^clico na categoria \"([^\"]*)\"$")
	public void clicoNaCategoria(String arg1) {

		homePage.clicarCategoria(arg1);
	}

	@Entao("^deve abrir a pagina da gategoria \"([^\"]*)\"$")
	public void deveAbrirAPaginaDaGategoria(String arg1) {
		String url = homePage.urlAtual().toLowerCase();
		assertTrue(url.contains(arg1.toLowerCase()));

	}

	@Entao("^clico no produto \"([^\"]*)\"$")
	public void clicoNoProduto(String arg1) {

		categoriaProdutoPage.ClicarEm(arg1);

	}

	@Entao("^aparecera a pagina do produto \"([^\"]*)\"$")
	public void apareceraAPaginaDoProduto(String arg1) {
		assertEquals(arg1.toLowerCase(), produtoPage.nomeDoProduto().toLowerCase());
	}

	@Entao("^deve nao abrir a pagina da gategoria \"([^\"]*)\"$")
	public void deveNaoAbrirAPaginaDaGategoria(String arg1) {
		String url = produtoPage.urlAtual().toLowerCase();
		assertFalse(url.contains(arg1.toLowerCase()));
	}
}
